package org.example.D.good;

import org.example.I.Invoice;
import org.example.I.good.GoodInvoicePrinter;
import org.example.I.good.GoodInvoicePrinter_I;

public class GoodPrintingService {
    GoodInvoicePrinter_I invoicePrinter;
    public GoodPrintingService(GoodInvoicePrinter_I invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }
    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }
}
