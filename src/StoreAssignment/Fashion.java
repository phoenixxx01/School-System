package StoreAssignment;

public class Fashion extends Category{

    private String trousers;
    private String shirt;
    private String shoes;
    private String hat;

    public Fashion() {
    }

    public Fashion(int price, boolean inStock, String trousers, String shirt, String shoes, String hat) {
        super(price, inStock);
        this.trousers = trousers;
        this.shirt = shirt;
        this.shoes = shoes;
        this.hat = hat;
    }

    public String getTrousers() {
        return trousers;
    }

    public void setTrousers(String trousers) {
        this.trousers = trousers;
    }

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    @Override
    public String toString() {
        return "Fashion{" +
                "trousers='" + trousers + '\'' +
                ", shirt='" + shirt + '\'' +
                ", shoes='" + shoes + '\'' +
                ", hat='" + hat + '\'' +
                '}';
    }
}
