package ss7_abstraction.demo;
// trong Java:
// lớp chứa abstract method thì phải có abstract class, ngược lại thì ko
// giống class thường về mọi mặt nhưng ko thể khởi tạo đối tượng ( vẫn có constructor ). có constructor để tái sự dụng cho lớp con
// abstract class ko thể đi với final ( abstract để di kế thừa nếu thêm final vô thì ko kế thưa dc )
// class thông thường khi extend 1 abstract class thì bắt buộc phải overide các abstract method
// abstract ko thể đi cùng private và final

public abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void saySth();
}
