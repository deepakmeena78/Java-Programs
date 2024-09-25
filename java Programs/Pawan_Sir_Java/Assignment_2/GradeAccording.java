import java.util.Scanner;
class  GradeAccording{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Percantage");
		int a = sc.nextInt();
		
		if(a >= 0){
			System.out.println("NOt Allowed Negetive Number");	
		}
		if(a >= 100){
			System.out.println("100 .Under");	
		}
		
		else if(a >= 90){
			System.out.println("A Grade");	
		}
		else if(a >= 80){
			System.out.println(" B Grade");	
		}
		else if(a >= 60){
			System.out.println("C Grade");	
		}
		else if(a >= 50){
			System.out.println("D Grade");	
		}
		else if(a >= 40){
			System.out.println("E Grade");	
		}
	}
}