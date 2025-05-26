package JavaStreamApis.models;

public class Product {
    public int id;
    public String name;
    public double price;
    public boolean inStock;

    public Product(int id, String name, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String toString() {
        return name + "($" + price + ")";
    }
}
