import java.util.Scanner;

class IlligleArgumentException extends Exception {
    public IlligleArgumentException(String str) {
        super(str);
    }
}

class ShoppingCart1 {
    private static double totalPrice;

    void add(double price) throws IlligleArgumentException {
        if (price < 0) {
            throw new IlligleArgumentException("Illegle aurgument");
        }
        totalPrice += price;
    }

    void show() {
        System.out.println("total price: " + totalPrice);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=scn.nextInt();
        double price[]=new double[n];
        ShoppingCart1 obj=new ShoppingCart1();
        try{
        for(int i=0;i<n;i++){
             System.out.print("Enter item "+i+" price: ");
             price[i]=scn.nextDouble();
                obj.add(price[i]);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        obj.show();
    }
}
