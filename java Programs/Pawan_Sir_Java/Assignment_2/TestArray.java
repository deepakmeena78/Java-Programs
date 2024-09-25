import java.util.Scanner;
class TestArray
{
	public static void main(String a[])
	{
		int sub[] = new int [5];
		int sum = 1;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<sub.length;i++)
		{
			sub[i]=sc.nextInt();
		}for(int i=0;i<sub.length;i++)
		{
			if(sub[i] % 2 == 0){
			System.out.print(sub[i] +" Enven Number");}
		}
	}
}