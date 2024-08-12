interface Interface {
    //here we declare the interface key word only for class
    //we  use the abstract methods here
    //and multiple inheritance will helpfull with the help impliments keyword
public abstract void m1();
public abstract void m2();
public static void m3()
{
    System.out.println("we cant define the nonstatic method in interface");
}
public static void main(String[]args)
{
System.out.println("Interfce");
m3();
}
}
public class Interfaceclass implements Interface
    //i cant extend the interfaces only impliments
{
public void m1()
{
System.out.println("abstract method implimentations");
}
public void m2()
{
    System.out.println("abstract method m2 implimentations");
}
public static void main(String[]args)
{
    Interfaceclass obj=new Interfaceclass();
    obj.m1();
    obj.m2();
    Interface.m3();//static method i can call from interface
}
}
