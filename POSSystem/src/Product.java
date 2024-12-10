public class Product {
    private final String name;
    private float price;
    private int stock;

    public Product(String name, float price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
   public String toString() {
        return name + " ($" + price + ") - Quantity: " + stock;
    }
}
