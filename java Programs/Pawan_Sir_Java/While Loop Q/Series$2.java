//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class Series$2{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		double num = sc.nextInt();
		double a = 0,i = 1;
		while(i <= num)
		{
			a = a + (1 / i);
			i++;
		}
			System.out.println(a);
	}
} 