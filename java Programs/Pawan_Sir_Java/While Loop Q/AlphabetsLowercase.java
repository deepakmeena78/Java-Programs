import java.util.Scanner;
class AlphabetsLowercase{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		char a = 'a';
		char b = 'z';
		while(a <= b){
			System.out.print(a);
			a++;
		}
	}
}