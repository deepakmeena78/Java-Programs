import java.util.Scanner;
class AbCdE{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
	
		System.out.println();
		char a = sc.next().charAt(0);
		char b = 'A';
		while(a <= 122){
			if(a % 2 == 0){		
			System.out.println(a);
			}
			if(b % 2 != 0){
				System.out.println(b);
			}
			a++;
			b++;
		}
	}
}