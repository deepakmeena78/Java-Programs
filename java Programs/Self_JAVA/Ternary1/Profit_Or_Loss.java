import java.util.Scanner;
class Profit_Or_Loss{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buy");
		int buy = sc.nextInt();
		
		System.out.println("Enter Sale");
		int sale = sc.nextInt();
		
		String s = sale > buy ? "Profit" : "Loss";
		System.out.println(s);
	}
}