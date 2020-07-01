package lecture9;
import java.util.Scanner;
public class PutZeroesToEnd {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void PutZeroesToEnd(int arr[]) {
		int n=arr.length;int count=0;
		for(int i=0;i<n;i++) {
		if(arr[i]==0) 
		{
		count++;
		}else {
		System.out.print(arr[i]+" ");
		}
		}
		for(int i=0;i<count;i++) {
			System.out.print(0+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Array[]=input();
			PutZeroesToEnd(Array);
			}
	    }
	}
