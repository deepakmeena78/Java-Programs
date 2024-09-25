	import java.util.Scanner;
	class Eligivel_Voting{
	public static void main (String [] args){
	Scanner sc = new Scanner (System.in);	
	
	System.out.println("Enter Age");
	int age = sc.nextInt();
	
	if (age > 17){
		System.out.println("Eligivel For Vot");
	  }

    else{
		System.out.println("Not Eligivel For Vot"); 
	  }

	}
	
 }