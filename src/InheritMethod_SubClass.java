public class InheritMethod_SubClass extends InheritMethod_SuperClass{

    int EmployeeId=202;
    String Employeename="Vyshu";
    String address="2289 kendall dr";


    int zipcode=92405;
    static int areacode=909;

    static long Salary_per_month=6300;
    static double Deduction=1400;
    double earning;

    public void addEmployee()
    {
        System.out.println("adding the employee details:");
        System.out.println("EmployeeId:"+EmployeeId);
        System.out.println("Employeename:"+Employeename);
        System.out.println("Employeename:"+deportment);
        /*
        having the same method name using the subclass and supe class properts and employee id avalible in sub class
        it defult it take the subclass info and deportment info extends from super class
         */

    }

    public void edit_Employee()
    {
    /*
    taking the employee salary method and editing the info
         */
        InheritMethod_SuperClass.static_salary();
        System.out.println("Edit the employee salary info");
        InheritMethod_SuperClass.static_salary();
        earning= Salary_per_month-Deduction;
        System.out.println(earning);

    }
   public static void delete_Employee()
   {
      System.out.println("Delete the employee");

   }
public static void main(String[]args)
{
    System.out.println("Subclass info");
    InheritMethod_SubClass obj=new InheritMethod_SubClass();
    InheritMethod_SuperClass obj1=new InheritMethod_SuperClass();
    obj.addEmployee();
    obj1.addEmployee();
    obj.edit_Employee();
    InheritMethod_SubClass.delete_Employee();

}
}
