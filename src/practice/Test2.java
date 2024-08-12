package practice;

public class Test2 extends Test1{
int z=40;
int x=5;
static int d1=30;
static int f2=15;
public void nonstatic_demo()
{
	Test1 obj=new Test1();
	System.out.println(z);
	System.out.println(obj.x);
	System.out.println(d1);
	System.out.println(y);
	System.out.println(Test1.f2);
}
public static void static_demo()
{
	Test2 obj=new Test2();	
	System.out.println(obj.z);
	System.out.println(obj.y);
	System.out.println(f1);
	
}
public static void main(String[]args)

{
	Test2 obj=new Test2();
	obj.nonstatic_demo();
	Test2.static_demo();
}
}
