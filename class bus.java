import java.util.Scanner;
class bus
{
    public static void main (String [], a)
    {
        BusAppearences(); 
        system.exit(0);
    }

    public static void BusAppearences() 
    {
        String SepcialCharacter = "X"; 
        String test = ""; 
        int total = 0;
        int BusCount = 0;

        while( !(test.equals("X")))
        {
            test = userInput("How many passengers did you see get on the last bus?"); 
            
            total = total + Integer.parseInt(test);
            
            BusCount= BusCount + 1;
        }

        System.out.println("There were a total of " + total + " passengers on " + BusCount + " Busses.");

        return;
    }

    public static String userInput (String message) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }




}