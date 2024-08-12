public class ThisClass {
    int a;
    int b;
    float c;

    public void m1(int a,int b, float c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
/*
a,b,c are the local variable so if i declare any variable here it will call the with in the method
i have the same non-static variable it won't affect on the static values
below am adding the other method and implementing this keyword
basically this is used to mapping the  static and local variable
 */
     }
     public void m2(int a,int b)
     {
         System.out.println("local variables are "+"a value"+a+" b value"+b+"c value"+c);
         this.a=a;
         this.b=b;
     }
     public void m3(int a,int b,int c)
     {
         System.out.println("local variables are "+"a value"+a+" b value"+b+"c value"+c);
         this.a=a;
         this.b=b;
         this.c=c;

     }
     public static void m4(int a,int b,String c)
     {
         System.out.println("local variables are "+"a value"+a+" b value"+b+"c value"+c);

        /*we cant use the this keyword in static block*/
     }
    public static void main(String[]args)
    {
        ThisClass obj=new ThisClass();
        obj.m1(10,20,33.3f);
        System.out.println("a value"+obj.a+" b value"+obj.b+"c value"+obj.c);
        obj.m2(22,30);
        System.out.println("m2 calling the this keyword now the"+"a value"+obj.a+" b value"+obj.b+"c value"+obj.c);
        obj.m3(1,2,3);
        System.out.println("m3 calling the this keyword now the"+"a value"+obj.a+" b value"+obj.b+"c value"+obj.c);
        ThisClass.m4(10,20,"poojitha");

        System.out.println("m4 calling the this keyword now the"+"a value"+obj.a+" b value"+obj.b+"c value"+obj.c);

    }


}
