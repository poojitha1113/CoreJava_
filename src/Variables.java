public class Variables {
    /*
    3 types of variables static variables instant and local
    if any variables declare with static key, and we can use those variables in static block if no varibles with static is instant varibles
    memory:static variable by default stores in stack memory
    instant variables by default it won't store anywhere to use the instant variable we use the object
    when we create the object all instant variables will store in the heap memory
    classname object_name=new classname();
    new means it will create the memory for all instant properties
    so the created memory space used with object name
    we can use the instant variables in static block as well
    */

    String name="Poojitha";
    int employeeId=2280;
    double phone_Number=999999999;
    float salary_per_hour=60.30f;
    static String address="2286 kendall dr";
    static double zipcode=92407;

    public static void main(String[]args)
    {
        System.out.println("Static data type");
        System.out.println(address);
        System.out.println(zipcode);

      //to access the nonstatic/instant variables we have creat an object
        Variables obj=new Variables();
        System.out.println("non-static variable DataType");
        System.out.println("EmployeeId:"+obj.employeeId);
        System.out.println("EmployeeName:"+obj.name);
        System.out.println("Phone_Number:"+obj.phone_Number);
        System.out.println("Salary_Per_Hour:"+obj.salary_per_hour);
    }
}
