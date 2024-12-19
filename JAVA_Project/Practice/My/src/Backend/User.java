package Backend;

public class User {
    private int id;
    private String Product;
    private int price;
    private String sun;
    private int size;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", Product=" + Product + ", price=" + price + ", sun=" + sun + ", size=" + size + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id, String Product, int price, String sun, int size) {
        this.id = id;
        this.Product = Product;
        this.price = price;
        this.sun = sun;
        this.size = size;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return Product;
    }

    public long getPrice() {
        return price;
    }

    public String getSun() {
        return sun;
    }

    public int getSize() {
        return size;
    }
}
