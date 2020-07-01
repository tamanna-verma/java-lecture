package module2;
import java.util.Scanner;
public class Program12CharacterCase {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().charAt(0);
	if((ch<=90)&&(ch>=65)) {
		System.out.println("1");
		return;
	}
if((ch<=122)&&(ch>=97)) {
	System.out.println("0");
	return;
}
else {  
	
	System.out.println("-1");
} 


	}

}
