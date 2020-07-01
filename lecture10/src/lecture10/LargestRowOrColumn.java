package lecture10;
import java.util.Scanner;
public class LargestRowOrColumn
{
	public static int[][]input()
	{
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		int columns=scan.nextInt();
		int Array[][]=new int [rows][columns];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("enter the value at"+i+"row and"+j+"column");
				Array[i][j]=scan.nextInt();

			} 
		}
		return Array;
	}
	public static void FindlargestRowColumns(int Array[][])
	{
		int rows=Array.length;if(rows==0){
            System.out.println("row 0"+Integer.MIN_VALUE);
        }
		int Columns=Array[0].length ;
		int LargestColSum=Integer.MIN_VALUE;
		int LargestRowSum=Integer.MIN_VALUE;
		int row=0;
		int Column=0;
		if(Array.length==0) {
			return;
		}
		for(int i=0;i<rows;i++) 
		{
			int Sum=0;
			for(int j=0;j<Columns;j++) 
			{
				Sum=Sum+Array[i][j];
			}
			if(LargestRowSum<Sum)
			{row=i;
			LargestRowSum=Sum;
			}

		}
		for(int j=0;j<Columns;j++) {
			int sum=0;
			for(int i=0;i<rows;i++)
			{
				sum=sum+Array[i][j];//wo wala kaha h?//yhape to ye syi chlra tha// index dekhna dono kbhyi mne dekhlie wps dekho i j hi likha h i 
				
			}if(LargestColSum<sum) 
			{Column=j;
			LargestColSum=sum;
			}
		}
		if(LargestRowSum>LargestColSum )
		{
			System.out.println("row"+" "+row+" "+LargestRowSum);
		}
		if(LargestRowSum<LargestColSum )
		{
			System.out.println("column"+" "+Column+" "+LargestColSum);
		}else if(LargestRowSum==LargestColSum )
		{
			System.out.println("row"+" "+row+" "+LargestRowSum);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			
FindlargestRowColumns(input());
		}
	}

}
