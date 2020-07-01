
public class datatype {

	public static void main(String[] args) {
char c='a';
System.out.println('a'+3);
System.out.println(c+3);
//c ia containing character a only ,so the same output will be printed.
int i=c+10;
System.out.println(i);
i=c;
//char c=i;       this is going to create an error because the characters are of 2 bytes and cant store an integer of 4 bytes
char abc=(char)i;
long l=i;
 l=12345678911L;
 int x=(int)l;
 //i=l;     we can copy a int into a long but we cant copy a long to an int }
double d=i;
//i=d;    int cannot have double in it but double can int within it
float f=1.23f;//in case of float we need to write a f after we write the integer
	System.out.println(abc);
	System.out.println(x); }
}
