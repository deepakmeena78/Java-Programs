//18) 1  2	2	4	8	32	…… n terms
import java.util.Scanner;
class Series1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		// int num = sc.nextInt();
		int num = 5;
		int i = 1,tem = 1,a = 1;
		int j = 1;
		
		while(i <= num){
			System.out.println(j);
			j = j * tem;
			if(i>=2) tem++;
			else
			tem =  j;
			i++;
		} 
	}
}