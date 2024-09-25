import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
        int num = sc.nextInt();
        int b = 0;
        b = (b * 10)+ num % 10;
        
        num = num / 10;
        b = (b * 10)+ num % 10;
        
        num = num / 10;
        b = (b * 10)+ num % 10;
        
        num = num / 10;
       b = (b * 10)+ num % 10;
       
        System.out.println(b);
    }
}