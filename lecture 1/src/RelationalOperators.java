import java.util.Scanner;
public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int i=scan.nextInt();
int j=scan.nextInt();
boolean iseq=(i==j);
boolean isgreat=(i>j);
boolean issmall=(i<j);
boolean isgreateq=(i>=j);
boolean islesseq=(i<=j);
System.out.println("IS EQUAL"+iseq);
System.out.println("IS GREATER"+isgreat);
System.out.println("IS SMALLER"+issmall);
System.out.println("IS LESS THAN OR EQUAL"+islesseq);
System.out.println("IS GREATER THAN OR EQUAL"+isgreateq);

	}

}
