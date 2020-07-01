package temp;

public class Polynomial 
{
	private int Coefficient[];
	public Polynomial()
	{
		Coefficient=new int[5];

	}
	public  void setCoefficient(int degree,int Coeff) 
	{
		while (true)
		{
			if(degree<Coefficient.length) 
				break;
			restructure();
		}
		Coefficient[degree]=Coeff;
	}
	public void restructure()
	{
		int temp[]=new int[Coefficient.length*2];
		for(int i=0;i<Coefficient.length;i++)
		{
			temp[i]=Coefficient[i]; 
		}
	}
	public void print() 
	{
		for(int i=0;i<Coefficient.length;i++)
		{
			if(Coefficient[i]!=0) 
			{
				System.out.print(Coefficient[i]+"x"+i+" ");

			}

		}System.out.println();
	}
	public int get(int degree) 
	{
		if(degree<Coefficient.length)
		{
			return Coefficient[degree];
		}return 0;
	}
	public Polynomial subtract(Polynomial p) 
	{
		Polynomial result=new Polynomial();
		int max=Math.max(p.Coefficient.length,this.Coefficient.length);
		for(int i=0;i<max;i++)
		{
			int diff=this.get(i)-p.get(i);
		result.setCoefficient(i,diff);
		}
		return result;
	}
	
	public Polynomial add(Polynomial p)
	{
		Polynomial result=new Polynomial();
		int max=Math.max(p.Coefficient.length,this.Coefficient.length);
		for(int i=0;i<max;i++)
		{
			int sum=this.get(i)+p.get(i);
		result.setCoefficient(i,sum);
		}
		return result;

	}public static Polynomial add(Polynomial x,Polynomial y)
	{
		Polynomial result=new Polynomial();
		int max=Math.max(x.Coefficient.length,y.Coefficient.length);
		for(int i=0;i<max;i++)
		{
			int sum=x.get(i)+y.get(i);
		result.setCoefficient(i,sum);
		}
		return result;

	}
	public Polynomial multiply(Polynomial p) 
{
		Polynomial result=new Polynomial();
		
		for(int i=0;i<this.Coefficient.length;i++)
		{
		for(int j=0;j<p.Coefficient.length;j++) {
			int earlierPresentCoeff=result.get(i+j);
			result.setCoefficient(i+j, earlierPresentCoeff+(this.get(i)*p.get(j)));
			
		}	
		}
return result;
}
}