import java.util.Scanner;
class RATE 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s=0,n=0;
		int a[]=new int[5];
		int b[]=new int[5];
		for(int q=0;q<3;q++)
		{
			a[q]=sc.nextInt();
		}
		for(int w=0;w<3;w++)
		{
			b[w]=sc.nextInt();
		}
		for(int i=0;i<=2;i++)
		{

			if(a[i]>b[i])
			{
				s++;
			}
			else if(a[i]<b[i])
			{
				n++;
			}
			
		}
		System.out.println(s+ " "+n);

	}
}