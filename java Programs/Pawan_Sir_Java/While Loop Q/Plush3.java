//16) …... -6	-3	0	3	6	9	……. n terms	 
import java.util.Scanner;
class Plush3{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,b = num,a = num;
		while(i <= 10){
			a = a - 3;
			if(a < 0){
			System.out.println(a+" ");
			}
			if(a >= 0){
			System.out.println(a+" ");
			}
			i++;
		}
	}
}
	