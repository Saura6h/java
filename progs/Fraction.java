import java.util.*;
class Fraction
{
	double num,denum;
	Fraction(int a,int b)
	{
		num=a;
		denum=b;
	}

	Fraction(double a, double b)
	{
		num=a;
		denum=b;
	}

	void show()
	{
		if(denum!=0)
		{
			if(num==0)
				System.out.println("0");
			else
				System.out.println(num+"/"+denum);
		}else{
			throw new ArithmeticException("/ by zero");
		}
	}

	public static void main(String[] args) 
	{
			Fraction f1=new Fraction(5,3);
			Fraction f2=new Fraction(5.2,3.2);
			Fraction f3=new Fraction(5,0);
			Fraction f3=new Fraction(5,0);
		try{
			f1.show();
			f2.show();
			f3.show();
		}
		catch(Exception e){
			System.out.println("Denominator should not be zero");

		}

	}
}