/*
		*
		* * *
		* * * * *
		* * * * * * *
		* * * * * * * * *
		* * * * * * * * * * *
		* * * * * * * * *
		* * * * * * *
		* * * * *
		* * *
		*
*/
class Pattern_34{
	public static void main(String [] args){
		
		int num = 9;
		int tem = 1;
		int dev = (num / 2)+1;
		for(int i = 1;i <= dev;i++)
		{
			for(int j = 1;j <= tem;j++)
			{
				System.out.print(" *");
			}
			tem += 2;
			System.out.println();
		}
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= tem;j++)
			{
				System.out.print(" *");
			}
			tem -= 2;
			System.out.println();
		}
	}
}
			