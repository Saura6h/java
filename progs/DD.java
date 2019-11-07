import java.util.Scanner;
class MatrixOperations{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		

	}






}
class Matrix{
	private int rows,cols;
	private int matrix[][];
	public Matrix(int n,int m){
		rows=n;
		cols=m;
		matrix[][]=new int[rows][cols];
	}
	void show(Matrix temp){
		for(int j=0;j<=temp.cols;++i){
			for(int i=0;i<=temp.rows;++i){
				System.out.print(temp.matrix[i][j]+"\t");
			}
			System.out.println();

		}
	
	private void input(Matrix temp){
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<=temp.rows;++i){
			System.out.println("Enter "+j+" Row");
			String row_input=sc.nextLine();
			int k=0;
			for(int i=0;i<row_input.length:i++){
				if(row_input.charAt(i)==" "){
					temp.matrix[j][k]=row_input.substring(i);
					row_input=row_input.substring(i+1,row_input.length-1);
				}
			} 


		}

	}





	}

}