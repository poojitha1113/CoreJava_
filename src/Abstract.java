abstract class Demo {
    /*
    hiding the method info
    we can define the nonstatic static methods and variables but we cant crete an object
    we have abstract methods no body implementation
    we cant crete the object in abstract class
    we can crete the constarctor for abstract class
     */
    public abstract void abstractmethod();
    public void m1()
    {
        System.out.println("absrtact non-static method m1");
    }
    public static void m2()
    {
        System.out.println("absrtact static method m1");
    }

public static void main(String[]args)
{
 //so we cant create on object for abstract class i cant read the nonstaic mehtods info
    m2();//but we can run the static method
}
}
//with the help of inharitance we can extend the abstract class property to normal class
public class Abstract extends Demo {
    //we have to implement the all abstact  method to this class
    public void abstractmethod() {
        System.out.println("absract method");
    }

    public static void main(String[] args) {
        Abstract obj = new Abstract();
        obj.m1();
        obj.abstractmethod();
    }
    /*limitations in abstact :we can hide the method info 2 ways 
    abstact and interface
    abstract we can not hide the 100% info 
    when we use the abstract we can apply it for class and methods
    only extend the propertys multiple inharitance not possible
    if abstact class what ever the abstact methods avaliable
    we have to impliets the all method info if we dont want also we have to
    and in abstract we accept the static and non static methods
    so we cant hid the all methods info


     */
}