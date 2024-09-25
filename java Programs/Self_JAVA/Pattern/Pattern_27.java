/*
			1
			0 1
			1 0 1
			0 1 0 1
			1 0 1 0 1
*/

class Pattern_27{
	public static void main(String [] args){
		/*
		int num = 5;
		int a = 0;
		for(int i = 1;i <= num;i++)
		{
			if(i % 2 != 0)
				a = 1;
			else
				a = 0;
			for(int j = 1;j <= i;j++)
			{
				System.out.print(" "+a);
				if(a == 0)
					a = 1;
				else
					a = 0;
			}
			System.out.println();
		}
	}
}
*/		int num = 5;
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				if((j + i) % 2 == 0)
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}