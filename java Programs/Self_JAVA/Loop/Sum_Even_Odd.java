import java.util.Scanner;
class Sum_Even_Odd{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		
		for (int i = 1;i <= num;i++){
			if (i % 2 != 0){
				System.out.print(i+"  Odd");				
			}
			if (i % 2 == 0){
				System.out.print(i+"  Even");
			}
		}
	}
}