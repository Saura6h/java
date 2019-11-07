class A
{
	public A()
	{
		System.out.println("Inside A's Constructor");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("Inside B's Constructor");
	}	
}
class C extends B
{
	public C()
	{
		System.out.println("Inside C's Constructor");
	}
}


class Ans6b{
	public static void main(String[] args) {
		C c=new C();
	}
}