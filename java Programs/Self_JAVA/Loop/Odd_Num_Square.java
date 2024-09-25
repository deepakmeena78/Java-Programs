import java.util.Scanner;
class Odd_Num_Square {
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println("Odd Number");
		for (int i = 1;i <= num;i++){
			if (i % 2 !=0)
			System.out.println(i);
		}
	}
}