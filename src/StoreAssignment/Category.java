package StoreAssignment;

public abstract class Category extends Store {
    private int price;
    private boolean inStock;

    public Category() {
    }

    public Category(int price, boolean inStock) {
        this.price = price;
        this.inStock = inStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
