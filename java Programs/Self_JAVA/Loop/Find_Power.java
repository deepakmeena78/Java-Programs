import java.util.Scanner;
class Find_Power{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println("Enter Power Number");
		int pow = sc.nextInt();
		int a = 1;
				
		for (int i = 1;i <= pow;i++){
			a = a * num;
		}
		System.out.println(a);
	}
}