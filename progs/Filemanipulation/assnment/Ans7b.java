import java.util.Scanner;
class Person
{
	String name;
	int age;
	protected Person()
	{
		name="xxxxx";
		age=18;

	}
	protected Person(String s)
	{
		name=s;
		age=18;		
	}
	protected Person(String s,int a)
	{
		name=s;
		age=a;		
	}
	void show()
	{
		System.out.println(name+"\n"+age);
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person's name:");
		name=sc.nextLine();
		System.out.println("Enter Person's age");
		age=sc.nextInt();
	}

}

class Employee extends Person
{
	String Emp_id,Company_name,Designation;
	double Salary;
	public Employee(String _name,int _age)
	{
		super(_name,_age);

	}
	public void setname(String _name)
	{
		name=_name;
	}
	public void setage(int _age)
	{
		age=_age;
	}
	public void setEmp_id(String _id)
	{
		Emp_id=_id;
	}
	public void setCompany_name(String _compName)
	{
		Company_name=_compName;
	}
	public void setDesignation(String _designation)
	{
		Designation=_designation;
	}
	public void setSalary(double _sal)
	{
		Salary=_sal;
	}
	public String getEmp_id()
	{
		return Emp_id;
	}
	public String getCompany_name()
	{
		return Company_name;
	}
	public String getDesignation()
	{
		return Designation;
	}
	public double getSalary()
	{
		return Salary;
	}
	void input()//overidden
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		this.setname(sc.nextLine());
		System.out.println("Enter Employee age: ");
		this.setage(sc.nextInt());
		System.out.println("Enter Employee id: ");
		this.setEmp_id(sc.nextLine());
		System.out.println("Enter Company name: ");
		this.setCompany_name(sc.nextLine());
		System.out.println("Enter Employee Salary: ");
		this.setSalary(sc.nextDouble());
		System.out.println("Enter Employee Designation: ");
		this.setDesignation(sc.nextLine());
		



	}
	void show()//overidden
	{
		System.out.println(name+"\n"+age+"\n"+this.getEmp_id()+"\n"+this.getCompany_name()+"\n"+this.getDesignation()+"\n"+this.getSalary());
	}

}
class Ans7b
{
	public static void main(String[] args) {
		Person p1=new Person("Saurabh",20);
		p1.show();
		p1=new Employee("Kartik",23);
		p1.input();
		p1.show();
	}
}