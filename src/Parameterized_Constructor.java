public class Parameterized_Constructor {
    int employeeId;
    int salary;
    static String employeename;
    /*public void editEmployee(int salary) {
        System.out.println(employeeId);
        System.out.println(salary*30);
    }
    /*
    constructor same methos and constuctor but no need to call the method by it self it will calling the constucter
    */
    public Parameterized_Constructor(int salary)
    {
        System.out.println(salary*30);
    }

    public static void main(String[]args)
    {
        Parameterized_Constructor obj=new Parameterized_Constructor(30);

    }
}
