public class ppp {

	public static void main(String[] args) 
	{
		int i,n,c,s=0; 
		for(n=530; n>= 0;n--)
		{
			c=0;
		    for (i=2;i<=n/2; i++)
		    {
		    	if(n%i== 0)
		    	{
		    		c++;
		    		break;
		    	}
		    }
		    if(c==0 && n!=1 && s<7)
		    {
		    	System.out.print(n+ " ");
		    	s++;
		    }  
		}
	}
}