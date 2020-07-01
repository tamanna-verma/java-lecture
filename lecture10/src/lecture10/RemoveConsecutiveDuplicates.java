package lecture10;
import java.util.Scanner;
public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
String str=scan.next();
int n=str.length();

String Str2="";
	for(int i=0;i<n;) {
		Str2+=str.charAt(i);
		while(i+1<n&&str.charAt(i+1)==str.charAt(i)) {
			i++;
		}
		i++;
	}System.out.print(Str2);
	}
	}

