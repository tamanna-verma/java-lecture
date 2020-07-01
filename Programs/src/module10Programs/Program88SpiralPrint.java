package module10Programs;
import java.util.Scanner;
public class Program88SpiralPrint {
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
	}public static void SpiralPrint(int Array[][]) {
		int n=Array.length;
		int m=Array[0].length;
		int RS=0;int RE=n-1;int CS=0;int CE=m-1;int i=0,j=0;
		while(CE>=CS&&RE>=RS) {
		for(i=CS,j=RS;i<=CE;i++)
		{
			System.out.print(Array[j][i]+" ");
		}
			RS++;
			for( i=CE,j=RS;j<=RE;j++) {
				System.out.print(Array[j][i]+" ");
			}CE--;
			for(i=RE,j=CE;j>=CS;j--) {
				System.out.print(Array[i][j]+" ");
			}
		RE--;
		for( i=CS,j=RE;j>=RS;j--) {
			System.out.print(Array[j][i]+" ");
		}
		CS++;
	
		}
	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[][]=Input();
		SpiralPrint(Arr);
	}

}
