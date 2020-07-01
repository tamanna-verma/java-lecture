import java.util.Scanner;
public class CheckSortedBetter {
	public static int[] Input(int x) {
		Scanner scan=new Scanner(System.in);
		int Array[]=new int [x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();	
		}
		return Array;
	}
	public static boolean CheckSortedBetter(int Array[],int start) {
		if(start==Array.length-1) {
			return true;
		}
		if(Array[start]>Array[start+1]) {
			return false;

		}
		boolean ans=CheckSortedBetter(Array,start+1);
		return ans;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int Arr[]=Input(x);
		int start=0;
		boolean ans=	CheckSortedBetter(Arr,start);
		System.out.println(ans);
	}

}
