import java.util.Scanner;

class SWEA_1859
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++)
		{
			int a=sc.nextInt();
			int []arr=new int[a];
			for(int i=0;i<a;i++)
			{
				arr[i]=sc.nextInt();
			}
			int max=arr[a-1];
			long sum=0;
			for(int i=a-1;i>=0;i--)
			{
				if(arr[i]>max)
					max=arr[i];
				
				if(arr[i]<max)
					sum+=(max-arr[i]);
			}
			System.out.println("#"+t+" "+sum);
		}
	}
}
