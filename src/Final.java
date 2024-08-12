public class Final {
    /*
    we can appluy final keyword to variable methods and class
     */
    final int x;
    //we cant inshallis the final variable with out declartion but we can handle it
    //with constructor
    Final()
    {
       x=10;
    }
    int totalnumberof_subject_score=600;
    final static int zipcode=92405;//i can change the value
public static void marks()
    {
            int mca=100;
        Final obj=new Final();

            System.out.println(obj.totalnumberof_subject_score);
            System.out.println(obj.totalnumberof_subject_score=mca+obj.totalnumberof_subject_score);
            System.out.println(zipcode+10+ obj.x);
            //now the value is cheng

    }
    public final void m1()
    {
        System.out.println("m1");
    }
    //we cant over ride this because it is the final one
    public static void main(String []args)
    {
        System.out.println(zipcode+10);
        System.out.println(zipcode);

marks();//so with final i can change the vlaue but if i want some constants like
    }
}
