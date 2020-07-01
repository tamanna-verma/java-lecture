package temp;

public class ComplexNumbers
{

	
		private int real;
		private	int imaginary;
		public  ComplexNumbers(int real,int imaginary)
		{
			this.real=real;
			this.imaginary=imaginary;

		}
		public int getreal()
		{
			return real;
		}
		public void setreal(int n) 
		{
			this.real=n;
		}
		public int getImaginary()
		{
			return imaginary;
		}
		public void setImaginary(int m)
		{
			this.imaginary=m;
		}	
		public void add(ComplexNumbers c2)
		{
			this.real=this.real+c2.real;
			this.imaginary=this.imaginary+c2.imaginary;

		}
		public ComplexNumbers conjugate()
		{
			int newreal=this.real;
			int newimaginary=-(this.imaginary);
			ComplexNumbers c=new ComplexNumbers( newreal, newimaginary);
			return c;
		}
		public static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c3)
		{
			int newreal=c1.real+c3.real;
			int newimaginary=c1.imaginary+c3.imaginary;
			ComplexNumbers c4=new ComplexNumbers(newreal,newimaginary);
			return c4;
		}
		public void print() 
		{
			System.out.println(this.real+"+"+this.imaginary+"i");

		}
		public void multiply(ComplexNumbers c2)
		{
			int x=	this.real;
			int y=this.imaginary;
			this.real=(x*c2.real-y*c2.imaginary);
			this.imaginary=((x*(c2.imaginary))+y*(c2.real));
		
	}

}
