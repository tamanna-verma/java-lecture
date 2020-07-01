package ClassesAndObjects;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1=new Fraction(20,30);
		f1.print();
		f1.setNumerator(22);
		f1.setDenominator(44);
		f1.print();
		Fraction f2=new Fraction(40,50);
		f1.add(f2);
		f1.print();
		Fraction f3=new Fraction(20,40);
		f3.multiply(f2);
		f3.print();
		Fraction f4= Fraction.add(f1, f2);
		f4.print();
	}

}
