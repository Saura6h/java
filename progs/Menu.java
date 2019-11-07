import java.util.Scanner;
class Menu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("\t::MENU DRIVEN PROGRAM::\n\nDisplay MENU[y/n]?");
        char choice=sc.next().charAt(0);




        while(choice =='y' || choice=='Y'){
            System.out.println("\n<:::::::::::MENU::::::::::::>\n");
            System.out.println("CHOOSE\tFUNCTION");
            System.out.println("1\tDisplay fibonacci series");
            System.out.println("2\tCompute Factorial of a number ");
            System.out.println("3\tCheck whether a number is odd or even");
            System.out.println("4\tCheck whether a number is palindrome or not");
            System.out.print("\nEnter your choice::");
            int ch=sc.nextInt();
            




            switch (ch){
                case 1:
                    System.out.println("\t\tFIBONACCI SERIES\na series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.");
                    System.out.print("Enter end limit of the series:");
                    int ser_lim=sc.nextInt();
                    int a=0,b=1;
                    System.out.print(a+","+b);
                    while (b<ser_lim-a){
                        b+=a;
                        System.out.print(","+b);
                        a=b-a;
                    }
                    System.out.println();
                    break;    
                case 2:
                    System.out.println("\t\tFACTORIAL OF A NUMBER\nThe factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n:");
                    System.out.print("Enter number(n):");
                    int num=sc.nextInt();
                    int n=num;
                    int fact_num=num;
                    while(n>=2){
                        fact_num*=--n;
                    }
                    System.out.println("Factorial of you number: "+num+"\tis\t"+fact_num);
                    break;
                case 3:
                    System.out.println("\t\tIS IT ODD OR IS IT EVEN??\nA number divisible by 2 is EVEN else it is ODD");
                    System.out.println("Enter number(n):");
                    num=sc.nextInt();
                    if (num==0)
                        System.out.println("Your number is neither ODD nor EVEN");
                    else if(num%2==0)
                        System.out.println("Your number is EVEN");
                    else{
                        System.out.println("Your number is ODD");
                    }
                    break;


                case 4:
                    System.out.println("\t\tIS IT PALINDROME NUMBER\na PALINDROME number is a number that remains same even if the digits are reversed");
                    System.out.print("Enter number(n):");
                    String str=sc.next();
                    String rev_str="";
                    for(int i=0;i<str.length();++i){
                        rev_str=str.charAt(i)+rev_str;
                    }
                    if(str.equals(rev_str))
                        System.out.println("Your number is A PALINDROME");
                    else{
                        System.out.println("Your number is NOT a palindrome");
                    }
                    break;
                default:
                    System.out.println("The option you chose wasn't on the menu");

            }
            System.out.print("To continue press Y to exit press N::");
            choice=sc.next().charAt(0);
            System.out.println("\n\n\n");

        }
    }
}
