package org.example.I.good;

import org.example.I.ComplexInvoice;
import org.example.I.Invoice;

public interface GoodInvoicePrinter_I {
    public void print(Invoice invoice);
    public void printComplexInvoice(ComplexInvoice complexInvoice);
}
