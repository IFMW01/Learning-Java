class initials // initials class created
{

    public static void main (final String[] a)

    {

        printInitails();

        System.exit(0);

    }

    public static void printInitails()

    {

        initial1(); /// Calls method initials1

        initial2(); /// Calls method initials2

        initial3(); /// Calls method initials3

    }

    public static void print(final String message) /// Print method is created taking a String message input

    {

        System.out.println(message);          ///System.out.println(message)

   

        return;                               ///Then returned to the print method

    }

   

    public static void initial1()   ///Initial1 is created

    {

        print("IIIIIIIIIII");       ///Print statements are used to for the Capital I from I components

        print("     I");

        print("     I");

        print("     I");

        print("     I");

        print("     I");

        print("     I");

        print("IIIIIIIIIII");

        print("");

   

    } ///Method ends

   

    public static void initial2() ///Method initial2 is created

    {

        print("M         M");     ///Print statements are used to create the shape of the Captial M

        print("MM       MM");

        print("M M     M M");

        print("M  M   M  M");

        print("M   M M   M");

        print("M    M    M");

        print("M         M");

        print("");

   

    } ///Method 2 Ends

 

    public static void initial3() ///Initial3 method is created

    {

        print("W         W");     ///'W' components are printd to form W

        print("W         W");

        print("W    W    W");

        print("W  W   W  W");

        print("W W     W W");

        print("WW       WW");

        print("W         W");

        print("");

    }

}
