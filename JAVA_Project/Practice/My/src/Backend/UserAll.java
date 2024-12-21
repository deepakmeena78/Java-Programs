package Backend;

public class UserAll {

    private long pincode;
    private String name;
    private String location;
    private double price;
    private long contact;

    public UserAll(long pincode, String name, String location, double price, long contact) {
        this.pincode = pincode;
        this.name = name;
        this.location = location;
        this.price = price;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "UserAll{" + "pincode=" + pincode + ", name=" + name + ", location=" + location + ", price=" + price + ", contact=" + contact + '}';
    }

    public long getPincode() {
        return pincode;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public long getContact() {
        return contact;
    }
}
