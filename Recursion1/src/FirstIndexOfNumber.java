import java.util.Scanner;
public class FirstIndexOfNumber {
	public static int[] Input(int x) {
		Scanner scan=new Scanner(System.in);
		int Array[]=new int [x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();	
		}
		return Array;
	}
	public static int FirstIndex(int Array[],int y) {
		int si=0;
		int ans=returnIndex(Array,y,si);
		return ans;

	}
	public static int returnIndex(int Array[],int y,int si) {
		 if(si==Array.length){
	            return -1;
	        }
		if(Array[si]==y) {
			return si;

		}
		int ans=returnIndex(Array,y,si+1);
		return ans;

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int x=scan.nextInt();
		int Arr[]=Input(x);
		int y=scan.nextInt();
		int ans=FirstIndex(Arr,y);
System.out.println(ans);
	}

}
