import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		int a=0,b=1,c=0,n;
		Scanner u=new Scanner(System.in);
		System.out.println("Enter Number Till u want ");
		n=u.nextInt();
		for(int i=0;i<n;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
		}
		System.out.println("Fiba="+c);
	}
}
		