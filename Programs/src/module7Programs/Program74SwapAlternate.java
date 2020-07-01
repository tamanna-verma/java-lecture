package module7Programs;
import java.util.Scanner;
public class Program74SwapAlternate {
public static int[] Input () {
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int Array[]=new int[x];
	for(int i=0;i<x;i++) {
		Array[i]=scan.nextInt();
	}
	return Array;
}
public static int[] SwappedArray(int Array[]) {
	int x=Array.length;int temp;
	for(int i=0;i<x;i=i+2) {
		temp=Array[i];
		Array[i]=Array[i+1];
		Array[i+1]=temp;
	}return Array;
	
}
public static void print(int Array[])
{int x=Array.length;
for(int i=0;i<x;i++) {
System.out.print(Array[i]+" ");
}
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int Arr[]	=Input();
	int SwAr[]=SwappedArray(Arr);
	print(SwAr);
	
	}

}
