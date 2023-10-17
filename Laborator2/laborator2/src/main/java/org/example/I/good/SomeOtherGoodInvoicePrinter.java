package org.example.I.good;

import org.example.I.ComplexInvoice;
import org.example.I.Invoice;

public class SomeOtherGoodInvoicePrinter implements SomeOtherGoodInvoicePrinter_I{
    public void someOtherPrintMethod(Invoice invoice) {
        System.out.println("Printing the invoice in a totally different way "
                + invoice);
    }
}
