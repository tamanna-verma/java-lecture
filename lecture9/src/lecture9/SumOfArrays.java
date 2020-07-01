package lecture9;
import java.util.Scanner;
public class SumOfArrays {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}return arr;
	}
	public static int[] OutputArray(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int x;
		if(n>m) {
			x=n+1;
		}else {
			x=m+1;
		}
		int Array[]=new int[x];
		return Array;
	}
	public static int[] AddingArray (int arr1[],int arr2[],int arr3[]) {
		int n=arr1.length;
		int m=arr2.length;
		int x=arr3.length;int Sum;int rem=0;int a,b,i;

		for( i=x-1, a=n-1,b=m-1;a>=0&&b>=0;a--,b--) {
			Sum=arr1[a]+arr2[b]+rem;
			arr3[i]=Sum%10;
			rem=Sum/10;
			i--;
		}while(a>=0) {
			Sum=arr1[a]+rem;
			arr3[i]=Sum%10;
			rem=Sum/10;
			a--;
			i--;
		}
		while(b>=0) {
			Sum=arr2[b]+rem;
			arr3[i]=Sum%10;
			rem=Sum/10;
			b--;
			i--;
		}
		return arr3;
	}

	public static void Print(int arr4[]){
		int n=arr4.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr4[i]+" ");
		}

	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int arr1[]=input();
			int arr2[]=input();
			int arr3[]=OutputArray(arr1,arr2);
			int arr4[]=AddingArray(arr1,arr2,arr3);
			Print(arr4);
		}
	}
}

