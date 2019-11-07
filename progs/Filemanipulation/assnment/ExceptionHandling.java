import java.util.Scanner;
class ExceptionHandling
{
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter a positive No:");
			int num=sc.nextInt();
			if (num<0)
			{
				throw new Exception("MyException");
			}
			else
			{
				System.out.print("Hurrah!!You entered a positive number");
			}
		}
		catch (Exception MyException)
		{
			System.out.print("NegativeInputException: Negative iput fed while expecting a positive input");
		}
	}
}