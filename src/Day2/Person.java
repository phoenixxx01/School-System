package Day2;

public abstract class Person {

    private String name;
    private int id;
    private String phone;
    private String address;
    private int age;

    public Person() {
    }

    public Person(String name, int id, String phone, String address, int age) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
