package Array;
import java.util.Scanner;
public class ArrangeNumbersInArray {
public static int[]ArrangingNumbersInArray(int n){
	int arr[]=new int[n];int val=1;int value=n;int newval=n-1;
	for(int i=0;i<((n-1)/2)+1;i++) {
		arr[i]=val;
		val=val+2;
	}
	if(n%2==0) {
		for(int i=((n-1)/2)+1;i<n;i++) {
			arr[i]=value;
			value=value-2;
		}
	}
	if(n%2!=0) {
		for(int i=(((n-1)/2)+1);i<n;i++) {
		arr[i]=newval;
		newval=newval-2;
		}
	}
	return arr;
}
public static void print(int arr[]){
	int n=arr.length;
	for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
	
	}
}

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
int Arr[]=ArrangingNumbersInArray(n);
print(Arr);
	}

}
