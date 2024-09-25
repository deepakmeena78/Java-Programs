//5.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
class AgeGrater{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cheeku Age");
		int cheeku = sc.nextInt();
		
		System.out.println("Enter peeku Age");
		int peeku = sc.nextInt();
		
		System.out.println("Enter seela Age");
		int seela = sc.nextInt();
		
		if(cheeku > peeku && cheeku > seela){
			System.out.println("Cheeku is Greater");
		}
		if(peeku > cheeku && peeku > seela){
			System.out.println("Peeku is Greater");
		}
		if(seela > cheeku && seela > peeku){
			System.out.println("seela is Greater");
		}
	}
}