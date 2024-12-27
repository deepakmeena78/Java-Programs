import java.util.Scanner;

class Pizza {
    double price;
    double topping;
    int num;

    public Pizza(double price, double topping, int num) {
        this.price = price;
        this.topping = topping;
        this.num = num;
    }

    public double calculatePrice() {
        return price + (topping * num);
    }
}

class DiscountedPizza extends Pizza {
    public DiscountedPizza(double price, double topping, int num) {
        super(price, topping, num);
        super.calculatePrice();
    }

    public double calculatePrice() {
        double reguler = super.calculatePrice();
        if (num > 3) {
            return (reguler * 90) / 100;
        } else {
            return reguler;
        }
    }
}

public class ASPizza {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base Price : ");
        double price = sc.nextDouble();

        System.out.println("Enter Topping Cost : ");
        double topping = sc.nextDouble();

        System.out.println("Enter Number of Toppings : ");

        int num = 0;

        boolean flag = true;

        while (flag) {
            num = sc.nextInt();
            if (num >= 1 && num <= 10) {
                flag = false;
            } else {
                flag = true;
                System.out.println("Enter Between 1 To 10");
            }
        }

        Pizza p = new Pizza(price, topping, num);
        System.out.println("Base Price : " + p.calculatePrice());

        if (topping >= 3) {
            DiscountedPizza d = new DiscountedPizza(price, topping, num);
            System.out.println("" + d.calculatePrice());
        }
    }
}