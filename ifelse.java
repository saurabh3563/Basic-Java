import java.util.Scanner;
class ifelse
{
	public static void main(String args[])
	{
		int  a,b,c,grade,total=0,i;
		String name;
		Scanner st = new Scanner(System.in);
		name= st.nextLine();
		System.out.println("Student Name:"+name);
		System.out.println("Enter Subject 1 marks:");
		a=st.nextInt();
		System.out.println("Enter Subject 2 marks:");
		b=st.nextInt();
		System.out.println("Enter Subject 3 marks:");
		c=st.nextInt();
		
		total=total+a+b+c;
		grade=total/3;
		System.out.println("Grade : "+grade);
		if(grade>=90)
		{
			System.out.println("A Grade");
		}
		else if(grade<=90 &&  grade>=80)
		{
			System.out.println("B grade");
		}
		else if(grade<=80 &&  grade>=70)
		{
			System.out.println("C grade");
		}
		else if(grade<=70 &&  grade>=60)
		{
			System.out.println("D grade");
		}
		else if(grade<=60 &&  grade>=50)
		{
			System.out.println("E grade");
		}
		else{
			System.out.println("Need Improvement");
		}
		
		
	}
}