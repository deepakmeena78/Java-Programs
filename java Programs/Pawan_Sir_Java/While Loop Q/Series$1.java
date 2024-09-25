//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
class Series$1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 1,i = 1;
		while(i <= num)
		{
			System.out.println(a);
			a = a + i;
			i++;
		}
	}
}