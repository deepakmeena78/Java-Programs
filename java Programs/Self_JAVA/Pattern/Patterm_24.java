/*
		       *
			  ***
			 *****
			*******
*/
class Patterm_24{
	public static void  main(String args []){
		
		int num = 4;
		int a = 1;
		int b = 3;
		for(int i = 1;i <= num;i++)
		{
			for(int k = 1;k <= b;k++)
			{
				System.out.print(" ");
			}
			b--;
			for(int j = 1;j <= a;j++)
			{
				System.out.print("*");
			}
			a = a + 2;
			System.out.println();
		}
	}
}