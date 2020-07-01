package module7Programs;

import java.util.Scanner;

public class Program76FindDuplicate {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static void FindDuplicate(int Array[]) {
		int n=Array.length;
		for(int  i=0;i<n;i++)
		{
		
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}
				 if(Array[i]==Array[j])
				 {
					 System.out.print( Array[i]);
					 
					 Array[j]=Integer.MIN_VALUE;
					 break;
				 }
			}
		}
		
	//	System.out.print(-1);
		
	}
	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
int Arr[]=Input();
FindDuplicate(Arr);

	}

}
