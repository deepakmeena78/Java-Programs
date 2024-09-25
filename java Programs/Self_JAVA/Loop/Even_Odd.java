import java.util.Scanner;
class Even_Odd {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("\nEven Number");
		
		for (int i = 1;i <= num;i++){
			if (i % 2 == 0){
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n\nOdd Number");
		for (int j = 1;j <= num;j++){
			if (j % 2 != 0){
				System.out.print(j+" ");
			}
		}
		
		
	}
}