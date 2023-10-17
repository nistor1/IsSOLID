package org.example.I.bad;

import org.example.I.ComplexInvoice;
import org.example.I.Invoice;

public interface BadInvoicePrinter_I {

        void print(Invoice invoice);

        void printComplexInvoice(ComplexInvoice complexInvoice);

        void someOtherPrintMethod(Invoice invoice);

    }
