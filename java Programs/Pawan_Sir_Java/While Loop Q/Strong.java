//39) WAP to check whether entered number is strong or not
import java.util.Scanner;
class Strong{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");   
		int num = sc.nextInt();
		int modul = 0;
		int sum = 0;
		int num2 = num;
		
		while(0 != num){
		   int i = 1;
           modul = num % 10;
           int a = 1; 
			while(i <= modul){  
				a = a * i; 
				i++;
			} 
		    num = num / 10;
			sum = sum + a;
		}
		if (sum == num2)
			System.out.println(sum+" Strong number");
		else {
		System.out.println("Not Strong number");
		}
    }
}
