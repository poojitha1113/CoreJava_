public class SuperKeyword_SuperClass{
    /*
    inheritance we can extend one class property to other class property
    without crete any object with the help of extends keyword
    there is case we can super class and sub class having same property
    so we call them it by default it access the subclass properties
    if in case we want to extend the super class property we have to crete the object for superclass
    and we can use call the super class variables and methods
    for non-static methods we can access with method name
    so eg: i have more variable or more methods in super class if i create the object my system crete the
    heap memory for the all the static methods and variable so its wasting of memory to crete the objetc

    so i use the super keyword
    super is a keyword to extend the property from super class to subclass
    but there is a limitation with this super cant access the static variables and static methods

     */
    int employeeId=201;
    String employeename="Poojitha";

    static int age=30;
    static String address="2286 kendall dr";
    public void addEmployee()
    {
        System.out.println("addEmployee");
        System.out.println(employeeId);
        System.out.println(employeename);
    }
    public static void employeeinfo()
    {
        SuperKeyword_SuperClass obj=new SuperKeyword_SuperClass();
        System.out.println("add info about employee");

        System.out.println(obj.employeeId);
        System.out.println(obj.employeename);
        System.out.println(age);
        System.out.println(address);

    }
    public static void main(String[]args)
    {
        System.out.println("superclass variables");
        SuperKeyword_SuperClass obj=new SuperKeyword_SuperClass();
        obj.addEmployee();
        SuperKeyword_SuperClass.employeeinfo();
    }
}
