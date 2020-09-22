class xy
{
	public static void main(String args[])
	{
		
		
			int flag=0,p=0,num=530;
			for(int j=num;j>0;j--)
			{System.out.println(num + " is a prime number.");
				while(p<7)
				{

					for(int i = 2; i <= num/2; ++i)
        			{
            			if(num % i == 0)
            			{
                			flag = 1;
                			break;
            			}
        			}

        			if (flag==0)
        			{
        				System.out.println(num + " is a prime number.");
        				p++;
        			}
        		}
            }		 
		
	}
}