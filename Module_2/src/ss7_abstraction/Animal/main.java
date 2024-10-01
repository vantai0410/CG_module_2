package ss7_abstraction.Animal;

public class main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.makeSound());
        Chicken chicken = new Chicken();
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howToEat());
    }
}
