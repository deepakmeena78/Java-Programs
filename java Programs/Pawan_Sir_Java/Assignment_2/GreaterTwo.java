import java.util.Scanner;
class GreaterTwo{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N1 Number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter N2 Number");
		int n2 = sc.nextInt();
		
		if (n1 > n2)
			System.out.println("N1 is Greater");
		
		else if (n2 > n1)
			System.out.println("N2 is Greater");
		
		else if (n2 == n1)
			System.out.println("N1 Or N2 Equal");
		else 
			System.out.println("Wrong Number");
	}
}
		