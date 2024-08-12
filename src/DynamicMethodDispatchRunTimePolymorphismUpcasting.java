class Computer
{
    /*computer is super key for all the  functionality
    computer can do some methods
     */
    public void login()
    {
    System.out.println("computer login is done");
    }
}
class laptop extends Computer
{
/*
we are extending the properties from computer to laptop so in laptop and computer having same
method but some changes will be there
 */
public void login()
{
    System.out.println("no need any power consumption");
    System.out.println("computer login is done");
}
}
public class DynamicMethodDispatchRunTimePolymorphismUpcasting  {
    /*
    in runtime environment
     */
public static void main(String[]args)
{
/*
here if want to use the 2 class object ineed to create the 2 objects so i can use the parent class
refnce to child class
so if you create the object for super class in stack  memory it will consider
Computer object will crete if call to method it will extecute it
and if i take the obj as referal no need to declare i can declate to laptop methos as well
 */
    Computer obj=new Computer();//it will call the supr class
    obj.login();
    obj=new laptop();
    obj.login();//it will call to laptop method and it take the refnce from computer obj
    //updacting only super to sub not for sub to super class
    //only in inharitance conspet it will applicable
}
}
