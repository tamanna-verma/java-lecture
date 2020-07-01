package functions;


public class numberIsFibonnaciOrNot {
public static boolean isFibonacci(int n) {
	int a=0;int b=1; 
	while(true) {
	int c=a+b;
	a=b;
	b=c;
	if(n==a) {return true;}
	else if(a>n){return false;}
	}
}
	public static void main(String[] args) {
	boolean is5fibo=isFibonacci(5);
System.out.println(is5fibo);
	}

}
