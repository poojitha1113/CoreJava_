public class Constructor_Overloading {
    /*
    same constucter name but different parameters
     */
    int employeeId;
    int salary;
   public Constructor_Overloading()
    {
        employeeId=101;
        salary=40;
        System.out.println(40*30);
        System.out.println("default Constructor");
    }
    public Constructor_Overloading(int employeeId,int salary)
    {
        System.out.println(employeeId*salary);
    }
    public Constructor_Overloading(int employeeId,int salary,int daysworked)

    {
        System.out.println(employeeId*salary);
        System.out.println(daysworked);

    }

    public static void main(String[]args)
    {
        Constructor_Overloading obj=new Constructor_Overloading(30,80);
/*
with parameters, it will use the default constructor
if we pass the parameters ir will take the parameters constructor
it is method overloading
 */
    }
}
