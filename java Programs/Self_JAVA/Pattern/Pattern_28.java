/*
				*****
			   *****
			  *****
			 *****
			*****
*/
class Pattern_28{
	public static void main(String args []){
		
		int num = 5;
		int a = num;
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= num - i;j++)
			{
				System.out.print(" ");
			}
			for(int l = 1;l <= num;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
				