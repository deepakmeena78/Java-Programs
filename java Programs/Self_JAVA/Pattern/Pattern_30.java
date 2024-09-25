/*
			    1
			   121
			  12321
			 1234321
			123454321
*/
class Pattern_30{
	public static void main(String args []){
	
	/*	
		int row = 5;
		for(int i = 1;i <= row;i++)
		{
			for(int j = 1;j <= row-i+1;j++)
			{
				System.out.print(" ");
			}
		
			for(int k = 1;k <= i;k++)
			{
				System.out.print(k);
			}
			
			int h = i - 1;
			for(int y = 1;y <= i - 1;y++)
			{
				System.out.print(h);
				h--;
			}
			System.out.println();
		}
	}
}
*/
 
		int row = 5;
		for(int i = 1;i <= row;i++){
	
			int x = 1;
			for(int j = 1; j <= row + i - 1;j++){
				if(j >= row - i + 1) {
					System.out.print(x);
					if(j >= row) 
					x--;
					else 
					++x;	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}