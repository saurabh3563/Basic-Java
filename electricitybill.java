import java.util.Scanner;
class electricitybill
{
	public static void main(String args[])
	{
	int unit,b1,b2;
	double result,pb0,pb1,pb2,pb3;
	Scanner c=new Scanner (System.in);
	System.out.print("Enter Units Consumed:");
	unit=c.nextInt();
	if(unit>=0 && unit<=50)
	{
		result=unit*3.20;
		System.out.print("Total Units Consumed is "+unit+" for rs "+result);
	}
	else 
	{
		b1=unit-50;
		pb0=50*3.20;
		
		if(b1>150)
		{
			b2=b1-150;
			pb1=150*3.50;
			pb2=b2*4.00;
			result=pb0+pb1+pb2;
			System.out.println("Total Units Consumed is "+unit+" for rs "+result);
		}
		else{
			pb3=b1*3.50;
		System.out.println("Total Units Consumed is "+unit+" for rs "+(pb0+pb3));
		}
	}
	}
}