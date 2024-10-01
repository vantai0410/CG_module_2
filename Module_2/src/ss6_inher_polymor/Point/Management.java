package ss6_inher_polymor.point;

public class Management {
    public static void main(String[] args) {
//        Point3D p1 = new Point3D(2,1,3);
//        System.out.println(p1);
//        float[] xyz = p1.getXYZ();
//        System.out.println();
//        for (int i = 0; i < xyz.length; i++) {
//            System.out.println(xyz[i]);
//        }



        Point2D point2D = new Point2D(3.0f, 4.0f);
        System.out.println("Point2D: " + point2D);
        System.out.println("X: " + point2D.getX());
        System.out.println("Y: " + point2D.getY());


        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());
        System.out.println("Z: " + point3D.getZ());
    }
}
