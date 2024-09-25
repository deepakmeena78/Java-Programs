import java.util.Scanner;
class Print150To250{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		int num [] = new int [5];
		for(int i = 0;i < num.length;i++){
			num[i] = sc.nextInt();
		}
		for(int i = 0;i < num.length;i++){
			if(num[i] >= 150 && num[i] <= 250){
				System.out.println(num[i]+" ");
			}
		}
	}
}