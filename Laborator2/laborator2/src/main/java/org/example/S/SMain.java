package org.example.S;

import org.example.S.bad.*;
import org.example.S.good.*;

public class SMain {

    public static void main(String[] args) {
       // testBadS();
        testGoodS();
    }

    private static void testBadS() {
        BadEmployee employee = new BadEmployee("1", "BadEmployee", 5);
        employee.calculatePay();
        employee.reportHours();
        employee.save();

    }

    private static void testGoodS() {
        GoodEmployee employee = new GoodEmployee("1", "GoodEmployee!", 42);
        EmployeeAdditionalPaymentService additionalPaymentService = new EmployeeAdditionalPaymentService();
        EmployeePaymentService employeePaymentService = new EmployeePaymentService(additionalPaymentService);
        System.out.println(employeePaymentService.calculatePay(employee));

        EmployeeTimetrackingService employeeTimetrackingService = new EmployeeTimetrackingService();
        System.out.println(employeeTimetrackingService.reportHours(employee));

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee);

    }

}
