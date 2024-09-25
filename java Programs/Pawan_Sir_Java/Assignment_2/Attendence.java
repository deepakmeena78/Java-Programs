import java.util.Scanner;
class Attendence{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Attendence Parsent");
		int att = sc.nextInt();
		
		System.out.println("Enter Class");
		String cla = sc.next();
		
		if(att >= 75){
			System.out.println("Allowed To Exam "+cla);
		}
		else{
			System.out.println("Not Allowed To Exam "+cla);
		}
	}
}