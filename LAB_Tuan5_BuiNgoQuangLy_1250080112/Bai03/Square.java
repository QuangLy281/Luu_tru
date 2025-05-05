package Bai03;
public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Hinh vuong side=" + getSide() + ", color=" + color + ", filled=" + filled;
    }
}
