import java.util.Scanner;
public class SelectionSort {
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\nAlready Define Array Size 10");
		int arr []= new int [10];
		
		System.out.println("Enter Value");
		for(int i = 0;i < 10;i++){
			arr [i] = sc.nextInt();
		}
		
		int time = 0,temp = 0;
		for(int i = 0;i < arr.length - 1;i++){
			time = i;
			for(int j = i+1;j < arr.length - 1;j++){
				if(arr[time] > arr[j]){
					time = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[time];
			arr[time] = temp;
		}
		
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
