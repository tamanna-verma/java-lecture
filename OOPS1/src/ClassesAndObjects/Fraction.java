package ClassesAndObjects;

public class Fraction 
{
	private int numerator;
	private int denominator;
	public Fraction(int numerator,int denominator) 
	{
		this.numerator = numerator;
		if(denominator==0)
		{
			//TODO error out
		}
		this.denominator = denominator;
		simplify();
	}
	public int getNumerator()
	{
		return numerator;
	}
	public void setNumerator(int n) 
	{
		this.numerator=n;
		simplify();
	}
	public int getDenominator() 
	{
		return denominator;
	}
	public void setDenominator(int d)
	{
		this.denominator=d;
		simplify();
	}
	private void simplify() {
		int gcd=1;
		int smaller=1;
		if(numerator>denominator) {
			smaller=denominator;
		}else if(denominator>numerator) {
			smaller=numerator;
		}
		for(int i=2;i<=smaller;i++) 
		{if(numerator%i==0&&denominator%i==0)
			gcd=i;

		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	public void print()
	{simplify();
	if(denominator==1) 
	{
		System.out.println(numerator);
	}else
	{
		System.out.println(numerator+"/"+denominator);
	}
	}
	public static Fraction add(Fraction f1,Fraction f2)
	{
		int newNum=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		int newDeno=f1.denominator*f2.denominator;
		Fraction f =new Fraction( newNum,newDeno ); 
		return f;
	}

	public void add(Fraction f2) 
	{
		this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		this .denominator=this.denominator*f2.denominator;
		simplify();
	}
	public void multiply(Fraction f2)
	{
		this.numerator=this.numerator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	
}