import java.util.Scanner;
class Prime_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1;i <= num;i++) {
			if (num % i == 0){
				count++;
			}
		}
		if(count == 2){
			System.out.println("Prime_Number");
		}
		else{
			System.out.println("Nornal Number");
		}
	}
}

		
