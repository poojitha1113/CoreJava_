public class Constructor_Subclass extends Constructor_Superclass{
    String address="2286 kendall dr";
    int zipcode=92405;
    static String state="CA";
    int employeeId;

    String deportment="cse";


    Constructor_Subclass()
    {
        System.out.println("sub class info default constructor");
        name="subclass";
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(branch);
    }
    /*Constructor_Subclass(int x,String y)
    {
        employeeId=x;
        name=y;
        System.out.println("sub class info with 2 parameters");

        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(state);
    }*/

    public static void main(String[]args)
    {
        Constructor_Subclass obj=new Constructor_Subclass();


/*
every constructor 1st line by default there is a key it is super key
  so when we extend super class to sub class if defult
constracter is not avalible it will chekc for super class

It is very important to understand how the constructors get executed in the inheritance concept.
 In the inheritance, the constructors never get inherited to any child class.
 In java, the default constructor of a parent class called automatically by the constructor of its
 child class
 */
        /******the constructors never get inherited to any child class.*****
         * In java, the default constructor of a parent class called automatically by the constructor of its child class.
         */

        /*
        How constructor is executed in inheritance?
The Order of execution of constructors in java inheritance in single level inheritance is as
follows: The constructor of the superclass is called first.
If the superclass has multiple constructors, then the one with no arguments (the default constructor) is called.
         */
    }

}
