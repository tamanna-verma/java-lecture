package Array;
import java.util.Scanner;
public class Swapping {
	public static int[]takeInput(int n){
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void Swapping(int arr[])
	{
		int a;
		for(int i=0;i<arr.length-1;i=i+2)
		{
			a=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=a;
		}
	}
	public static void print(int SwappedArray[]) {
		int n=SwappedArray.length;
		for (int i=0;i<n;i++) {
			System.out.print(SwappedArray[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=takeInput(n);
		Swapping(array);
		print(array);
	}
}