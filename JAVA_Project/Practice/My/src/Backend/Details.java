package Backend;

public class Details {

    private String name;
    private String city;
    private String mobile;
    private int pincode;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Details{" + "name=" + name + ", city=" + city + ", address=" + mobile + ", pincode=" + pincode + '}';
    }

    public Details(String name, String city, String address, int pincode) {
        this.name = name;
        this.city = city;
        this.mobile = address;
        this.pincode = pincode;
    }

    public String getAddress() {
        return mobile;
    }

    public int getPincode() {
        return pincode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.mobile = address;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}
