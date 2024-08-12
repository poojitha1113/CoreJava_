public class LocalVariable {
    /*
    we can define any variable with in the method
    we cant use any keyword except 'final'
    without initialization  we cant declare the local variable
     */
    public int a,b;
    String name;
    String lastname="Poojitha";

    static double phonenumber=9999999;

    public void m1()
    {
        /*
        non-static variable
         */
        System.out.println(a=10*10);
        System.out.println(b=20+30);
        System.out.println(name="gutha");
        System.out.println(lastname);


        /*
        static variable
         */
        System.out.println(phonenumber);

        /*
        local variable
         */
        int x=20, z=30;
        System.out.println("Local variable");
        System.out.println(x+z);

    }
    public static void m2()
    {
        LocalVariable obj=new LocalVariable();
        System.out.println(obj.a=10-2);
        System.out.println(obj.b=20+30);
        System.out.println(obj.name="Gutha");

        int x=130, z=5,y=10;
        System.out.println("Local variable");
        System.out.println(x+z+y);
    }


    public static void main(String[]args)
    {
        LocalVariable obj=new LocalVariable();
        obj.m1();
        LocalVariable.m2();

    }
}
