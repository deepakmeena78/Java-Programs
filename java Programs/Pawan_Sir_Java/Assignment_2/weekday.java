import java.util.Scanner;
class Weekday{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 To 7..");
		int num = sc.nextInt();

		switch (num){
			case 1 :{
				System.out.println("Monday");
			break;
			}
			case 2 :{
				System.out.println("Tuesday");
			break;
			}
			case 3 :{
				System.out.println("Wednesday");
			break;
			}
			case 4 :{
				System.out.println("Thursday");
			break;
			}
			case 5 :{
				System.out.println("Friday");
			break;
			}
			case 6 :{
				System.out.println("Saturday");
			break;
			}
			case 7 :{
				System.out.println("Sunday");
			break;
			}
			default :
			System.out.println("Please Enter 1 To 7...");
		}
	}
}