import java.util.Scanner;
public class BinarySerch{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Already Array Size Define 10");
		int arr []= new int [10];
		
		System.out.println("Enter Value");
		for(int i = 0;i < 10;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Find Number");
		int a = sc.nextInt();
		
		int low = arr[0];
		int hig = arr.length - 1;
		int mim = (low + hig)/2;
		
		while(low <= hig){
			if(arr[mim] == a){
				System.out.println("Exist Value : "+a);
				break;
			}
			else if(arr[mim] < a){
				low = mim + 1;
			}
			else{
				hig = mim - 1;
			}
			mim = (hig + low)/2;
		}
		if(low > hig){
			System.out.println("Value is Not Faund");
		}
	}
}