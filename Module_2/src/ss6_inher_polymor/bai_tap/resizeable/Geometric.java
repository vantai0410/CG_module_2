package ss6_inher_polymor.bai_tap.resizeable;

public abstract class Geometric implements Resizeable {
    public Geometric() {
    }

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}
