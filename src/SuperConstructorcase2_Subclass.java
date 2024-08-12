public class SuperConstructorcase2_Subclass extends SuperConstructorcase2_Superclass
{
    public SuperConstructorcase2_Subclass()
    {
    super("poojitha",20);
    System.out.println("default sub class constructor class");

    }
    public static void main(String []args)
    {
        /*with default constuctoctor it wont allow me to crete the subclass
        and in super constrcter we can pass the arguments

        super()
         it calls the defult constuctor
         but if in case if we pass any arguments it will take that constuctor*/

        SuperConstructorcase2_Subclass obj=new SuperConstructorcase2_Subclass();

    }

}
