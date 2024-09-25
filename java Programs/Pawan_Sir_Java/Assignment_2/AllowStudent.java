import java.util.Scanner;
class AllowStudent{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Medical Cause");
		String num = sc.next();
		
		if(num.equals("yes")){
			System.out.println("Allow Student");
		}
		else {
			System.out.println("Not Allow Student");
		}
	}
}