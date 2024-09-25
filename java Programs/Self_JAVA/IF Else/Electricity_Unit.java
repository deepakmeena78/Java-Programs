import java.util.Scanner;
class Electricity_Unit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//WAP to input electricity unit charges and calculate total electricity bill according 
		//to the given Condition: For first 100 units Rs. 5/unit for next 101 to 200 units Rs. 7/unit
		//for next 201 to 300 units Rs. 12.0/unit for unit above 300 Rs. 16/unit 

		
		System.out.println("Enter Unit");
		int unit = sc.nextInt();
		
		if (unit < 100){
			System.out.println(unit * 5+"  Rs. 5/unit");
		}
		else if (unit < 200){
			System.out.println(unit * 7+"  Rs. 7/unit");
		}
		else if (unit < 300){
			System.out.println(unit * 12+"  Rs. 12/unit");
		}
		else if (unit > 300){
			System.out.println(unit * 16+"  Rs. 16/unit");
		}
							
	}
}





