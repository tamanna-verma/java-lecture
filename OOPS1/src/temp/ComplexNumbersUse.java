package temp;

public class ComplexNumbersUse {

	public static void main(String[]args) {

		ComplexNumbers c1=new ComplexNumbers(2,3);
		ComplexNumbers c2=new ComplexNumbers(4,5);
		c1.setImaginary(30);
		c1.setreal(10);
		c1.print();
		c1.add(c2);
		c1.print();
		c2.print();
		ComplexNumbers c3=new ComplexNumbers(3,2);
		c3.multiply(c2);
		c3.print();
		c2.print();
		ComplexNumbers c4=ComplexNumbers.add(c1,c2);
		c1.print();
		c3.print();
		c4.print();
		ComplexNumbers c5=c1.conjugate();
		c5.print();

	}

}
