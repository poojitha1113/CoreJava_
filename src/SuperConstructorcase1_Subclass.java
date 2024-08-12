public class SuperConstructorcase1_Subclass extends SuperConstructorcase1_Superclass {
    public SuperConstructorcase1_Subclass()
    {
        super();
        System.out.println("Default SuperConstructor");
    }
    public static void main()
    {
        System.out.println("Subclass");
        SuperConstructorcase1_Subclass obj=new SuperConstructorcase1_Subclass();
        /*
        here there is no constructor in the super class compiler will create the default constuctor in super class
         */
    }

}
