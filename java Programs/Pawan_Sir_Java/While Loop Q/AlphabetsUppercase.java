import java.util.Scanner;
class AlphabetsUppercase{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		char c = 'A';
		char z = 'Z';
		while(c <= z){
			System.out.print(c+" ");
			c++;
		}
	}
}