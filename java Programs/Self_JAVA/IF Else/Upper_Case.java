import java.util.Scanner;
//WAP to check inter char Is upper case or lower case
class Upper_Case{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Enter Charecter");
		char ch = sc.next().charAt(0);
	
		int a = ch ;
		System.out.println(a);
	
		if (a > 96){
		System.out.println("Lower Case");
		}
		else if (a > 64){
			System.out.println("Upper Case");
		}	  
   } 
}