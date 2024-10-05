package ss6_inher_polymor.bai_tap.resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square(){}

    public Square(double side) {
        super(side,side);
    }

    @Override
    public String toString() {
        return "Square{side= " + getWidth() + "}";
    }

    @Override
    public void reSize(double percent) {

    }
}
