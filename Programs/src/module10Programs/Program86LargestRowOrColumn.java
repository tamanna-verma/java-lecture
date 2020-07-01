package module10Programs;
import java.util.Scanner;
public class Program86LargestRowOrColumn {
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
	public static void LargestRowAndColumn(int Array[][]){
		int n=Array.length;
		int m=Array[0].length;
		int LargestRow=Integer.MIN_VALUE;
		int LargestColumn=Integer.MIN_VALUE;
		int ColNum=0;int RowNum=0;
		for(int i=0;i<n;i++)
		{
			int Sum=0;
			for(int j=0;j<m;j++)
			{
				Sum=Sum+Array[i][j];

			}
			if(Sum>LargestRow) 
			{
				LargestRow=Sum;
				RowNum=i;
			}
		}
		for(int i=0;i<m;i++)///yaha i h 
		{
			int Sum1=0;
			for(int j=0;j<n;j++)// yaha j haicool i got it hmmmthankuuu
			{
				Sum1=Sum1+Array[j][i];

			}
			if(Sum1>LargestColumn) 
			{
				LargestColumn=Sum1;
				ColNum=i;
			}
		}
		if(LargestRow>=LargestColumn) {
			System.out.print("Row"+RowNum+LargestRow);
		}else if(LargestColumn>LargestRow){
			System.out.print("Column"+ColNum+LargestColumn);//input do wait
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[][]=Input();
		LargestRowAndColumn(Arr);

	}

}
