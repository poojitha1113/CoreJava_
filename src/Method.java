public class Method {
    /*
    method: Group of statements
    static and non-static
   want to access the static methods no need to create any obj
   same  like variable
   if we want to use the non-static method we have to creat the object
     */
    void m1()
    {

        System.out.println("non-static Method m1 calling with the help of object");
    }
    static void m2()
    {
        System.out.println("static method m2 calling with help of classname no need to create any object");

    }
    public static void main(String[]args)
    {
        System.out.println("Calling the method");
        Method obj=new Method();
        obj.m1();
        Method.m2();
    }
}
