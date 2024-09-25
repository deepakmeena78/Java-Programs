	import java.util.Scanner;
	class Find_Greater{
		public static void main(String []args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Mohan Age");	
        int mohan = sc.nextInt();
		
		System.out.println("Enter Sohan Age");	
        int sohan = sc.nextInt();
		
		System.out.println("Enter Kapil Age");	
        int kapil = sc.nextInt();
	
	if(mohan > sohan && mohan > kapil){
	System.out.println("Mohan is Greater");		
    }
	
	else if (sohan > mohan && sohan > kapil){
    System.out.println("Sohan is Greater");	
	}
	
	else if (kapil > sohan && kapil > mohan){
	System.out.println("Kapil is Greater");	
     }
	
	}
	
}