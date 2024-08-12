import javax.xml.namespace.QName;

public class CompileTimePolymorphism {
    /*
    many methods
    2 types method compile time Polymorphism
    same method in same class with diffrent parameters
    same method in same class with  different parameters
    it allows the method over loading consept, and it is static process if we want to pass any elemetns
    we have to give that in compiles time if incase if i change the values in run time i need to save it
    and again have to run the program

     */
    public void employee()
    {
        System.out.println("Employee info method");
    }
    public void employee(int employeeId,String name)
    {
        System.out.println("Employee info method"+employeeId+"employee name"+name);
    }
    public void employee(String  address,int zipcode)
    {
        System.out.println("Employee info method"+address+""+zipcode);
    }
    public static void m1()
    {
        System.out.println("static method");
    }
    public static void m1(int x)
    {
        System.out.println(x);
    }
public static void main (String[]args)
{
    CompileTimePolymorphism obj=new CompileTimePolymorphism();

    obj.employee();
        obj.employee(20,"poojitha");
    obj.employee("2286 kendall dr",92405);

    //static methods
    CompileTimePolymorphism.m1();
    CompileTimePolymorphism.m1(10);

}
}

