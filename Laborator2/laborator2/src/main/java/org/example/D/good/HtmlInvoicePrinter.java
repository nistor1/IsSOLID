package org.example.D.good;

import org.example.I.ComplexInvoice;
import org.example.I.Invoice;
import org.example.I.good.GoodInvoicePrinter_I;

public class HtmlInvoicePrinter implements GoodInvoicePrinter_I {

    @Override
    public void print(Invoice invoice) {
        System.out.println("invoice html printer");
    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("complex invoice html printer");
    }
}
