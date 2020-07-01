package Array;
import java.util.Scanner;
public class Sort01 {
public static int[] input() {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
	arr[i]=scan.nextInt();
	}
	return arr;
}
public static int[]sort(int arr[]){
	int n=arr.length;int Zeroes=0;int Ones=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]==0)
	{Zeroes=Zeroes+1;
	}else if(arr[i]==1) {
		Ones=Ones+1;
	}}
	for(int l=0;l<Zeroes;l++) {
		arr[l]=0;
	}
	for(int m=Zeroes;m<n;m++) {
		arr[m]=1;
	}return arr;
}
public static void Print(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int NOQ=scan.nextInt();
for(int i=0;i<NOQ;i++) {
	int Array[]=input();
	sort(Array);
	Print(sort(Array));
}

	}

}
