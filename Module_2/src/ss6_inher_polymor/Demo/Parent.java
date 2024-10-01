package ss6_inher_polymor.Demo;

public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public Parent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySth(){
        System.out.println("lop cha noi");
    }
}
