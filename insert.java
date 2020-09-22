import java.util.Scanner;
class pp
{
	public static void main(String args[]) {
		int n,c=0,i,j,a[],b[];
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		n = sc.nextInt();
		
		while(n > 0) {
			n = n / 10;
			c = c + 1;
		}
			for(i=c;i>0;i--)
			{
				int fact=1;
				for(j=1;j<=c;j++)
				{
					fact=fact*10;
				}
				a[i]=n/fact;
				b[i]=n%fact;
			}
			int final=0;
			for(i=1;i<=4;i++)
			{
				
				final=final+a[i];
			}
			final=final+b[1];
			System.out.println("Addition="+final);
			
}


	