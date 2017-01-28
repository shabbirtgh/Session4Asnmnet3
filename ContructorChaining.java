package Package1;

public class ContructorChaining {

	public static void main(String[] args) 
	{
		C obj = new C();
	}

}

class A
{
	A()
	{
		System.out.println("Super class constructor");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Child class constructor");
	}
}

class C extends B
{
	C()
	{
		System.out.println("Grand Child class constructor");
	}
}
