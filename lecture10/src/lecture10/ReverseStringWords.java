package lecture10;
import java.util.Scanner;
public class ReverseStringWords {
	public static String reverse(String str) {
		int n=str.length();String Str="";

		for(int i=n-1,j=0;i>=0&&j<n+1;i--,j++) 
		{
			Str+=str.charAt(i);
		}
		return Str;
	}
	public static void reverseWords(String Str) {
		int n=Str.length();
		int start=0;
		String newstr="";
		for(int i=0;i<n;i++) {
			if(Str.charAt(i)==' ') 
			{
				for(int x=i-1;x>=start;x--) 
				{
					newstr+=Str.charAt(x);
				}
				newstr+=" ";  
				start=i+1;
			}
			if(i==Str.length()-1)
			{
				for(int x=i;x>=start;x--) 
				{
					newstr+=Str.charAt(x);
				}
			}
		}
		System.out.print(newstr);
	}
	//	public static void print(String Str) {
	//		int n=Str.length();
	//		for(int i=0;i<n;i++) {
	//			System.out.print(Str.charAt(i));
	//		}
	//	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		reverse (str);    
		reverseWords(reverse(str));
	}
}