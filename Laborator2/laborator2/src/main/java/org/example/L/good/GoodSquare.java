package org.example.L.good;

public class GoodSquare implements Shape{
    private int side;

    public GoodSquare(int side) {
        this.side = side;
    }
    public int getArea() {
        return side * side;
    }
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
