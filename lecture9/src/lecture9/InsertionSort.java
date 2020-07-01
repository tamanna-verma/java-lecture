package lecture9;
import java.util.Scanner;
public class InsertionSort {
public static int[] Input() {
Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=scan.nextInt();
}return arr;	
}

public static int[] InsertionSort(int arr[]) {
	int n=arr.length;int temp;
	for(int i=1;i<n;i++) {
	for(int j=i;j>0;j--) {
		if(arr[j]<arr[j-1] ){
			temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
			}
	}	
	}
	return arr;
}
public static void print(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
public static void main(String[] args) {
		int Array[]=Input();
		InsertionSort(Array);
		print(InsertionSort(Array));

	}

}
