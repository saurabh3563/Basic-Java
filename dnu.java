import java.util.Scanner;
class dnu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q,temp=0,i,j,ui=0,du=0;
		int a[]=new int[n];
		int d[]=new int[n];
		int u[]=new int[n];
		int s[]=new int[n];
		for(q=0;q<n;q++)
		{
			a[q]=sc.nextInt();
		}
		for(q=0;q<n;q++)
		{	
			for(i=q+1;i<n;i++)
			{
				if(a[q]==a[i])
				{
					d[du]=a[q];
					du++;
					break;
				}
			}
		}
		for (i=1;i<n;i++) 
		{
    		for (j=i;j>0;j--) 
    		{
     			if (a[j]<a[j-1])
     			{
     				temp=a[j];
      				a[j]=a[j-1];
      				a[j-1]=temp;
     			}
    		}
   		}
   		for(q=0;q<n;q++)
		{	
			for(i=q+1;i<n;i++)
			{
				if(a[q]!=d[i])
				{
					u[ui]=d[q];
					ui++;
					
				}
			}
		}
		System.out.println(ui);
		for(q=0;q<ui;q++)
		{
			System.out.println(u[q] );
		}

		System.out.println("\n"+du);
		for(q=0;q<du;q++)
		{
			System.out.println(d[q] );
		}
	}
}