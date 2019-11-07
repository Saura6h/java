import java.util.Scanner;

class ArrayStats{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[10];
		System.out.println("Enter 10 number");

		for(int i=0;i<10;++i){
			numbers[i]=sc.nextInt();

		}
		int equal_count,greater_count,smaller_count;
		equal_count=greater_count=smaller_count=0;
		System.out.print("Now enter an integer::");
		int integ=sc.nextInt();
		for(int number:numbers){
			if (number==integ)
				equal_count++;
			else if (number>integ)
				greater_count++;
			else
				smaller_count++;

			}
		System.out.print("Number equal to the integer:\t"+equal_count+"\nNumber greater than the integer:\t"+greater_count+"\nNumber smaller than the integer:\t"+smaller_count);
		}

	}


