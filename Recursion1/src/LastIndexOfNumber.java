import java.util.Scanner;

public class LastIndexOfNumber {
	public static int[] Input(int x) {
		Scanner scan=new Scanner(System.in);
		int Array[]=new int [x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();	
		}
		return Array;
	}
	public static int LastIndex(int Array[],int y) {
		int li=Array.length-1;
		int ans=returnLastIndex(Array,y,li);
		return ans;
	}
	public static int returnLastIndex(int Array[],int y,int li) {
		if(li<0) 
		{
			return -1;
		}
		if(Array[li]==y) {
			
			return li;
		}
int res=returnLastIndex(Array,y,li-1);
return res;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int x=scan.nextInt();
		int Arr[]=Input(x);
		int y=scan.nextInt();
		int ans=LastIndex(Arr,y);
System.out.println(ans);

	}

}
