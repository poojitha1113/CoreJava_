public class SuperKeyword_SubClass extends SuperKeyword_SuperClass {

    int employeeId=202;
    static String employeename="vyshu";



    static String address="2287 kendall dr";
    String state="CA";
    static int zipcode=92407;
    public void editEmployee() {
        System.out.println("edit Employee");
        System.out.println(super.employeeId);
        System.out.println(super.employeename);
        System.out.println(state);
        System.out.println(zipcode);
        System.out.println(super.address);
    }
    public void addEmployee()
    {
        /*
        extend the methods from super class to sub class with help of super key word
         */
        super.addEmployee();
        /*
        new employee
         */
        System.out.println("addEmployee");
        System.out.println(employeeId);
        System.out.println(employeename);


    }
    public static void addNewEmployee()
    {

        SuperKeyword_SubClass obj=new SuperKeyword_SubClass();
        System.out.println("addEmployee");
        System.out.println(employeename);
        System.out.println(obj.employeeId);

        System.out.println(age);


    }

    public static void main(String[]args)
    {
        System.out.println("subclass info");
        SuperKeyword_SubClass obj=new SuperKeyword_SubClass();
        obj.editEmployee();
        SuperKeyword_SubClass.addNewEmployee();
        System.out.println("adding the super class");
        obj.addEmployee();


    }
}
