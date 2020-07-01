package lecture9;

import java.util.Scanner;

public class Sort012Method2 {
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
	        int start=0;
	        int end=n-1;
	        int i=0;
	        while(i<=end) 
	        {
	            if(arr[i]==0)
	            {
	                int temp = arr[start];
	                arr[start] = arr[i];
	                arr[i]= temp;
	                i++;
	                start++;
	            }
	            else if(arr[i]==2)
	            {
	                int temp=arr[end];
	                arr[end]=arr[i];
	                arr[i]=temp;
	                end--;
	            }
	            else
	            {
	                i++;
	                }}}
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Array[]=input();
			Sort(Array);
		}  
	}

}
