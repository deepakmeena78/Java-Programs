import java.util.Scanner;
///WAP to check inter char is vowel_or_consonant
class vowel_or_consonant{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Enter Charecter");
		char ch = sc.next().charAt(0);
	
		int a = ch ;
	
		if (ch == 'u'  || ch == 'U' || ch == 'o' || ch == 'O' || ch == 'i' || ch == 'I' || ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'){
			System.out.println("vowel");
		}
		
		else {
			System.out.println("consonant");
		}
		
		
			  
   } 
}
   