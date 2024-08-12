public class InheritMethod_SuperClass {
    int EmployeeId=201;
    String Employeename="Poojitha";
    String address="2286 kendall dr";
    static  String State="CA";
    String deportment="Testing";

    static long Salary_per_month=5800;
    static double Deduction=1200;

    public void addEmployee()
    {
        System.out.println("adding the employee details:");
        System.out.println("EmployeeId:"+EmployeeId);
        System.out.println("Employeename:"+Employeename);
    }
    public void addAddress()
    {
        System.out.println("employee address:"+address);
        System.out.println("State:"+InheritMethod_SuperClass.State);
    }
    public static void static_salary() {
        InheritMethod_SuperClass obj = new InheritMethod_SuperClass();
        System.out.println("Employee Id" + obj.EmployeeId);
        System.out.println("Salary per month" + Salary_per_month);
        System.out.println("Salary deduction"+obj.Deduction);
    }

    public static void main (String[]args)
    {
        System.out.println("super class info");
        InheritMethod_SuperClass obj=new InheritMethod_SuperClass();
        obj.addEmployee();
        obj.addAddress();
        InheritMethod_SuperClass.static_salary();
    }

}
