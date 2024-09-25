import java.util.Scanner;
class Even_Odd{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		num = num % 2; 
		
		switch (num){
		case 1 :{
			System.out.println("odd");
		break;
		}	
		case 0 :{
			System.out.println("Even");
		break;
		}	
		default :
		System.out.println("Check Your Number");
			
		}
		
	}
}