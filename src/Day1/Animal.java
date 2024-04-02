package Day1;

public class Animal {

    private String name;
    private String color;
    private int id;

    private int age;

    private double weight;

    private boolean canRun;

    private boolean canSwim;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public void setCanRun(boolean canRun) {
        this.canRun = canRun;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }



    @Override
    public String toString() {
        return "Day1.Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", canRun=" + canRun +
                ", canSwim=" + canSwim +
                '}';
    }
}


