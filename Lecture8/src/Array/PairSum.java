package Array;
import java.util.Scanner;
public class PairSum {
public static int[] input(){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
   for(int i=0;i<n;i++) 
	{
	arr[i]=scan.nextInt();
	}
	return arr;
}
public static int PairSum(int arr[],int x) {
	int ps=0;
	int n=arr.length;
	for(int i=0;i<n;i++) {
	 for(int j=i+1;j<n;j++) {
		 
		 if(arr[i]+arr[j]==x) {
			 ps=ps+1;
		 }
	 
	 }
	} 
	return ps;
} 
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int NumberOfQueries=scan.nextInt();
for(int i=0;i<NumberOfQueries;i++) {
	int Array[]=input();
	int x=scan.nextInt();
	int PS=PairSum(Array,x);
	System.out.println(PS);
}
	}

}
