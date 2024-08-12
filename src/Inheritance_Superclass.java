public class Inheritance_Superclass  {
/*
extend the one class property to other class property
subclass and super class
earlier we can access the one class methods/variables  to other class
with the help of class name and help of object
but now no need to create any object we can extend the one class property to other
with the help of extend key word
we can access the super class property to sub-class property
and every super class constructor provides the "Object" class
it is the pre define class here some predefine methods are available
*/
    int employeeId=390;
    String name="Poojitha";
    long mobile_number=1000;
    int data=10;
    static String address="2286 kendall dr";
    static double zipcode=92405;
    float salary_per_hour=60.30f;
    String employee_status="exp";
    String state="CA";
    public void employee()
    {
        System.out.println("printing the Inheritance superclass employee info ");
        System.out.println(employeeId);
        System.out.println(name);
        System.out.println(mobile_number);
        System.out.println(address);
        System.out.println(zipcode);
        System.out.println(salary_per_hour);
        System.out.println(state);
    }
    public static void employee_static_info()
    {
        System.out.println("printing the Inheritance superclass employee info in static info ");
        Inheritance_Superclass obj=new Inheritance_Superclass();
        System.out.println(obj.employeeId);
        System.out.println(obj.name);
        System.out.println(obj.mobile_number);
        System.out.println(obj.salary_per_hour*40);
        /*
        static variables
         */
        System.out.println(address);
        System.out.println(zipcode);
        System.out.println(obj.state);
        System.out.println("Employee status"+obj.employee_status);


    }
public static void main(String[]args)
{
    System.out.println("super class info");
    Inheritance_Superclass obj=new Inheritance_Superclass();
    obj.employee();
    Inheritance_Superclass.employee_static_info();
}

}
