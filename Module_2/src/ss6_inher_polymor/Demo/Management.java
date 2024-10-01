package ss6_inher_polymor.Demo;
// lớp con có thể kế thừa các thuộc h=tính, hành vinh ko phải là private của cha
// lớp con ko thể kế thừa constructor của lớp cha
// 1 lớp con chỉ có 1 lớp cha ( trong java )

public class Management {
    public static void main(String[] args) {
        Child child = new Child("Tài");
        Child child2 = new Child();
        System.out.println(child.getName());

    }
}
