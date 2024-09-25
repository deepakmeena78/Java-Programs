import java.util.Scanner;
class profit_or_loss{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buy Price");
		int buy = sc.nextInt();
		
		System.out.println("Enter sale Price");
		int sale = sc.nextInt();
		
		if (buy < sale){
			System.out.println(sale - buy+"  profit");
		}
		
		else if (buy > sale){
			System.out.println(buy - sale+"   Loss");
		}
	
		
	
			
	}
}
