import java.util.Scanner;

class SWEA_1284
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++)
		{
			int result=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int n=a*e;
			int m=0;
			if(e<c)
			{
				m=b;
			}
			else
			{
				m=b+(e-c)*d;
			}
			result=Math.min(n, m);
			System.out.println("#"+t+" "+result);
		}

	}
}