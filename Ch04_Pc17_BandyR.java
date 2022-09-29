//************************************************************************
//*     @author     Reid Bandy
//*     Date        2022-09-29
//*     Purpose     Create random number and let user guess until he finds it.
//************************************************************************


import java.util.Scanner;                                   // import scanner class
import java.util.Random;                                    // import random

public class Ch04_Pc17_BandyR                               // exposed class
{
   public static void main(String[] args)                   // main method
   {
      // English output:
      final String ENG1 = "There is a random number between 1 and 100. What is it?\n", 
                   ENG2 = "Enter you're guess: ",
                   ENG3 = "Too high, try again.\n", 
                   ENG4 = "Too low, try again.\n", 
                   ENG5 = "Correct! Good job. Bye.", 
                   ENG6 = "Please enter an integer.\n";
      int randNum;                                          // random number
      Random randGen = new Random();                        // random number generator
      Scanner input;                                        // scanner object. Will be declared later
      
      randNum = randGen.nextInt(100) + 1;                   // random number between 1-100
      
      // Inform user of what they've got themselves into:
      System.out.printf(ENG1);
      
      // Guessing loop:
      while (true)                                          // forever loop until break is called later
      {
         int guess;                                         // guess variable
         input = new Scanner(System.in);                    // instantiate object. Required to prevent crash.
         System.out.printf(ENG2);                         // prompt user
         
         // allow for erronious user input by giving them another try
         try
         {
            guess = input.nextInt();                        // define guess as next user's input
            if ( guess > randNum )                          // check if guess is larger. Tied with less than
            {                                               //      as most probable scenario.
               System.out.printf(ENG3);                   //   notify user to their error
            } // if ( guess > randNum )
            else if ( guess < randNum )                     // check is guess is less than
            {                                               //
               System.out.printf(ENG4);                   //   notify user to their error
            } // else if ( guess < randNum )
            else                                            // in case guess !< && !>, it must be ==.
            {                                               //      End loop and congradulate user.
               System.out.printf(ENG5);                   //   nofify user to their success
               break;                                       //   stop loop
            } // else
         } // try
         catch (Exception e)                                // catch there was an error. Most likely due to
         {                                                  //      input not being an integer
            System.out.printf(ENG6);                      //    prompt user to enter an integer
         } // catch
      } // while (true)
   } // main()
} // class Ch04_Pc17_BandyR