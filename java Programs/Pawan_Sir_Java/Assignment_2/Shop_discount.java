import java.util.Scanner;
class Shop_discount{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enetre Number");
		int num = sc.nextInt();
		int s = num * 100;
		int a = s / 10;
		int b = (num * 100)- a;
		
		if(num > 10){
			System.out.println("Total : "+num * 100);
			System.out.println("Discount 10% : -"+a);
			System.out.println("Discount Amount :  = "+b);
		}
		else{
			System.out.println("Total Amount :- "+num * 100);
		}
	}
}