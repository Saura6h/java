import java.util.Scanner;
class AreaCalc implements Rect,Triangle
{
	public static void main(String[] args)
	{
		AreaCalc calculator=new AreaCalc();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  height and base of the triangle::");	
		double ht=sc.nextDouble();
		double bs=sc.nextDouble();
		calculator.triangleArea(ht,bs);
		System.out.println("Enter  length and breadth of the rectangle::");	
		int ln=sc.nextInt();
		int br=sc.nextInt();
		calculator.rectArea(ln,br);
	}
	public void triangleArea(double a, double b)
	{
		System.out.println("Area of triangle is ::"+(0.5*a*b));
	}
	public void rectArea(int _a,int _b)
	{
		System.out.println("Area of Rectangle is ::"+(_a*_b));

	}
}
// interface Rect
// {
// 	void rectArea(int a,int b);
// }
	
// interface Triangle
// {
// 	void triangleArea(double a ,double b);

// }