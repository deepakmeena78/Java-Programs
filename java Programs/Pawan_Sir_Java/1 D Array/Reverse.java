import java.util.Scanner;
class Reverse{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		int num [] = new int [5];
		int a []=new int [num.length];
		for(int i = 0;i < num.length;i++){
			System.out.println("Enter Number");
			num [i] = sc.nextInt();
		}
		for(int i = num.length-1 , j=0;i >=0;i--,j++){
			a[i]=num[num.length-1-i];
		}
	}
}