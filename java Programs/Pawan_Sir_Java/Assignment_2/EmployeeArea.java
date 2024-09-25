import java.util.Scanner;
class EmployeeArea{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter Gender male..female..boy");
		String g = sc.next();
	
		if(g.equals("female")){
			System.out.println("City Area");
		}
		else if(g.equals("boy")){
			if(age >= 20 || age <= 40){
				System.out.println("Any where Area");
			}
			else{
				System.out.println("Not Eligivel");
			}
		}
		else if(g.equals("male")){
			if(age >= 40 && age <= 60){
				System.out.println("City Area");
			}
			else{
				System.out.println("Not Eligivel");
			}
		}
		else{
			System.out.println("ERROR");
		}
	}
}