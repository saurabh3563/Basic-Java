import java.util.Scanner;
class calc
{
	public static void main(String args[])
	{
		
		char o;
		int a,b,total;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter Number 1=");
		a=c.nextInt();
		System.out.println("Enter Operator=");
		o = c.next().charAt(0);
		System.out.println("Enter NUmber 2=");
		b=c.nextInt();
		switch(o)
		{
			case '+':
			{
				total=a+b;
				System.out.println("Total="+total);
				break;
			}
			case '-':
			{
				total=a-b;
				System.out.println("Total="+total);
				break;
			}
			case '*':
			{
				total=a*b;
				System.out.println("Total="+total);
				break;
			}
			case '/':
			{
				total=a/b;
				System.out.println("Total="+total);
				break;
			}
			default:
			{
				System.out.println("Invalid choice");
			}
		}
	}
}
		