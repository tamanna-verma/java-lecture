package Array;
import java.util.Scanner;
public class Unique
{
	public static void TakingInput()
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i =0;i<n;i++)
		{
			Array[i]=scan.nextInt();
		}
		for(int i =0;i<n;i++)
		{
			boolean isthere=false;
			for(int j=0;j<n;j++)
			{
				if(j==i)
				{
					continue;
				}
				if(Array[i]==Array[j])
				{
					isthere=true;	
					break;
				}	
			}
			if (isthere==false ) 
			{
				System.out.print(Array[i]);
				return;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int NumberOfTest=scan.nextInt();
		for(int x=1;x<=NumberOfTest;x++)	
		{
			TakingInput();
		}
	}
}