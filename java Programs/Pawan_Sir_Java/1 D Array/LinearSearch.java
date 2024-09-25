//34. Write a java program to implement linear search
import java.util.Scanner;
public class LinearSearch{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nAlready define Array Size 10");
		int arr[] = new int [10];
		
		System.out.println("Enter Value");
		for(int i = 0;i < 10;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Find Value");
		int a = sc.nextInt();
		
		int count = 0;
		for(int i = 0;i < 10;i++){
			if(a == arr[i]){
				count++;
				break;
			}
		}
		
		if(count == 1){
			System.out.print("Yesh This Value Exist : "+a);
		}else{
			System.out.println("This Value Was Not Found");
		}
	}
}