import java.util.Scanner;
class N_To_N_Palindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		int rev = 0; 
		
		for (int i = 1;i <= num;i++) {
			 a = i % 10;
			rev = rev * 10 + a;
		}
		for (int j = 1;j <= rev;j++){
			if (rev == j){
			System.out.print(rev);
			}
		}
	}   
}