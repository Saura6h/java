
import java.util.Scanner;

class ArmstrongInArray{

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of the array:");
int arr_len=sc.nextInt();
int[] arr=new int[arr_len];
System.out.println("Enter positive numbers");
for(int i=0;i<arr_len;++i){
	arr[i]=sc.nextInt();
	if (arr[i]<0){
		System.out.println("Only positive inputs are valid");
		--i;
	}

}
System.out.println("THE ARRAY:");
for (int element:arr){
	System.out.println("\t"+element);
}
System.out.println("The armstrong Numbers in the array");

for(int element:arr){
	int temp=element;
	int sum=0;
	while(temp!=0){
		int digit=temp%10;
		sum+=digit*digit*digit;
		temp/=10;
	}
	if (sum==element)
		System.out.print(element+"   ");


}
}
}


