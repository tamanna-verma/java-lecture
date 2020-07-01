package ClassesAndObjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Student s1=new Student();
		s1.setrollno(121);
		s1.name="Tamanna";
Student s2=new Student();
s2.setrollno(-123);
s2.name="Gunjan";
System.out.println(s1.name );
System.out.println(s2.name );
System.out.println(s1.getrollno());
	}

}
