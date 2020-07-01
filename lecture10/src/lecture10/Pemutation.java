package lecture10;
import java.util.Scanner;
public class Pemutation
{
	public static String input()
	{
		Scanner scan=new Scanner(System.in);
		String str="";
		str=scan.next();
		int n=str.length();
		return str;
	}
	public static void permutationCheck(String str1,String str2) {
		int n=str1.length();
		int m=str2.length();
		Boolean Permutation=true;
		int Array[]=new int[26];

		for(int i=0;i<n;i++)
		{
			Array[(int)(str1.charAt(i))-97]=Array[(int)(str1.charAt(i))-97]+1;
		}
		for(int j=0;j<m;j++)
		{
			if(Array[((int)(str2.charAt(j)-97))]>=1) 
			{
				Array[(int)(str2.charAt(j)-97)]=Array[(int)(str2.charAt(j)-97)]-1;
			}
			else
			{
				Permutation=false;
				break;
			}
		}
		System.out.println(Permutation);
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		{
			for(int i=0;i<NOQ;i++)
			{
				permutationCheck(input(),input());
			}
		}
	}

}
