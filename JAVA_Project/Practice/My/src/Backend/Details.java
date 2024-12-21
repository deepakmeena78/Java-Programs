package Backend;

public class Details {

    private String name;
    private String city;
    private String mobile;
    private int pincode;

    public Details(String name, String city, String address, int pincode) {
        this.name = name;
        this.city = city;
        this.mobile  = address;
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getMobile() {
        return mobile;
    }

    public int getPincode() {
        return pincode;
    }
}
