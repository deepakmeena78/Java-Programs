//20) 0	7	14	21	28	35	…..
import java.util.Scanner;
class TablenTime{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,tem = 0;
		while(i <= 10){
			tem = num * i;
			System.out.println(tem);
			i++;
		}
	}
}