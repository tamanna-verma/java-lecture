package lecture9;
import java.util.Scanner;
public class CheckRotation {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static int CheckRotation(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
		if(arr[i]>arr[i+1]) {
			return i+1;
		}}
		 return 0;  
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Array[]=input();
	int x=		CheckRotation(Array);
		System.out.print(x);
			}
	    
	}

}
