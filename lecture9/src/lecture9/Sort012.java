package lecture9;
import java.util.Scanner;
public class Sort012 {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;}
	public static void Sort(int arr[]){
		int n=arr.length;
		int zeroes=0;
		int ones=0;
		int two=0;
		for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			zeroes=zeroes+1;
		}if(arr[i]==1) 
		{
			ones=ones+1;
		}
		if(arr[i]==2) {
			two=two+1;
		}
		}
		for(int i=0;i<zeroes;i++) {
		System.out.print(0+" ");
		}
		for(int i=0;i<ones;i++) {
			System.out.print(1+" ");
		}
		for(int i=0;i<two;i++) {
			System.out.print(2+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Array[]=input();
			Sort(Array);
			
			}
	}

}
