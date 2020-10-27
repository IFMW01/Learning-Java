import java.util.Scanner;
class bodyAge
{
    public static void main (String [] a)
    {
        finalEstimatedAge();
        System.exit(0);
    }
    


    
    public static String question(String message)
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        
    return scanner.nextLine();

    }




    public static int age()
    {
        String user = question("How old are you?");
        int userAge = Integer.parseInt(user);

    return userAge;

    }



    public static int heartAge()
    {
        int estimateAge = age();
        int heartBPM;
        String heart; 
        
        heart = question("What is your resting heart rate in bpm? \n(You do not need to include units in your answer)");
        heartBPM =  Integer.parseInt(heart); 

        if (heartBPM < 62)
        {
             estimateAge = estimateAge - 5;   
        }
         
        else if (62 <= heartBPM && heartBPM <=64)
        {
             estimateAge = estimateAge - 1;
        }

        else if (65<= heartBPM && heartBPM <=70)
        {
            estimateAge = estimateAge + 1;
        }
    
        else if (heartBPM >= 71)
        {
            estimateAge = estimateAge+ 2;
        }

        else 
        {
            System.out.println ("Please input an integeer value.");
        }

    return   estimateAge; 

    }
    
    
    
    public static int strech()
    {
        int estimateAge2; 
        String userStrech;
        int userStrechLen;

        estimateAge2 = heartAge();
        userStrech = question("How far can you strech to the nearest cm? \n(You do not need to include cm in your answer) ");
        userStrechLen = Integer.parseInt(userStrech);

        if ( userStrechLen < 20 )
        {
            estimateAge2 = estimateAge2 + 4;

        }

        else if ( userStrechLen >= 20 && userStrechLen <= 32)
        {
            estimateAge2 = estimateAge2 + 1;
        }
        
        else if (userStrechLen >= 33 && userStrechLen <= 37)
        {
            estimateAge2 = estimateAge2 + 0;
        }

        else if ( userStrechLen > 37)
        {
            estimateAge2 = estimateAge2 - 3;
        }

        else 
        {
            System.out.println("Please input an integer value.");
        }

    return estimateAge2;

    }



    public static void finalEstimatedAge()
    {
        System.out.println("Your esitamted age based on the stats provided is " + strech() + "!");
    }

}