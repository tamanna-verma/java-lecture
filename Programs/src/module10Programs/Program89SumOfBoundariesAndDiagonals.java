package module10Programs;
import java.util.Scanner;
public class Program89SumOfBoundariesAndDiagonals {
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
	public static int SUM(int Array[][]) {
		int n=Array.length;
		int m=Array[0].length;
		int RS=0;int RE=n-1;int CS=0;int CE=m-1;int i=0,j=0;
		int Sum=0;
		for(i=CS,j=RS;i<=CE;i++)
		{
			Sum=Sum+Array[j][i];
		}
		RS++;
		for( i=CE,j=RS;j<=RE;j++)
		{
			Sum=Sum+Array[j][i];

		}CE--;
		for(i=RE,j=CE;j>=CS;j--) 
		{
			Sum=Sum+Array[i][j];

		}
		RE--;
		for( i=CS,j=RE;j>=RS;j--)
		{
			Sum=Sum+Array[j][i];
		}
		CS++;
		if(n%2!=0) {
			while(RS<n/2) 
			{ 
				Sum=Sum+Array[RS][CS];
				Sum=Sum+Array[RS][CE];
				RS++;
				CS++;
				CE--;
			}
			if(RS==n/2) {
				Sum=Sum+Array[RS][CS];
				RS++;
				CS--;
				CE++;
			}
			while(RS>n/2&&RS<=RE) 
			{
				Sum=Sum+Array[RS][CS];
				Sum=Sum+Array[RS][CE];
				RS++;
				CS--;
				CE++;
			}}if(n%2==0) {

				while(RS<n/2) 
				{ 
					Sum=Sum+Array[RS][CS];
					Sum=Sum+Array[RS][CE];
					RS++;
					CS++;
					CE--;
				}
				while(RS>=n/2&&RS<=RE) 
				{
					Sum=Sum+Array[RS][CS];
					Sum=Sum+Array[RS][CE];
					RS++;
					CS--;
					CE++;
				}

			}
			return Sum;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[][]=Input();
		int x=SUM(Arr);
		System.out.print(x);
	}

}
