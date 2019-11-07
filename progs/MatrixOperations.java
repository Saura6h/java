import java.util.Scanner;
class MatrixOperations{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("\t::MENU DRIVEN PROGRAM::\n\nDisplay MENU[y/n]?");
        char choice=sc.next().charAt(0);

//menu option

        while(choice =='y' || choice=='Y'){
            System.out.println("\n<:::::::::::MENU::::::::::::>\n");
            System.out.println("CHOOSE\tFUNCTION");
            System.out.println("1\tInput a Matrix");
            System.out.println("2\tAdd two Matrices ");
            System.out.println("3\tTranspose a given Matrix");
            System.out.println("4\tMultiply two Matrices ");
            System.out.println("5\tFind the determinant of the matrix ");
            // System.out.println("4\tCheck whether a number is palindrome or not");
            System.out.print("\nEnter your choice::");
            int ch=sc.nextInt();
            




            switch (ch){
            	case 1:{//inputting an matrix
            		System.out.print("Enter number of rows::");
					int rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					int cols=sc.nextInt();
					Matrix X1=new Matrix(rows,cols);    				
					X1.input();
					X1.show();
					break;}
				case 2:{
					System.out.println("Enter 1st Matrix");
	       			System.out.print("Enter number of rows::");
					int rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					int cols=sc.nextInt();
					Matrix X1=new Matrix(rows,cols);    				
					X1.input();

					System.out.println("Enter 2nd Matrix");
	       			System.out.print("Enter number of rows::");
					rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					cols=sc.nextInt();
					Matrix X2=new Matrix(rows,cols);    				
					X2.input();
					add(X1,X2);
					break;}
				case 3:
					{
            		System.out.print("Enter number of rows::");
					int rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					int cols=sc.nextInt();
					Matrix X1=new Matrix(rows,cols);    				
					X1.input();
					transpose(X1);
					break;}
				case 4:
					{						//input two matrices
					System.out.println("Enter 1st Matrix");
	       			System.out.print("Enter number of rows::");
					int rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					int cols=sc.nextInt();
					Matrix X1=new Matrix(rows,cols);    				
					X1.input();

					System.out.println("Enter 2nd Matrix");
	       			System.out.print("Enter number of rows::");
					rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					cols=sc.nextInt();
					Matrix X2=new Matrix(rows,cols);    				
					X2.input();
					multiply(X1,X2);
					break;
					}
				case 5:
					{
	       			System.out.print("Enter number of rows::");
					int rows=sc.nextInt();
					System.out.print("Enter number of columns::");
					int cols=sc.nextInt();
					Matrix X1=new Matrix(rows,cols);    				
					X1.input();
					System.out.println("The determinant ::"+X1.getDeterminant(X1.matrix));
					break;
					}
				default:
					System.out.println("::wrong option::");
			}
					
			System.out.print("To continue press Y to exit press N::");
            choice=sc.next().charAt(0);
            System.out.println("\n\n\n");
        }
	}



	static void add(Matrix xx,Matrix yy){
		if (xx.rows==yy.rows && yy.cols==xx.cols){
			Matrix sum_matrix=new Matrix(xx.rows,xx.cols);
			for(int i=0;i<xx.rows;i++){
				for(int j=0;j<xx.cols;j++){
				sum_matrix.matrix[i][j]=xx.matrix[i][j]+yy.matrix[i][j];

				}
			}
				sum_matrix.show();
		}else{
			System.out.println("Addition of matrices not possible as the dimensions of the two matrices are different");
		}



		// return sum_matrix;
	}




	static void multiply(Matrix xx,Matrix yy){
		Matrix product_matrix=new Matrix(xx.rows,yy.cols);
		if (xx.cols==yy.rows){
			for (int i=0;i<xx.rows;i++){
				for(int j=0;j<yy.cols;j++){
					for(int k=0;k<xx.cols;k++)
						product_matrix.matrix[i][j]+=xx.matrix[i][k]*yy.matrix[k][j];
				}
			}
			product_matrix.show();
		}else{
			System.out.println("The matrices cannot be multiplied");
		}


	}




	static void transpose(Matrix xx){
		Matrix transpose_matrix=new Matrix(xx.cols,xx.rows);
		for(int i=0;i<xx.rows;i++){
			for(int j=0;j<xx.cols;j++){
				transpose_matrix.matrix[j][i]=xx.matrix[i][j];
			}
		}
		transpose_matrix.show();



	}
}





class Matrix{
	int rows,cols;
	int matrix[][];
	int detmt;
	int total_elements;
	public Matrix(int n,int m){
		rows=n;
		cols=m;
		total_elements=rows*cols;
		detmt=0;
		matrix=new int[rows][cols];
	}
	void  show(){
		System.out.println("The Matrix::");
		for(int j=0;j<this.rows;++j){
			for(int i=0;i<this.cols;++i){
				System.out.print(this.matrix[j][i]+"\t");
			}
			System.out.println();

		}
	}

	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Matrix");
		// int j=0;
		for(int i=0;i<this.rows;++i){
			String str=sc.nextLine();

			int k=0;
			String[] row_input = str.split("\\s+");
			if(row_input.length!=this.cols){
				System.out.println("You have entered "+row_input.length+"cols ,while your matrix dimensions are "+this.rows+"X"+this.cols);
				System.out.println("Please enter the matrix correct ths time");
				this.input();			
			}else{
				for(String row_elements: row_input){
				this.matrix[i][k]=Integer.parseInt(row_elements);
				k++;
			}}
			
			// System.out.println();
		}	
	}
	int getDeterminant(int[][] mat){
		if (mat.length == 1)
        return mat[0][0];
    	if (mat.length == 2)
      	  return mat[0][0] * mat[1][1] - mat[1][0] * mat[0][1];
   		int sum = 0, sign = 1;
    	int newN = mat.length - 1;
    	int[][] temp = new int[newN][newN];
   		for (int t = 0; t < newN; t++) {
        	int q = 0;
        	for (int i = 0; i < newN; i++) {
            	for (int j = 0; j < newN; j++) {
              	  temp[i][j] = mat[1 + i][q + j];
            }
            if (q == i)
                q = 1;
        }
        sum += sign * mat[0][t] * getDeterminant(temp);
        sign *= -1;
    	}
    	return sum;
	}

}






