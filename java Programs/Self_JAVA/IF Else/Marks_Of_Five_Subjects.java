import java.util.Scanner;
class Marks_Of_Five_Subjects{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		//WAP to take input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
		
		System.out.println("Enter Physics Marks");
		int ph = sc.nextInt();
		
		System.out.println("Enter Chemistry Marks");
		int ch = sc.nextInt();
		
		System.out.println("Enter Biology Marks");
		int bio = sc.nextInt();
		
		System.out.println("Enter English Marks");
		int eng = sc.nextInt();
		
		System.out.println("Enter Hindi Marks");
		int hin = sc.nextInt();
		
		int	sum = ph + ch + bio + eng + hin;
		float tem = sum /5;
		System.out.println(tem);
		
		if (tem > 80){
			System.out.println("A++ Grade");
		}else if (tem > 70){
			System.out.println("A Grade");
		}else if (tem > 60){
			System.out.println("B Grade");
		}else if (tem > 50){
			System.out.println("C Grade");
		}else if (tem > 40){
			System.out.println("E Grade");
		}else {
			System.out.println("F Grade Fail");
		}	
					
		
	}
	
}
		