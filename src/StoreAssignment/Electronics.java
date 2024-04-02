package StoreAssignment;



public class Electronics  extends Category
{
    private String fan;
    private String airConditiner;

    private String electricKettle;
    private String waterDispenser;
    private String TV;

    public Electronics() {
    }

    public Electronics(int price, boolean inStock, String fan, String airConditiner, String electricKettle, String waterDispenser, String TV) {
        super(price, inStock);
        this.fan = fan;
        this.airConditiner = airConditiner;
        this.electricKettle = electricKettle;
        this.waterDispenser = waterDispenser;
        this.TV = TV;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getAirConditiner() {
        return airConditiner;
    }

    public void setAirConditiner(String airConditiner) {
        this.airConditiner = airConditiner;
    }

    public String getElectricKettle() {
        return electricKettle;
    }

    public void setElectricKettle(String electricKettle) {
        this.electricKettle = electricKettle;
    }

    public String getWaterDispenser() {
        return waterDispenser;
    }

    public void setWaterDispenser(String waterDispenser) {
        this.waterDispenser = waterDispenser;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "fan='" + fan + '\'' +
                ", airConditiner='" + airConditiner + '\'' +
                ", electricKettle='" + electricKettle + '\'' +
                ", waterDispenser='" + waterDispenser + '\'' +
                ", TV='" + TV + '\'' +
                '}';
    }
}
