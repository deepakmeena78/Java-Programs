import java.util.Scanner;
class Check_Greater{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sohan Age");
		int sohan = sc.nextInt();
		
		System.out.println("Enter Mohan Age");
		int mohan = sc.nextInt();
		
		System.out.println("Enter kapil Age");
		int kapil = sc.nextInt();
		
		String s = sohan > mohan && sohan > kapil ? "sohan is Greater" : 
		mohan > sohan && mohan > kapil ? "Mohan is greater" : "Kapil is Greater";
		System.out.println(s);
	}
}