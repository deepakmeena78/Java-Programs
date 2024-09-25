import java.util.Scanner;
class Strong_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int tem = 1;
		
		for (;num > 0;num = num / 10){
			int a = num % 10;
			int rev = 0;
			rev = rev * 10 + a;
						
			for(int i = 1;i < rev;i++){
				 tem = tem * i;
			} 
			System.out.println(tem);
			
		}
		
		
	}
}
