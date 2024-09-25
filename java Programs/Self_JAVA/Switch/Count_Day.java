import java.util.Scanner;
class Count_Day {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		//WAP to take day numb and print day name
				
		System.out.println("Enter Number");
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
				System.out.println("sunday");
			break;
			}
		    default:
			System.out.println("Pleas Enter 1...7");
		
		}
		
	}
}
	





	