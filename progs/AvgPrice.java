import java.util.Scanner;
class AvgPrice{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int list_len=5;
		int[] price_list=new int[list_len];
		System.out.println("Enter 10 price");
		double avg_price=0.0;
		for(int i=0;i<list_len;++i){
			price_list[i]=sc.nextInt();
			avg_price+=price_list[i]/list_len;

		}
		System.out.println("Average Price:"+avg_price);
		System.out.println("Prices Greater than avg price");
		for(int price:price_list){
			if (price>avg_price)
				System.out.print(price+"   ");
			}
		}

	}


