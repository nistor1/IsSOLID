package org.example.I.good;

import org.example.I.ComplexInvoice;
import org.example.I.Invoice;

public class GoodInvoicePrinter implements GoodInvoicePrinter_I{
    public void print(Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("Printing complex invoice " + complexInvoice);
    }

}
