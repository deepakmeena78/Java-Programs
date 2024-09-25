/*
				***** *****
				****   ****
				***     ***
				**       **
				*         *
*/
class Pattern_32{
	public static void main(String args []){
		
		int num = 5;
		int a = num;
		int h = num;
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= h;j++)
			{
				System.out.print("*");
			}
			h -= 1;
			for(int k = 1;k <= i*2-1;k++)
			{
				System.out.print(" ");
			}
			for(int p = 1;p <= a;p++)
			{
				System.out.print("*");
			}
			a -= 1;
			System.out.println();
		}
	}
}