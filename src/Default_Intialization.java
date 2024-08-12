public class Default_Intialization {
        byte serNo;
        int emplyeeId;

        char name;
        float salary_per_hour;
        short emptimeings;

        boolean gender;
        double mobile;
        long address;
        /*
        static variable
         */
        static int zipcode;
        static String Lastname;

        /*
        secondary data  type it start with Capital
         */
        Integer y;

        public static void main(String[]args)
        {
            System.out.println("Printing the default initialization values for static and non static values");
        /*
        printing the instant variables
         */
            Default_Intialization obj= new Default_Intialization();
            System.out.println(obj.serNo);
            System.out.println(obj.emplyeeId);
            System.out.println(obj.name+"  name ");
            System.out.println(obj.mobile);
            System.out.println(obj.salary_per_hour);
            System.out.println(obj.address);
            System.out.println(obj.gender);
            System.out.println(obj.emptimeings);

            System.out.println(zipcode);
            System.out.println(Lastname);

            System.out.println("printing the sourcecode data type so it by default compiler will take it as null ");
            System.out.println(obj.y);


        }


    }


