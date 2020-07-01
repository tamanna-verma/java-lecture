package module7Programs;
import java.util.Scanner;
public class Program80Sort01 {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int[] SortArray(int Array[]) {
		Scanner scan=new Scanner(System.in);
		int n=Array.length;
        int start=0;
        int end=n-1;
        int i=0;
        while(i<=end) 
        {
            if(Array[i]==0)
            {
                int temp = Array[start];
                Array[start] = Array[i];
                Array[i]= temp;
                i++;
                start++;
            }
            else if(Array[i]==1)
            {
                int temp=Array[end];
                Array[end]=Array[i];
                Array[i]=temp;
                end--;
            }else {
            	i++;
            }
        }return Array;
        }//		int n=Array.length;int count0=0;int count1=0;
            
//		for(int i=0;i<n;i++) 
//		{
//		if (Array[i]==0)
//		{
//			count0++;
//		}else 
//		{
//			count1++;
//		}
//		}for(int i=0;i<count0;i++) {
//			System.out.print("0");
//		}
//		for(int i=0;i<count1;i++) {
//			System.out.print("1");
//		}
	public static void print(int Array[])
	{int x=Array.length;
	for(int i=0;i<x;i++) {
	System.out.print(Array[i]+" ");
	}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[]=Input();
		int Array[]=SortArray(Arr);
print(Array);
	}

}
