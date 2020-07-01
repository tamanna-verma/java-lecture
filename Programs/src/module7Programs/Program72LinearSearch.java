package module7Programs;

import java.util.Scanner;

public class Program72LinearSearch {

	

	public static int[] Input (int x) {
		Scanner scan=new Scanner(System.in);
		int Array[]=new int[x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
public static int LinearSearch(int Array[],int y) {
	int n=Array.length;
	for(int i=0;i<n;i++) {
		if(Array[i]==y) {
			return i;
		}
	}return -1;
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int Arr[]=Input(x);
		int y=scan.nextInt();
		int LS=LinearSearch(Arr,y);
		System.out.println(LS);
		
	}

}
