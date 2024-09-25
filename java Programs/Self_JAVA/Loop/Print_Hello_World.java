import java.util.Scanner;
class Print_Hello_World{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for ( int i = 1;i <= num;i++){
			System.out.println(i+"  Hello World");
		}
		
		
		
		
	}
}