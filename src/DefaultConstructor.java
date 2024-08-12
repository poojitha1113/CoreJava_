public class DefaultConstructor {

    public DefaultConstructor()
    {
System.out.println("defaul");
    }
    public static void main(String[]args)
    {
        DefaultConstructor obj=new DefaultConstructor();

        System.out.println("DefaultConstructor");

    }
}
/*
constructor it is kind of method, it is calls when the object is creating
constructor is set of variables , and it is a same as class name
we can use the more no of constructor in a class
by default no need to create any constructor, java compiler will create the constructor by it-self
with the help of considerate overloading conspectus we can use the multiple constructor in a class  every constructor having the differnt parmetters
when we call's the method after creating the object but constructor created wht creating the object time
object is help  to crete the memory for non-static variable so in that time constarctor help to declar the variables in the object face
constracter only for nonstatic variables
once we crete the default or parameter constructor it compiler won't crete the consructer by default.
if we crete more constrcter we can crete those object or not no problem
but if we have 3 object we need 3 constrcors
it is only for non-static not for static because object always create for nonstatic variables
 */