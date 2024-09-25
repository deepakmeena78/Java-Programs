import java.util.Scanner;
class Alphabet_Or_Not{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		int a = 0;
		a = ch;
		String s = 90 > a ? " Aper Case " : " Lower Case ";
		System.out.println(s);
	}
}