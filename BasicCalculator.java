/*
AUTHOR Israel Mason-Williams
DATE 7 November 2020

This is a simple recursive parser and calculator that allows expressions that add binary digits:

<EXP> = +<DIGIT><EXP> | -<DIGIT><EXP> | &<EXP> | <DIGIT>
<DIGIT> = 0 | 1 | 2 | 3 | .. | 9 

*/

import java.util.*;

class BasicCalculator
{
  
    public static void main (String[] param)
    {
        FinalResult(); ///Main method 
        System.exit(0);
    }

    public static void FinalResult() ///Asks the user a question, calls recursive methods and prints answer
    {
        String in = InputString("Please give me an expression");
        int answer = Evalexpression(in); 
        print("The answer is " + answer);
    }

    public static String InputString(String message) ///Gets a users input after printing a statement
    {
        Scanner scanner = new Scanner(System.in); ///Creates link between program and keyboard
        System.out.println(message);
        return (scanner.nextLine()); ///Returns users repsonse 
    }
 
   
    public static void print(String message) ///General print method
    {
        System.out.println(message);
    }
   

    public static int Evalexpression(String in) ///Evaluates the String the user enters
    {
         int result;
         int length = in.length(); ///Gets the length of the String
         if (length ==1) ///If String is one charecter long
         {
           result = EvalDigit(in);///Calls Digit method
         }
         else
         { 
             result = EvalOperator(in);///Calls Operator method
         }
        return result;
    }
  
    public static int EvalOperator(String in)
    {

         int result =0;
 
         String first = nextToken(in);///Gets the first charecter of String
         String rest = restToken(in);///Gets the rest of the charecters of the String

 
         if(first.equals("&"))///Checks first charecter of string to &
         {
           result = EvalSumation(rest);///Appropriate method call 
         }
         else if (first.equals("+"))///Checks first charecter of string to +
         {
           result =  EvalAdd(rest);///Appropriate method call
         }
         else if (first.equals("-"))///Checks first charecter of string to -
         {
           result = EvalMinus(rest);///Appropriate method call 
         }
         else 
         {	
           quit();
         }
         return result;
       
    }
   
    public static int EvalSumation(String in)
    {
        int arg1;
        arg1 = Evalexpression(in);///Takes the rest of String and recursively evaluates each charecter
        return RecurSums(arg1);
    }
  

    public static int RecurSums(int num)
    {
        int result = 0;
        if (num >0)
        {
            result =  RecurSums(num-1) + num;///Add the numbers values prior itself above 0 to itself 
        }
        return result;     
   }
    
    public static int EvalMinus(String in)
    {
         int arg1;
         int arg2;
         int result;
 
        // Split off the first two tokens 
         String first = nextToken(in);
         String rest = restToken(in);
 
 
         // Following the structure of the definition DIGIT + EXP
         arg1 = Evalexpression(first);  /// DIGIT
         arg2 = Evalexpression(rest); /// EXP
     
    
         result = arg1 - arg2;
       
         return result;
    }
 
    public static int EvalAdd(String in)
    {
         int arg1;
         int arg2;
         int result;
 
        // Split off the first two tokens
         String first = nextToken(in);
         String rest = restToken(in);
 
 
         // Follow the structure of the definition DIGIT + EXP
         arg1 = Evalexpression(first);  // DIGIT
          // +
         arg2 = Evalexpression(rest); /// EXP
     
         // Calculation of arguments recursively means we can do the calculation
         result = arg1 + arg2;
       
         return result;
   }

    public static int EvalDigit(String in) ///Base case of a decimal digit (Processes a digit)
    {
        int result = -1;
        if (in.equals("0"))
          {
            result = 0;
          }
          else if (in.equals("1"))
          {
            result = 1;
          }
          else if (in.equals("2"))
          {
            result = 2;
          }
          else if (in.equals("3"))
          {
            result = 3;
          }
          else if (in.equals("3"))
          {
            result = 3;
          }
          else if (in.equals("4"))
          {
            result = 4;
          }
          else if (in.equals("5"))
          {
            result = 5;
          }
          else if (in.equals("6"))
          {
            result = 6;
          }
          else if (in.equals("7"))
          {
            result = 7;
          }
          else if (in.equals("8"))
          {
            result = 8;
          }
          else if (in.equals("9"))
          {
            result = 9;
          }
          else ///Not a decimal digit 
          {
            quit();
          }
          return result;
    }
  
    public static String nextToken(String in)
    {
        return(in.substring(0,1));///Returns the first charecter of the string
    }

    public static String restToken(String in)
    {
        return(in.substring(1));///Returns all the charecters after the first character.
    }
    

    public static void quit()
    {
        print("You have not put a valid grammar"); ///Error statement when the input is wrong. 
    }


}