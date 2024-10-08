package ss7_abstraction.Resizeable;

public abstract class Geometric implements Resizeable{
    public Geometric() {
    }

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}
