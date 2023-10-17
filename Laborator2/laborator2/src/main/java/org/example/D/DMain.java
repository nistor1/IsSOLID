package org.example.D;

import org.example.D.bad.BadPrintingService;
import org.example.D.good.GoodPrintingService;
import org.example.D.good.HtmlInvoicePrinter;
import org.example.I.Invoice;
import org.example.I.good.GoodInvoicePrinter;

public class DMain {

    public static void main(String[] args) {
//        testBadD();
        testGoodD();
    }

    private static void testBadD() {
        Invoice invoice = new Invoice(665);

        BadPrintingService badPrintingService = new BadPrintingService();
        badPrintingService.print(invoice);

        // now what?
        // badPrintingService = new BadPrintingService(new HtmlInvoicePrinter()); // but why!?
    }

    private static void testGoodD() {
        Invoice invoice = new Invoice(665);

        GoodPrintingService goodPrintingService = new GoodPrintingService( new GoodInvoicePrinter());
        goodPrintingService.print(invoice);

        goodPrintingService = new GoodPrintingService(new HtmlInvoicePrinter());
        goodPrintingService.print(invoice);
    }

}
