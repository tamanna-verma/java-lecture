package module10Programs;
import java.util.Scanner;
public class Program90CheckPermutation {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str1=scan.nextLine();
	String str2=scan.nextLine();
	int Arr[]=new int[256];
	Boolean Permutation =true; 
	int n=str1.length();
	int m=str2.length();
	for(int i=0;i<n;i++) {
		Arr[str1.charAt(i)]=Arr[str1.charAt(i)]+1;
		}
	for(int i=0;i<m;i++) {
		Arr[str2.charAt(i)]=Arr[str2.charAt(i)]-1;
		}
	for(int i=0;i<256;i++)
	{
		if(Arr[i]!=0) 
		{
		Permutation=false;	
		
		}
	}
System.out.print(Permutation);
	}

}
