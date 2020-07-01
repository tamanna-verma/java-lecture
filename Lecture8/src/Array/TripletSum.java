package Array;
import java.util.Scanner;
public class TripletSum {
public static int[]input(){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scan.nextInt();
	}
	return arr;	
}
public static int TripletSum(int arr[],int x) {
	int n=arr.length;int ts=0;
	for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
		for(int k=j+1;k<n;k++) {
			if(arr[i]+arr[j]+arr[k]==x) {
				ts=ts+1;
			}
		}
	}
	}
	return ts;
}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int NOQ=scan.nextInt();
	for(int i=0;i<NOQ;i++) {
		int Array[]=input();
		int x=scan.nextInt();
		int ts=TripletSum(Array,x);
		System.out.println(ts);
		
	}

	}

}
