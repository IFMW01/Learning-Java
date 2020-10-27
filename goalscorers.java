import java.util.Arrays;
import java.util.Scanner;
class goalscorers
{

    public static void main (String [] a)    
    {
        WommensPlayers();
        System.exit(0);
    }

    public static String inputString(String message)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.println(message);
        return Scanner.nextLine();
    }

    public static int Inputint(String message)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.println(message);
        return (Integer.parseInt(Scanner.nextLine()));
    }

    public static  void WommensPlayers()
    {
        final int totalplayers = 4;
        String[] nameofplayer = new String [totalplayers];
        int[] NumberOfGoals = new int [totalplayers];
        int[] sortedNumberOfGoals = new int [totalplayers];
        String[] NationalityOfPlayer = new String[totalplayers];
        int TotalGoals=0; 
        int Highestscore=0;
        int IndexofHighestScore=0;
        String a;
        for (int i= 0; i<totalplayers; i++)
        {
            nameofplayer[i]= inputString("Give the name of the player " + (i+1) + ":");

            NumberOfGoals[i]= Inputint("How many goals did they score?");
        
            if (NumberOfGoals[i]>Highestscore)
            {
                Highestscore = NumberOfGoals[i];
                IndexofHighestScore = i; 
            }

            NationalityOfPlayer[i]= inputString("Which country do they play for?");
            
            TotalGoals = TotalGoals + NumberOfGoals[i];

        }

        System.out.println("\nThe highest goal scorer was: " + nameofplayer[IndexofHighestScore] +" Scorring a total of " + NumberOfGoals[IndexofHighestScore] + " goals!");
        System.out.println("The players scored " + TotalGoals + " goals between them." );
        
        for (int i = 0; i < totalplayers; i++)
        {
            System.out.println("\nPlayer " + (i + 1) + ":" + nameofplayer[i]+ ", " + NationalityOfPlayer[i] + ", " + NumberOfGoals[i] + ".");

        }
        return;
    }
    
}