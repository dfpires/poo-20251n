package exe0;
public class CarItem {
    private int id;
    private float quantity;
    // associação todo-parte
    private Product product;

    public CarItem() {
    }
    // Product já está criado, associação fraca
    // agregação
    public CarItem(int id, float quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    // Product já está criado, associação fraca
    // agregação
    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        return "\nCarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
