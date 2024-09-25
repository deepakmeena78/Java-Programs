/*
			    1
			   123
			  12345
			 1234567
			123456789
*/
class Pattern_29{
	public static void main(String args []){
		
		int num = 5;
		int a = 1;
		int b = 4;
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= b;j++)
			{
				System.out.print(" ");
			}
			b--;
			for(int k = 1;k <= a;k++)
			{
				System.out.print(k);
			}
			a = a + 2;
			System.out.println();
		}
	}
}