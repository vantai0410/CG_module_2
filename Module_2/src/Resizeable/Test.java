package ss7_abstraction.Resizeable;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[4];
        geometrics[0] = new Circle(2.0);
        geometrics[1] = new Rectangle(4.0, 4.0);
        geometrics[2] = new Square(3.0);
        geometrics[3] = new Rectangle(5.0, 5.0);

        Random random = new Random();

        System.out.println("Pre-Area");
        for (Geometric geometric: geometrics) {
            System.out.println(geometric.getArea());
        }

        System.out.println("After-Area");
        for (Geometric geometric: geometrics) {
            double percent = 1 + random.nextInt(100);
            ((Resizeable) geometric).reSize(percent);
        }
        for (Geometric geometric: geometrics) {
            System.out.println(geometric.getArea());
        }

    }
}
