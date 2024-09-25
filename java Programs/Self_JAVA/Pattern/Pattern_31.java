/*
			  *
			 ***
			*****
		   *******
		  *********
		   *******
			*****
			 ***
			  *
*/
class Pattern_31{
	public static void main(String args []){
		
		int row = 5;
		int a = 1;
		for(int i = 1;i <= row;i++)
		{
			for(int j = 1;j <= 5 - i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 1;k <= i*2-1;k++)
			{
				System.out.print("*");
				
			}
			// a = a + 2;
			System.out.println();
		}
		for (int i = 1;i < 6;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 1;k <=4*2-(i*2-1) ;k++)
			{
				System.out.print("*");
			}
			// a = a - 2;
			System.out.println();
		}
		
	}
}