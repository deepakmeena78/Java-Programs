import java.util.Scanner;
class Incres5{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		int num [] = new int [5];
		
		for(int i = 0;i < num.length;i++){
			System.out.println("Enter Number");
			num [i] = sc.nextInt();
			
		}
		for(int i = 0;i < num.length;i++){
			
			System.out.println(num[i] +" = "+ (num[i] + 5));
		}
	}
}