package module7Programs;
import java.util.Scanner;
public class Program75FindUnique {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int Unique(int Array[])
	{
		int n=Array.length; 
		
		for(int i=0;i<n;i++) 
		{
			boolean unique=true;
			for(int l=0;l<n;l++)
			{
				if(i==l) {
					continue;
					}
				if(Array[i]==Array[l])
				{
					unique=false;
                    break;
				}
				}
			if(unique==true)
			{
				return Array[i];
				
			}
		}
	 return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Noq=scan.nextInt();
		for(int i=0;i<Noq;i++) {
			int Arr[]=Input();
			int x=Unique(Arr);
			System.out.print(x);
		}

	}

}
