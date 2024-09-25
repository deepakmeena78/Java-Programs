import java.util.Scanner;
class Check_Triangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Side");
		int num = sc.nextInt();	

		System.out.println("Enter Second Side");
		int num1 = sc.nextInt();	

		System.out.println("Enter Third Side");
		int num2 = sc.nextInt();

        int a = 0;
		a = num + num1 + num2;
		
		if (a != 180){
			System.out.println("Invelid Triagle");
		}
		else if (num == num1 && num == num2){
			System.out.println("Three Side Equal");
		}
		else if (num == num1 || num1 == num2 || num == num2){
			System.out.println("Two Side Equal");
		}
        else {
			System.out.println("Not equal Side");
		}

    }

}