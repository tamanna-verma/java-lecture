package module10Programs;
import java.util.Scanner;
public class Program83PrintAllSubstring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n+1;j++) {
			System.out.println(str.substring(i,j));
		}
		}
	}

}
