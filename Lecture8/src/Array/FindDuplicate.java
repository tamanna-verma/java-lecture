package Array;
import java.util.Scanner;
public class FindDuplicate
{
	public static void  FindDuplicate()
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int a=0;a<n;a++)
		{
			boolean isDUPLICATE=false;
			for(int b=0;b<n;b++) 
			{
				if(a==b)
				{
					continue;
				}
				if(arr[a]==arr[b])
				{
					isDUPLICATE=true;
				
				}

			}

			if(isDUPLICATE==true)
			{
			 System.out.println(arr[a]);
			 return;
			}

		}

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		for(int i=0;i<x;i++) {
			FindDuplicate();	
		}	}

}
