package lecture10;
import java.util.Scanner;
public class SpiralPrint {
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
	 public static void spiralPrint(int matrix[][]){
	        int rows=matrix.length;
	        if(rows==0)
	        {
	            return;
	        }
	        int cols=matrix[0].length;
	        int rs=0;//row starting
	        int cs=0;//column starting
	        while(rs<rows&&cs<cols)
	        {
	            for(int i=cs;i<cols;i++)
	            {	
	                System.out.print(matrix[rs][i]+" ");
	            }
	            rs++;
	            for(int i=rs;i<rows;i++){
	                System.out.print(matrix[i][cols-1]+" ");

	            }
	            cols--;
	            for (int i=cols-1;i>=cs;i--){
	                System.out.print(matrix[rows-1][i]+" ");
	            }
	            rows--;
	            for(int i=rows-1;i>=rs;i--)
	            {
	                System.out.print(matrix[i][cs]+" ");
	            }
	            cs++; 
	        }
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {

			spiralPrint(input());
		}

	}

}
