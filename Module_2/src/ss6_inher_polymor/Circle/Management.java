package ss6_inher_polymor.Circle;

public class Management {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,"red",12);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.calculateVolume());
    }
}
