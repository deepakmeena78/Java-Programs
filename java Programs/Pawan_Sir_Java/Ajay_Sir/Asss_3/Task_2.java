
/*Write a Java program to check if a given string is a palindrome (same forward and backward) using a stack.
*/
import java.util.Scanner;
import java.util.Stack;
import java.util.ListIterator;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your input : ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for (char c : ch) {
			s.push(c);
		}
		System.out.println(s);
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse += s.pop();
		}
		System.out.println(reverse);
		if (str.equals(reverse)) {
			System.out.println("String is palindrome ");
		} else {
			System.out.println("It's not an palindrom string ");
		}
	}
}
