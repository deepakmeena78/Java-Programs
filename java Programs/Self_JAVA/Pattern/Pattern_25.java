class Pattern_25{
	public static void main(String args []){
		
		int num = 5;
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
				System.out.print(j);
			}
			a = a + 2;
			System.out.println();
		}
	}
}
		