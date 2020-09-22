import java.util.Scanner;
class rev
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i,r=0;
		System.out.println("Enter Number You Wnat to REverse=");
		n=s.nextInt();
		while(n!=0)
		{
			i=n%10;
			r=r+(i*i*i);
			n/=10;
		}
		System.out.println("Reversed Number is "+r);
	}
}
			
			