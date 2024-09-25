//29) 1	 11	 111   1111	  11111	……
import java.util.Scanner;
class Series$6{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,tem = 1;
		while(i <= num){
			System.out.println(tem);
			tem = (tem * 10)+1;
		i++;
		}
	}
}