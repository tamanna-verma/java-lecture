package module10Programs;
import java.util.Scanner;
public class Program87WavePrint {
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
	public static void WavePrint(int Array[][]) {
		int n=Array.length;
		int m=Array[0].length;
		for(int i=0;i<m;i++) {
			if(i%2==0||i==0)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(Array[j][i]+" ");
				}
			}else
			if(i%2!=0) 
			{
				for(int j=n-1;j>=0;j--) {
					System.out.print(Array[j][i]+" ");
				}
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[][]=Input();
WavePrint(Arr);
	}

}
