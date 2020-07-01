package lecture10;
import java.util.Scanner;
public class HighestOccuringCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		char ch=' ';
		int max=Integer.MIN_VALUE;
		int Array[]=new int[256];
		for(int i=0;i<n;i++)
		{
			Array[str.charAt(i)]=Array[str.charAt(i)]+1;
		}for(int j=0;j<n;j++) {
		if(max<Array[str.charAt(j)]) {
	       max=Array[str.charAt(j)];	
		ch=str.charAt(j);}}
		System.out.print(ch);
	}

}
