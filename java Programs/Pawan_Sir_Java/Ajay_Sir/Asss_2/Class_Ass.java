import java.util.*;

class Product {
    private int pid;
    private String pname;
    private double pprice;
    private String plocation;

    public Product(int pid, String pname, double pprice, String plocation) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.plocation = plocation;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPprice() {
        return pprice;
    }

    public String getPlocation() {
        return plocation;
    }

    public void display() {
        System.out.println("PID: " + pid + ", Name: " + pname + ", Price: " + pprice + ", Location: " + plocation);
    }
}

public class Class_Ass {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 750.50, "New York"));
        products.add(new Product(102, "Phone", 499.99, "Los Angeles"));
        products.add(new Product(103, "Tablet", 300.00, "Chicago"));
        products.add(new Product(104, "Monitor", 550.75, "Houston"));
        products.add(new Product(105, "Headphones", 150.25, "Miami"));

        System.out.println("All Products:");
        for (Product product : products) {
            product.display();
        }

        System.out.println("All Products (using ListIterator):");
        ListIterator<Product> iterator = products.listIterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        System.out.println("Products with price above 500:");
        for (Product product : products) {
            if (product.getPprice() > 500) {
                product.display();
            }
        }
    }
}
