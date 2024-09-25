import java.util.Scanner;
class Eligible_For_Voting{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		String s = num >= 18 ? "Eligible_For_Voting" : "Not Eligible For Voting";
		System.out.println(s);
	}
}