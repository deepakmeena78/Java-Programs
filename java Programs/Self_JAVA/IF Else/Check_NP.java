
import java.util.Scanner;
class Check_NP{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int np = sc.nextInt();
		if (np == 0){
			System.out.println("Zero");
		}
		else if (np > 0){
			System.out.println("Pogitive Number");
	    }
		else if (np < 0){
			System.out.println("negitive number");
		}	
	}
}