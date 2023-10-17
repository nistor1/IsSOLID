package org.example.O;

import org.example.O.bad.AnotherBadClient;
import org.example.O.bad.BadClient;
import org.example.O.bad.BadServer;
import org.example.O.good.AnotherGoodClient;
import org.example.O.good.Client_I;
import org.example.O.good.GoodClient;
import org.example.O.good.GoodServer;

public class OMain {

    public static void main(String[] args) {
        testBadO();
        testGoodO();
    }

    private static void testBadO() {
        BadClient client = new BadClient();
        BadServer server = new BadServer();
        server.reactToClient(client);

        AnotherBadClient anotherBadClient = new AnotherBadClient();
//        server.reactToClient(anotherBadClient);


    }

    private static void testGoodO() {
        Client_I client = new GoodClient();
        GoodServer server = new GoodServer();
        server.reactToClient(client);

        AnotherGoodClient anotherGoodClient = new AnotherGoodClient();
        server.reactToClient(anotherGoodClient);
    }

}
