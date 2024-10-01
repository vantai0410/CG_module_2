package ss6_inher_polymor.MovablePoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point pi = new Point(3,4);
        MovablePoint mp = new MovablePoint();
        mp.setSpeed(2,3);
        System.out.println("vị trí ban đầu: "+ mp);

        mp.move();
        System.out.println(" vị trí dịch chuyển: "+mp);
        System.out.println(Arrays.toString(mp.getXY()));
        System.out.println(Arrays.toString(pi.getXY()));
    }
}
