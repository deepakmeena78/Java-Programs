class Decimal_To_Bainery{
	
	public static void main(String arg[]){
		
		int i=1, num = 29;
		long bai =0;
		for(;num>0;num/=2)
		{
			int rem = num%2;
			bai = bai +rem*i;
			// System.out.println(" : "+rem);
			i*=10;
		}
		System.out.println("Decimal to baibery = : "+bai);
	}
}