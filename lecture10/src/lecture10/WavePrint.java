package lecture10;
import java.util.Scanner;
public class WavePrint {
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
	public static void WavePrint(int Array[][]){
		
		int rows=Array.length;
		int columns=Array[0].length;
			for(int j=0;j<columns;j++) {
				if(j%2==0||j==0) {
				
				 for(int i =0;i<rows;i++) {
				
				System.out.print(Array[i][j]+" ");
				
				 }
				
				}else {
					for(int i=rows-1;i>=0;i--) {
					System.out.print(Array[i][j]+" ");
					}
				}
			}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			
WavePrint(input());
		}
	}

	}


