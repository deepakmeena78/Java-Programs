/*
			12345 12345
			1234   1234
			123     123
			12       12
			1         1
*/
class Pattern_33{
	public static void main(String args []){
		
		int num = 5;
		int a = num;
		int b = num;
		int d = 1;
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= a;j++)
			{
				System.out.print(j);
			}
			a -= 1;
			for(int p = 1;p <= d;p++)
			{
				System.out.print(" ");
			}
			d += 2;
			for(int j = 1;j <= b;j++)
			{
				System.out.print(j);
			}
			b -= 1;
			System.out.println();
		}
	}
}