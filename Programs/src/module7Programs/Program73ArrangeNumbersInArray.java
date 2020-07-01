package module7Programs;
import java.util.Scanner;
public class Program73ArrangeNumbersInArray {
	public static int[] Populate(int Array[])
	{
		int x=Array.length;int end=(Array.length)-1;int start=0;
		for(int i=1;start<=end&&i<=x;i++) {
			if(i%2!=0)
			{
				Array[start]=i;
				start=start+1;
			}
			else if(i%2==0) 
			{
				Array[end]=i;
				end=end-1;
			}
		}return Array;
	}
	public static void print(int Array[]) {
		int x=Array.length;
		for(int i=0;i<x;i++) {
			System.out.print(Array[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int Arr[]=new int[x];
		int ARRAY[]=Populate(Arr); 
print (ARRAY);
	}

}
