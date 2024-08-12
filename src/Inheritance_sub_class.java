public class Inheritance_sub_class extends Inheritance_Superclass{
    int employeeId=391;
    String name="vyshnavi";
    long mobile_number=2000;
    static String address="2287 kendall dr";
    static double zipcode=92405;

    public void employee_Basic_Info()
    {
        System.out.println("printing the Inheritance sub class employee info ");
        System.out.println(employeeId);
        System.out.println(name);
        System.out.println(mobile_number);


    }
    public void employee_status()
    {
        /*
        address is take the by default subclass value if we want to specify the address filed in the super class
         we use the super class name with attribute
         */
        System.out.println(Inheritance_Superclass.address);
        System.out.println(zipcode);
        System.out.println(state);
    }
    public static void main(String[]args)
    {
        Inheritance_sub_class obj=new Inheritance_sub_class();
        obj.employee_Basic_Info();
        obj.employee_status();
        //super class info
        obj.employee_static_info();


    }
}
