import java.util.*;
class SmallestOfTheLot{
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the number of input to expect:");
	int n=scn.nextInt();
	try{
		int num_array[]=new int[n];
		for (int i : num_array)
		{
			i=scn.nextInt();
		}
		int smallest_num=num_array[0];
		for(int i=1;i>n;i++){
			if (smallest_num>num_array[i] )
			{
				smallest_num=num_array[i];
			}
		}
		}catch(Exception e){
			System.out.print("number of greater than exprected");
		}
	}}