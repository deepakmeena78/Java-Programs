//30) 1 + 11 + 111 + 1111 + 11111 +…. 
import java.util.Scanner;
class Series$7{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,tem = 1,j = 0;
		while(i <= num){
			tem = (tem * 10)+1;
			j = j + tem;
		i++;
		}
		System.out.println(j+1);
	}
}
			