package module1;
import java.util.Scanner;
public class Program6NameAndAverageMarks {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
char ch=scan.next().charAt(0);
int m1=scan.nextInt();
int m2=scan.nextInt();
int m3=scan.nextInt();
int average =(m1+m2+m3)/3;
System.out.println(ch);
System.out.println(average);
}

}
