import java.util.Scanner;
class Divigivel_Any_Num{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();
		
		
		System.out.println("Divigival number");
		int num1 = sc.nextInt();
		
		if (num % num1 == 0){
			System.out.println("Number is Divigival");
		}
	    else{
			System.out.println("Not Divisival");
		}
    }	
}