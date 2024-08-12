public class SuperConstructorcase2_Superclass {
    /*
    there is no default constrauctor but here i am trying to use the add the parameter constructor
     */

    SuperConstructorcase2_Superclass()
    {
        System.out.println("super class");
    }
    SuperConstructorcase2_Superclass(int a,int b)
    {
        System.out.println(a+b);
    }
    SuperConstructorcase2_Superclass(String x,int y)
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[]args)
    {
        System.out.println("SuperConstructorcase2_Superclass");
        SuperConstructorcase2_Superclass obj=new SuperConstructorcase2_Superclass(10,20);

    }
}
