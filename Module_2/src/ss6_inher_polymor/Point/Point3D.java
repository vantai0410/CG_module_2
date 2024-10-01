package ss6_inher_polymor.point;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] { getX(), getY(), z };
    }
     public void callXY(float[] xy) {}

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
