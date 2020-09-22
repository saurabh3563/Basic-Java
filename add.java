import java.util.Scanner;
class pqr
{
	public static void main(String args[])
	{
	int n1,n2,s;
	Scanner o = new Scanner(System.in);
	System.out.println("Enter Number 1:");
	n1 = o.nextInt();

	System.out.println("Enter Number 2:");
	n2 = o.nextInt();

	o.close();
        s = n1 + n2;
        System.out.println("Sum of these numbers: "+s);

	}
}
