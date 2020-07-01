
public class SumOfNaturalNumbers {
public static int SumofNaturalNumbers(int n) {
	if(n==1) {
		return 1;
	}
	return n+SumofNaturalNumbers(n-1);
	
}
	public static void main(String[] args) {
		int n=5;
		int y=SumofNaturalNumbers(n);
System.out.println(y);
	}

}
