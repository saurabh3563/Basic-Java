import java.util.Scanner;
public class mcafee {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[20];
		int b[]=new int[20];
		int c[]=new int[20];
		int f=0;
		int q=0;
		for(int i=0;i<=16;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					f++;
					System.out.print(f+"duplicate elements are"+a[j]+" ");
				}
				else{
					q++;
					System.out.print(q+"unique elements are"+a[i]+" ");
				}
			}
		}
		
		
	}

}
