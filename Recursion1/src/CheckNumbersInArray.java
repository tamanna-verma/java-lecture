import java.util.Scanner;
public class CheckNumbersInArray {
	public static int[] Input(int x) {
		Scanner scan=new Scanner(System.in);
		int Array[]=new int [x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();	
		}
		return Array;
	}



	public static boolean isthere(int Array[],int y) {
		int si=0;
		boolean ans=helper(Array,y,si);
		return ans;

	}	public static boolean helper(int Array[],int y,int si)
		{
			if(si==Array.length)
			{
				return false;
			}
			if(si==y) 
			{
				return true;
			}
			return helper(Array,y,si+1);

		}

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	int x=scan.nextInt();
	int Arr[]=Input(x);
	int y=scan.nextInt();
boolean res=isthere(Arr,y);
	System.out.println(res);
}
	}