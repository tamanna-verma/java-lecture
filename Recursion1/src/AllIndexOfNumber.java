import java.util.Scanner;

public class AllIndexOfNumber {
	public static int[] Input(int x) {
		Scanner scan=new Scanner(System.in);
		int Array[]=new int [x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();	
		}
		return Array;
	}
	public static int[] AllIndexes(int Array[],int y) {
		int si=0;
		int ResArr[]=new int[Array.length];
		int i=0;
		int Arr[]=returnIndexArray(Array,y,ResArr,i,si);
		return Arr;
	}
	public static int[] returnIndexArray(int Array[],int y,int ResArr[],int si,int i) {
		int arr[] = new int [i];
		if(si==Array.length) {
			for(int j =0; j<i;j++)
			{
				arr[j]= ResArr[j];
			}
			return arr;
		}
		if(Array[si]==y) {
			ResArr[i]=si;
			i++;
		}


		int ans[]=returnIndexArray(Array,y,ResArr,si+1,i);
		return ans;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int Arr[]=Input(x);
		int y=scan.nextInt();
		int Array[]=AllIndexes(Arr,y);

		for(int i=0;i<Array.length;i++) {

			System.out.print(Array[i]);
		}
	}

}
