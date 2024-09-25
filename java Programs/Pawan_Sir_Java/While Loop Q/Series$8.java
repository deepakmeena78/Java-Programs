//31) 9  99   999    9999	  99999 …….
import java.util.Scanner;
class Series$8{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,tem = 1,j = 0;
		while(i <= num){
			tem = tem * 10;
			System.out.println(tem-1);
			i++;
		}
	}
}