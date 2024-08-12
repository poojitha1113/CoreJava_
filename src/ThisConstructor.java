public class ThisConstructor {
    int a,b;
    ThisConstructor()
    {
        System.out.println("this constuctor");
        System.out.println(a);
        System.out.println(b);
    }
    ThisConstructor(int x,int y)
    {
        System.out.println("this constuctor with 2 paramters");

        this.a=x;
        this.b=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);

    }
    ThisConstructor(int x,int y,String a)
    {
        this(10,20,30.4f);
        /*
        it will calls the default constructor
         */
        System.out.println("this constuctor with 3 paramters");

        this.a=x;
        this.b=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);

    }
    ThisConstructor(int x,int y,float c)
    {

        System.out.println("this constuctor with 4 paramters");

        this.a=x;
        this.b=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(c);


    }


public static void main(String[]args)
{
    ThisConstructor obj=new ThisConstructor();
    ThisConstructor obj1=new ThisConstructor(10,20);
    System.out.println(obj.a);
    System.out.println(obj1.b);
    ThisConstructor obj2=new ThisConstructor(10,20,"pooijtha");
/*
to creting more objects every clas i can use the this constructor
so in obj2 there is this (20,10,30.4) constructor so it will extecute that one and
so no need to crete the object
but there is drow back we cant define super and this () constructer in the same constuctor becuse
every constuctor by default super() crated by complier
but this constuctor we can crete in only in 1st line so if we want to use the super and this constuctor
in one constructor we cant do this
 */
}
}
