package Hospital;

public abstract class Person {

    private String name;
    private String id;
    private String gender;
    private String stateOfOrigin;
    private int age;

    public Person() {
    }
    public Person(String name, String id, String gender, String stateOfOrigin, int age) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.stateOfOrigin = stateOfOrigin;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", age=" + age +
                '}';
    }
}