package module10Programs;
import java.util.Scanner;
public class Program93RemoveCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		String remove=scan.next();
		char ch=remove.charAt(0);
		String str2="";
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==ch)
			{
				continue;
			}
			str2+=str.charAt(i);

		}System.out.print(str2);
	}

}
