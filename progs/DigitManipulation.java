import java.util.Scanner;
class DigitManipulation{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		int sum_of_digits=0;
		int product_of_digits=1;
		int n=num;
		int rev_num=0;
		while(n!=0){
			int digit=n%10;
			sum_of_digits+=digit;
			product_of_digits*=digit;
			rev_num=rev_num*10+digit;
			n=n/10;
		}
		System.out.println("NUMBER\tSUM OF ITS DIGITS\tPRODUCT OF ITS DIGITS\tREVERSE OF YOUR NUMBER");
		System.out.println(num+"\t"+sum_of_digits+"\t\t\t"+product_of_digits+"\t\t\t"+rev_num);


	}




}