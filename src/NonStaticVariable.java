public class NonStaticVariable {
    /*
    non-static variable are dynamic behavior when we creat e the object all non-static variables
    can load to the respected object to heap memory
    so if I create more object in class evey object it creates the new space in heap memory
    so evey heap area it main the all non-static variable
    EG:
    there is 2 non-static variable A and B 10 and 20
    I created the 2 objects
    in 2 objects it load the nonstatic variable
     we can use the values in different ways
    like obj1 A=A+B  so now a value of a,b,a 10,20,30
    obj2 A=A*A so now the values are a= 10 ,b=20 and A=100
    so it is dynamic behaviour

     */

    String name="Poojitha";
    int employeeId=2280;
    double phone_Number=999999999;
    float salary_per_hour=60.30f;

    public static void main(String[]args)
    {
        NonStaticVariable obj=new NonStaticVariable();

        System.out.println("non-static variable DataType");
        System.out.println("EmployeeId:"+obj.employeeId);
        System.out.println("EmployeeName:"+obj.name);
        System.out.println("Phone_Number:"+obj.phone_Number);
        System.out.println("Salary_Per_Hour:"+obj.salary_per_hour);

        NonStaticVariable obj1=new NonStaticVariable();
        System.out.println("non-static variable DataType with 2nd object");
        System.out.println("EmployeeId:"+obj1.employeeId);
        System.out.println("EmployeeName:"+obj1.name);
        System.out.println("Phone_Number:"+obj1.phone_Number);
        System.out.println("Salary_Per_week:"+obj1.salary_per_hour*40);


    }
}
