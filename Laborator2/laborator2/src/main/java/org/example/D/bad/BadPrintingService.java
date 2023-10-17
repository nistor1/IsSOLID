package org.example.D.bad;

import org.example.I.Invoice;
import org.example.I.good.GoodInvoicePrinter;

public class BadPrintingService {

    private GoodInvoicePrinter invoicePrinter; // notice the lack of an interface!

    public BadPrintingService() {
        this.invoicePrinter = new GoodInvoicePrinter();
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }

}
