package module10Programs;
import java.util.Scanner;
public class Program82CheckPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		Boolean Palindrome=true;
		int n=str.length();
		for(int i=0,j=n-1;i<n&&j>0;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
			 Palindrome=false;
			 
			}
		}
System.out.print(Palindrome);
	}

}
