import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int value=n;
			
			int i=1;
			while(i<=10) {
				
			
		System.out.print(value);
		value=value+n;		
				
			System.out.println();	
			i=i+1;
			}		
				
				
	}
}
