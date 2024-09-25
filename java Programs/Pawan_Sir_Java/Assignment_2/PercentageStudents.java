import java.util.Scanner;
class PercentageStudents{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Subject 1");
		int s1 = sc.nextInt();
		
		System.out.println("Enter Subject 2");
		int s2 = sc.nextInt();
		
		System.out.println("Enter Subject 3");
		int s3 = sc.nextInt();
		
		System.out.println("Enter Subject 4");
		int s4 = sc.nextInt();
		
		System.out.println("Enter Subject 5");
		int s5 = sc.nextInt();
		
		int sum = (s1 + s2 + s3 + s4 + s5)/5;
		System.out.println("Percentage  "+sum+"%");
	}
}
