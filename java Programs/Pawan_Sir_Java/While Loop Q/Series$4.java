//27) *	#	*	#	*	#	*	#	*	…….
import java.util.Scanner;
class Series$4{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 0;
		while(i <= num){
			if(i % 2 == 0){
				System.out.println("*");
			}
			else{
				System.out.println("#");
			}
			i++;
		}
	}
}