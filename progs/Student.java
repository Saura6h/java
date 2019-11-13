import java.io.*;
import java.util.*;

class Student
{
	String rollno,fname,lname;
	int marks1,marks2,marks3;
	

	public void savetToFile()throws IOException
	{
		FileWriter fwrite=new FileWriter("Datasheet.txt",true);//true appends the file rather than overwriting it
		StringBuffer str=new StringBuffer("\nStudent");
		str.append("\n"+rollno);
		str.append("\n"+fname+" "+ lname);
		str.append("\n"+marks1);
		str.append("\n"+marks2);
		str.append("\n"+marks3);
		fwrite.write(str.toString());
		fwrite.close();
	}

	public void loadFromFile()throws IOException
	{
		File file =new File("Datasheet.txt");
		FileReader fread=new FileReader(file);
		StringBuffer str=new StringBuffer("");
		int i;    
        while((i=fread.read())!=-1)    
        	str.append((char)i); 
        fread.close();
        parseFromFile(str.toString());

	}
	public void parseFromFile(String str)
	{
		// System.out.println(str);
		String lines[] = str.split("\\r?\\n");
		for(int i=1;i<lines.length;i+=7)
		{
			System.out.print("roll number:");
			System.out.println(lines[i++]);
			System.out.print("Name:");

			System.out.println(lines[i++]);
			int mark_1=Integer.parseInt(lines[i++]);
			int mark_2=Integer.parseInt(lines[i++]);
			int mark_3=Integer.parseInt(lines[i++]);
			calAvg(mark_1,mark_3,mark_2);
		}
			
	}


	public void calAvg(int a,int b, int c)
	{
		System.out.println("Average Marks:"+(a+b+c)/3);
	}

	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll number:");
		this.rollno=sc.nextLine();
		System.out.print("Enter First Name:");
		this.fname=sc.nextLine();
		System.out.print("Enter Last Name:");
		this.lname=sc.nextLine();
		System.out.print("Enter  marks1:");
		this.marks1=sc.nextInt();
		System.out.print("Enter marks2:");
		this.marks2=sc.nextInt();
		System.out.print("Enter marks3:");
		this.marks3=sc.nextInt();
	}







	public static void main(String[] args)throws IOException {
		Student s1=new Student();
		s1.input();
		s1.savetToFile();
		s1.loadFromFile();
		
	}
}
		



// class LoadFile
// {

// }