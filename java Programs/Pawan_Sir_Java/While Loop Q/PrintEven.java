import java.util.Scanner;
class PrintEven{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}