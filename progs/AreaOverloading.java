import java.util.Scanner;
class AreaOverloading{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("\n<:::::::::::MENU::::::::::::>\n");
        System.out.println("CHOOSE\tFUNCTION");
        System.out.println("1\tArea of a circle");
        System.out.println("2\tArea of a rectangle");
        System.out.println("3\tArea of a cylinder");
        System.out.print("Enter your choice::");

        int ch=sc.nextInt();
        input(ch);
	}
	static void input( int ch){
		Scanner sc=new Scanner(System.in);
		if (ch==1){
			System.out.print("Enter radius of the circle:");
			double radius=sc.nextDouble();
			area(radius);

		}else if(ch==2){
			System.out.print("Enter length and breadth of the rectangle:");
			double length=sc.nextDouble();
			double breadth=sc.nextDouble();
			area(length,breadth);

		}else if(ch==3){
			System.out.print("Enter height and radius of the Cylinder:");
			int height=sc.nextInt();
			double radius=sc.nextDouble();
			area(height,radius);

		}else{
			System.out.println("Wrong option");
		}

	}
	static void area(double rad){
		System.out.println(Math.PI*rad*rad);
	}
	static void area(double len,double breadth){
		System.out.println(len*breadth);
	}
	static void area(int ht,double rad){
		System.out.println(2*Math.PI*rad*ht+2*Math.PI*rad*rad);
	}
}