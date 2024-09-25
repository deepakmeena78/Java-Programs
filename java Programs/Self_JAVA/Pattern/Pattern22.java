class Pattern22
{
	public static void main(String arg[])
	{
		int row=5;
		
		for(int i=1;i<=row;i++)
		{
			int x=1;
			for(int j=1;j<=row-1+i;j++)
			{
				if(j>=row-i+1)
				{
					System.out.print(x+" ");
				x=j<row?++x:--x;}
				else
					System.out.print("  ");
			}				
			System.out.println("");
		}
	}
}