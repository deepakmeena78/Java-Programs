import java.util.Scanner;
public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int s = sc.nextInt();
        int arr [] = new int [s];
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Find Number :");
        int f = sc.nextInt();
		
		int temp = 0;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == f){
				System.out.println(" Exit Value : "+arr[i]);
				temp++;
				break;
			}
		}   
		if(temp == 0){
			System.out.println("Not Exit Value ");
		}
    }
}
