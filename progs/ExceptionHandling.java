import java.util.*;
class ExceptionHandling
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do
		{
			try
			{	
				System.out.println("Enter TWO integer");
				String str=sc.next();
				String str1=sc.next();
				int n=Integer.parseInt(str);
				int n1=Integer.parseInt(str1);
				flag=false;
				System.out.println("SUM: "+(n+n1));
				System.out.println("DIFFERENCE: "+(n-n1));
			}

			catch(NumberFormatException nfe)
			{
				nfe.printStackTrace();
				System.out.println("ERROR:" + nfe.getMessage());
				System.out.println("Please Try again");

			}
		}while(flag);
	}
}
// class MyException extends Exception()
