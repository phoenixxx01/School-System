package StoreAssignment;

public class FoodStuff  extends  Category{

    private String rice;
    private String beans;
    private String plantain;
    private String yam;

    public FoodStuff() {
    }

    public FoodStuff(int price, boolean inStock, String rice, String beans, String plantain, String yam) {
        super(price, inStock);
        this.rice = rice;
        this.beans = beans;
        this.plantain = plantain;
        this.yam = yam;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public String getPlantain() {
        return plantain;
    }

    public void setPlantain(String plantain) {
        this.plantain = plantain;
    }

    public String getYam() {
        return yam;
    }

    public void setYam(String yam) {
        this.yam = yam;
    }

    @Override
    public String toString() {
        return "FoodStuff{" +
                "rice='" + rice + '\'' +
                ", beans='" + beans + '\'' +
                ", plantain='" + plantain + '\'' +
                ", yam='" + yam + '\'' +
                '}';
    }
}
