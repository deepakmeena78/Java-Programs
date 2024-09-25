import java.util.Scanner;
class Count_Day{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//WAP count total number of year & month & Week And day numb in given Da
		
		System.out.println("Enter Day");
		int day = sc.nextInt();
		
		System.out.println(day / 365+"  Year");
		day = day % 365;
		System.out.println(day / 30+"  Month");
		day = day % 30;
		System.out.println(day / 7+"  Week");
		day = day % 7;
		System.out.println(day);

	}
}