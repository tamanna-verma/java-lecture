package module10Programs;
import java.util.Scanner;

public class Program85RowWiseSum {
	public static int[][] Input(){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();

		int Arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				Arr[i][j]=scan.nextInt();
			}
		}return Arr;
		}
	public static void RowWiseSum(int Array[][]) {
		int n=Array.length;
		int m=Array[0].length;
		
		for(int i=0;i<n;i++)
		{
			int Sum=0;
		for(int j=0;j<m;j++)
		{
			Sum=Sum+Array[i][j];
		}
		System.out.print(Sum+" ");
	}
	}
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int Arr[][]=Input();
RowWiseSum(Arr);


	}

}
