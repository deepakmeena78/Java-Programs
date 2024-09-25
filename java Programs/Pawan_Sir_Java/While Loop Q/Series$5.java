//28) 1  2	3	4	 Hello	6	7	8	9	Hello	11	12 ….
import java.util.Scanner;
class Series$5{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,tem = 0,j = 1;
		while(i <= num){
			tem = 5 * i;
			while(j <= tem){
				if(j == tem){
					System.out.print(" Hello ");
				}
				else{
					System.out.print(" "+j+" ");
				}
				j++;
			}
			i++;
		}
	}
}