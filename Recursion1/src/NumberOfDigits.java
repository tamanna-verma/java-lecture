
public class NumberOfDigits {
public static int Digits(int n)
{
	if(n==0) 
	{
		return 0;
	}
	if(n/10==0&&n>0) {
		return 1;
	}
	if(n>0) {
	
	// Digits(n/10);
	 int ans=Digits(n/10);
	
	return ans+1;
}
	return -1;
	}
	public static void main(String[] args) {
		int n=123456789;
		
	int res=	Digits(n);
	System.out.println(res);
	}

}
