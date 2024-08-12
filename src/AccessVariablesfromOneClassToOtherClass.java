public class AccessVariablesfromOneClassToOtherClass{
    String name="Rakesh";
    int employeeId=2281;
    double phone_Number=999922434;
    float salary_per_hour=72.30f;
    static String address="2287 kendall dr";
    static double zipcode=92407;
    static String state="CA";
    public static void main(String[]args)
    {
        System.out.println("Static data type from current class");
        System.out.println(address);
        System.out.println(zipcode);
        System.out.println(state);

        //to access the nonstatic/instant variables we have creat an object
        AccessVariablesfromOneClassToOtherClass obj=new AccessVariablesfromOneClassToOtherClass();
        System.out.println("non-static variable DataType");
        System.out.println("EmployeeId:"+obj.employeeId);
        System.out.println("EmployeeName:"+obj.name);
        System.out.println("Phone_Number:"+obj.phone_Number);
        System.out.println("Salary_Per_Hour:"+obj.salary_per_hour);
        System.out.println("Salary_Per_Week:"+obj.salary_per_hour*40);

        /*
        Taking the other class information to this class
         */
        Variables variableClass=new Variables();

        System.out.println("variable Class nonstatic info");

        System.out.println("EmployeeId:"+variableClass.employeeId);
        System.out.println("EmployeeName:"+variableClass.name);
        System.out.println("Phone_Number:"+variableClass.phone_Number);
        System.out.println("Salary_Per_Hour:"+variableClass.salary_per_hour);
        System.out.println("variable Class static info");
        /*
        directly we can use the class info
         */
        System.out.println("Static data type");
        System.out.println(Variables.address);
        System.out.println(Variables.zipcode);


    }
}
