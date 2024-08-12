public class Inheritance_Demo2 extends Inheritance_Demo1{
    int studentId=213;
    String name="vyshu";
    String branch="ece";
    int score=80;


    /*
    static variable
     */
    static String address="2286 kendall dr";
    static int zipcode=92407;
    static String state="CA";
    public void subclass()
    {
        System.out.println(name);
        System.out.println(branch);
        System.out.println(score);
        System.out.println(data1);

        System.out.println(zipcode);
        System.out.println(address);
        System.out.println(areacode);
    }

    public static void static_subclass()
    {
        Inheritance_Demo2 obj=new Inheritance_Demo2();
        System.out.println(obj.name);
        System.out.println(obj.branch);
        System.out.println(obj.score);
        System.out.println(obj.data1);

        System.out.println(zipcode);
        System.out.println(address);
        System.out.println(areacode);

    }

    /*
    till now we have the same variable in super and subclass but by default it takes the subclass data
    and if the any variable info is now available in the sub class it takes from super class because we extended the
    super class to sub class
    area code data1 takes from super class----
    if i want to use the super class data same variables in the subclass
    eg:name,branch
    and  static address and zipcode
    ***so now if we want to use the same non-static  variable from super class we have to
    create the object for super class
    and if we want to use the static variable from super class we have to use with superclass name
     */

    public void superclassdata()
    {
        Inheritance_Demo1 obj=new Inheritance_Demo1();
        System.out.println(obj.name);
        System.out.println(obj.branch);
        System.out.println(data1);//no need to use the obj because no such variables in subclass
        //sub class data no need any object
        System.out.println(score);

        //static data
        System.out.println(Inheritance_Demo1.zipcode);
        System.out.println(Inheritance_Demo1.address);
        System.out.println(state);//it is not avlaible in superclass so no need obj
        System.out.println(areacode);//area code is super class but no need any class name to access the data because it is not avalible in subclass

    }


    public static void main(String[]args)
    {
        Inheritance_Demo2 obj=new Inheritance_Demo2();
        obj.subclass();
        Inheritance_Demo2.static_subclass();
        obj.superclassdata();
    }
}
