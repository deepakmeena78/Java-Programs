//21) 1,	4,	9,	16,	25	…..N terms
import java.util.Scanner;
class Series$3{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 0,tem = 0;
		while(i <= num){
			if(i % 2 != 0){
				tem = tem + i;
				System.out.println(tem);
			}
			i++;
		}
	}
}