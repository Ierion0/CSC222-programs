//************************************************************************
//*     @author     Reid Bandy
//*     Date        2022-09-18
//*     Purpose     Get three test scores and calculate average and corresponding letter grade.
//************************************************************************

import java.util.Scanner;


public class Ch03_PC04_BandyR                                              //don't forget class starts with a cap and be sure to follow the naming requirements
{

   public static void main(String[] args)
   {
      float average;                                                       // average of three test scores
      char grade;                                                          // grade expressed as character
      short[] testScores = new short[3];                                   // array to hold test scores
      
      // English output:
      final String ENG[] = {"Enter first test score: ", "Enter second test score: ", "Enter third test score: ", "Average: %.2f\nGrade: %c\n"};   
      Scanner input = new Scanner(System.in);                              // entire program's scanner object.


      // user input:
      System.out.printf(ENG[0]);                                           // prompt for user
      testScores[0] = input.nextShort();                                   // get's user first input
      System.out.printf(ENG[1]);                                           // prompt for second user
      testScores[1] = input.nextShort();                                   // get's user input
      System.out.printf(ENG[2]);                                           // prompt for third user
      testScores[2] = input.nextShort();                                   // get's user input


      // caclulations:
      average = ( testScores[0] + testScores[1] + testScores[2] )  /  3f;  // calculate average test score
      // calculate letter grade
      switch ((short)average / 10)                                         // trim least significant digit off
      {
         case 10:
            grade = 'A';
            break;
         case 9:
            grade = 'A';
            break;
         case 8:
            grade = 'B';
            break;
         case 7:
            grade = 'C';
            break;
         case 6:
            grade = 'D';
            break;
         default:
            grade = 'F';
      } // switch ((short)average / 10)

      // output:
      System.out.printf(ENG[3], average, grade);
   } // main()

} // class Ch03_PC04_BandyR