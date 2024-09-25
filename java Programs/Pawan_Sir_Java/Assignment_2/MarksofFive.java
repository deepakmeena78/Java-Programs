import java.util.Scanner;
class MarksofFive{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Physics");
		int ph = sc.nextInt();
		
		System.out.println("Chemistry");
		int che = sc.nextInt();
		
		System.out.println("Biology");
		int bio = sc.nextInt();
		
		System.out.println("Mathematics");
		int math = sc.nextInt();
		
		System.out.println("Computer");
		int com = sc.nextInt();
		
		int sum = (ph + che + bio + math + com)/5;
		
		if(sum < 0){
			System.out.println("Negitive");
		}
		else if (sum >= 90){
			System.out.println("A Grade "+sum+"%");
		}
		else if (sum >= 80){
			System.out.println("B Grade "+sum+"%");
		}
		else if (sum >= 70){
			System.out.println("C Grade "+sum+"%");
		}
		else if (sum >= 60){
			System.out.println("D Grade "+sum+"%");
		}
		else if (sum >= 40){
			System.out.println("E Grade "+sum+"%");
		}
		else if (sum <= 40){
			System.out.println("FAIL  "+sum+"%");
		}
	}
}
		