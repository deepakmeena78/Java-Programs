import java.util.Scanner;
class Armstrong_Or_Not{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;	
		int b = 0;
		int c = 0;
		int ok = num;
		int so = num;
		
		for (;ok > 0;){
			ok = ok / 10;
			b++;
		}
		for (;num > 0;num = num / 10){
			a = num % 10;
			int tem = 1;
			
			for (int i = 1;i <= b;i++){
				tem = tem * a;
			}
   				c = c + tem;
		}
		if (c == so) {
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
	}
}
		
    