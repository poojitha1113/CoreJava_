public class Constructor_Superclass {
    int employeeId;
    String name;
    String deportment="cse";
    static String branch="hyd";

    public Constructor_Superclass()
    {
        name="poojitha";

        System.out.println("default constructor");
        System.out.println(name);
        System.out.println(deportment);
        System.out.println(branch);
    }
    public Constructor_Superclass(String name,int employeeId)
    {
        System.out.println(employeeId);
        System.out.println(name);
        System.out.println(deportment);
        System.out.println(branch);

    }
    public Constructor_Superclass(int a,String b)
    {
      employeeId=a;
      name=b;
        System.out.println(employeeId);
        System.out.println(b);
        System.out.println(deportment);
        System.out.println(branch);
    }
    public static void main(String[]args)
    {
        Constructor_Superclass obj=new Constructor_Superclass();
        Constructor_Superclass obj1=new Constructor_Superclass("vyshu",201);
        Constructor_Superclass obj2=new Constructor_Superclass(202,"rakesh");
    }
}
