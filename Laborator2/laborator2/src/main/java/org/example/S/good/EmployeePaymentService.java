package org.example.S.good;

public class EmployeePaymentService {
    private EmployeeAdditionalPaymentService additionalPaymentService;
    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService) {
        this.additionalPaymentService = additionalPaymentService;
    }

    public int calculatePay(GoodEmployee employee) {
        switch (employee.getType()) {
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }

    }
}
