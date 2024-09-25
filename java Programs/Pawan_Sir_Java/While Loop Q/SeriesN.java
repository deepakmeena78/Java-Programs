//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
class SeriesN{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int sum = 1,i = 1;
		while(i <= num)
		{
			sum = sum + i;
			System.out.println(sum);
			i++;
		}
	}
}