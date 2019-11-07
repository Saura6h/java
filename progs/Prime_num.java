import java.util.Scanner;
class Prime_num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t::Prime number checking Program::\nA number is prime if it has only two factors 1 and the number itself");
         System.out.println("Enter a Number:");
         int num=sc.nextInt();
         for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                 System.out.println("Number is not prime");
                 System.exit(0);
            }
            }
             System.out.println("Your Number:"+num+" is prime");
         }
    }
