package exe0;
public class Product {
    private int id;
    private String description;
    private double price;
    public Product() {
        this.description = "no description";
    }
    public Product(int id, String description, double price) {
        this.setId(id);
        this.setDescription(description);
        this.setPrice(price);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
