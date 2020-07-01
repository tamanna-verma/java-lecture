package lecture10;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		int columns=scan.nextInt();
		int arr2d[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter the element at "+i+"row and "+j+" column");
				arr2d[i][j]=scan.nextInt();

			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++) 
			{
				System.out.print(arr2d[i][j]+" ");
			}System.out.println();
		}
	}

}
