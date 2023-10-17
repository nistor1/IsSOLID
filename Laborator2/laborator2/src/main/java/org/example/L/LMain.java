package org.example.L;

import org.example.L.bad.BadGraphicsService;
import org.example.L.bad.BadRectangle;
import org.example.L.bad.BadSquare;
import org.example.L.good.GoodGraphicsService;
import org.example.L.good.GoodRectangle;
import org.example.L.good.GoodSquare;
import org.example.L.good.Shape;

public class LMain {
    public static void main(String[] args) {
        testBadL();
        testGoodL();
    }

    private static void testBadL() {
        BadRectangle actuallySquare = new BadSquare(20, 30);
        BadGraphicsService badGraphicsService = new BadGraphicsService();

        badGraphicsService.checkForArea(actuallySquare);
    }

    private static void testGoodL() {
        Shape rectangle = new GoodRectangle(29, 40);
        Shape square = new GoodSquare(20);
        GoodGraphicsService goodGraphicsService = new GoodGraphicsService();

        goodGraphicsService.checkForArea(rectangle);
        goodGraphicsService.checkForArea(square);

    }
}
