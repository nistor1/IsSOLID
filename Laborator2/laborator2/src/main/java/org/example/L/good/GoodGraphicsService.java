package org.example.L.good;

import org.example.L.bad.BadRectangle;
import org.example.L.bad.BadSquare;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        if(shape instanceof GoodRectangle) {

            int height = 20;
            int width = 5;
            if (shape instanceof GoodRectangle) {
                GoodRectangle rectangle = (GoodRectangle) shape;
                rectangle.setHeight(height);
                rectangle.setWidth(width);

                verify(rectangle, width, height, "Rectangle");
            }
        } else if (shape instanceof GoodSquare) {
            int side = 20;
            if (shape instanceof GoodSquare) {
                GoodSquare square = (GoodSquare) shape;
                square.setSide(side);
                verify(square, side, side, "Square");
            }
        }
    }

    private void verify(Shape rectangle, int width, int height, String entity) {
        if (rectangle.getArea() == (width * height)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }
}
