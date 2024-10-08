package ss8_clean_code.quan_li_khach_hang;

public class Customer {
    private int Id;
    private String name;
    private String adress;
    private String phone;
    private String birthDay;

    public Customer(int id, String name, String adress, String phone, String birthDay) {
        Id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.birthDay = birthDay;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
