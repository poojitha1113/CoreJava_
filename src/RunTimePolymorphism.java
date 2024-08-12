public class RunTimePolymorphism {
    /*
    same method name different data types
    same parameters in same class we can send the data at run time so once we compile the program
    we can give the values at run time no need to compile
    same name and same data types by changing the paramters at run time
    */
    public void m1(double a,double b)
    {

        System.out.println("computer"+a+"and"+b);
    }
    public void m1(int a,int b)
    {
        System.out.println("Laptop"+a+"and"+b);
    }
    public static void main(String args[])
    {
        RunTimePolymorphism obj=new RunTimePolymorphism();
        obj.m1(10,20);//it will execute int data type becuse 10 and 20 are int so it checek the data type
        obj.m1(10.5,20);//it will execute double becuase its states with 10.5
        obj.m1(10,15.5);//it wiil executet the dobule only check the data type and pass the parameters

        //same method name same data types paramtes changes  but above one is compile time polymarfisam
        //and we can pass the parameters at run time as well
       int a=Integer.parseInt(args[0]);
       int b=Integer.parseInt(args[1]);

        double c=Double.parseDouble(args[2]);
        double d=Double.parseDouble(args[3]);

        obj.m1(c,d);
        obj.m1(a,c);



    }

}
