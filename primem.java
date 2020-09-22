class primem
{
	public static void main(String args[])
	{
		int s=0,l;
		
		
			for(int i=20;i>=0;i--)
			{
				int k=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						
						k=1;
						break;
					}
				}
				if(k==0 && s<7)
				{
					System.out.println(i+" is a not prime no.");
					s++;
				}
				
			}
		
	}
}