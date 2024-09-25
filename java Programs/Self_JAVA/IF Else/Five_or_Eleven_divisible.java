import java.util.Scanner;
class Five_or_Eleven_divisible{
	public static void main(String [] args){	
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Enter Number ");
		int num = sc.nextInt();
	
		if (num % 5 == 0 && num % 11 == 0){
			System.out.println("Divigivel");
		}
		else{
		System.out.println("NOT Divigivel");
	    }
		
	}
	
}	