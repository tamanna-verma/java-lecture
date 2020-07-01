package lecture10;
import java.util.Scanner;
public class RowWiseSum {
public static int[][] Input(){
	Scanner scan=new Scanner (System.in);
	int rows=scan.nextInt();
	int columns=scan.nextInt();
	int array[][]=new int[rows][columns];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
		array[i][j]=scan.nextInt();
		}
	}
	return array;
}
public static void RowWiseSum(int array[][]){
	int rows=array.length;
	int columns=array[0].length;
	
	int arr[]=new int[rows];
	for(int i=0;i<rows;i++)
	{int Sum=0;
	for(int j=0;j<columns;j++)
	{
		Sum=Sum+array[i][j];
	}
	arr[i]=Sum;
	}
	for(int i=0;i<rows;i++)
	{
	
			System.out.print(arr[i]+" ");
		
	}
}	
public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
		RowWiseSum(	Input());
		}

	}

}
