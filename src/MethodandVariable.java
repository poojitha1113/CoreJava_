public class MethodandVariable {
    /*
    non-static variable
     */
    int employeeId=272;
    String name="Poojitha";
    double mobileno=44444444;
    float pay_for_hour=60.50f;

    /*
    static variable
     */
    static String address="2286 kendall dr";
    static int zipcode=92497;

    public void nonstatic_method()
    {
       System.out.println("This is non static method with no variable");
    }
    public static void static_method()
    {
        System.out.println("this is static method with no variable");
    }
    public void nonstatic_method_variable()
    {
        /*
        in the nonstatic method i can use the instant variables and static variables
        no need to create any object
         */
        System.out.println("nonstatic_method_variable");
        System.out.println("employee name :" +name);
        System.out.println("Employee Id :"+ employeeId);
        System.out.println("MobileNo :" +mobileno );
        System.out.println("pay for hour :"+ pay_for_hour);
        /*
        static variable in the non-static method
         */
        System.out.println("address"+ address);
        System.out.println("zipcode"+zipcode);
    }
    public static void static_method_variable()
    {
        /*
        in the static method we can use the static variable and if we want to use the instant variable
        we create object for the class
         */
        System.out.println("static_method_variable");
        MethodandVariable obj=new MethodandVariable();
        System.out.println("employee name :" +obj.name);
        System.out.println("Employee Id :"+ obj.employeeId);
        System.out.println("MobileNo :" + obj.mobileno );
        System.out.println("pay for hour :"+ obj.pay_for_hour);

        /*
        static variable
         */

        System.out.println("Address:"+address);
        System.out.println("Zipcode:"+zipcode);

    }

    public static void newStaticMethod()
    {
        /*
        again I am trying to use the non-static variables in to the new method
         again  we have to create the object for instance variable
         above method object is used of that instant only so to use the non-static variable
         have to creat the object
         */

        MethodandVariable obj1=new MethodandVariable();
        System.out.println("newStaticMethod");
        System.out.println("employee name :"+obj1.name);
        System.out.println("Employee Id :"+ obj1.employeeId);
        System.out.println("MobileNo :" + obj1.mobileno );
        System.out.println("pay for Week :"+ obj1.pay_for_hour*40);

    }

    public static void main(String[]args)
    {


        MethodandVariable obj=new MethodandVariable();
        obj.nonstatic_method();
        static_method();

        obj.nonstatic_method_variable();

        static_method_variable();
        newStaticMethod();



    }

}
