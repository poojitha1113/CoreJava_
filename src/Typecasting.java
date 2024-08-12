public class Typecasting {
/*
convert the variable from  primitive data type to primitive data type
there are 2 orders one is implicit and explicit
 */
    byte b=1;    //8 bits
    short s=34;   //2 byte
    char c='p';    //2 byte

    int a=10;       //4 byte
    float f=10.8f;  //4 byte
    double d=10000; //8 byte
    long l=3333333;
    boolean tf;  //1 1bit
/*
2 type converters one is implicit and explicit
implicit is JVM converted directly
3 conditions
1)automatically  convert
2)compiler used to convert
3)smaller vales to bigger value
 */

    public void implicit()
    {
        short s1=b;
        System.out.println(s1);
    }
    public static void main(String[]args)
    {
        System.out.println("Type casting");
        Typecasting obj=new Typecasting();
        obj.implicit();


    }

}
