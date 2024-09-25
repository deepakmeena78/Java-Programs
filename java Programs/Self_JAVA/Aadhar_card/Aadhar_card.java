import java.util.Scanner;
class Aadhar_card{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Gender");
		String gender = sc.next();
		
		System.out.println("Date of Birth");
		int dob = sc.nextInt();
		
		System.out.println("Enter Aadhar Number ");
		String adha = sc.next();
		
		
		System.out.println("_________________________________________________");
		System.out.println("|                                               |");
		System.out.println("|            GOVERNMENT OF INDIA                |");
		System.out.println("|                                               |");
		System.out.println("| __________ Name:"+name+"                  |");
		System.out.println("| |        | DOB :"+dob+"                        |");
		System.out.println("| |        | Gender :"+gender+"                       |");
		System.out.println("| |        |                                    |");
		System.out.println("| |        |                             .,.,., |");
		System.out.println("| |________|                             ,.,.,. |");
		System.out.println("|                    "+adha+"        .,.,., |");
		System.out.println("|_______________________________________________|");
		System.out.println("|                Aam Aadmi Ka Aadhaikar         |");
		System.out.println("|_______________________________________________|");
	}
}