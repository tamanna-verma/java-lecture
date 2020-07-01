package lecture9;
import java.util.Scanner;
public class BubbleSort {
	public static int[] Input() {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}return arr;
	}
	public static int[] BubbleSort(int arr[]) {
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-i-1;j++) {
        	if(arr[j]>arr[j+1]) {
        		 temp=arr[j];
        		arr[j]=arr[j+1];
        		arr[j+1]=temp;
        	}
        }   
		}	return arr;
	}
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int Array[]=Input();
BubbleSort(Array);
print(BubbleSort(Array));
	}

}
