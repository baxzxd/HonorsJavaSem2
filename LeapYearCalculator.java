/*
 * Name: Adam Mason
 * Date: 2/6/2019
 * Project Description: Check whether the entered year is a leap year or not.
 */
import java.util.Scanner;
public class LeapYearCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int intInput = 0;
        String stringInput = "";
        char progRun = 'y';
        while( progRun == 'y' )
        {
            intInput = 0;
            progRun = ' ';
            
            while( intInput < 1582 )
            {
                System.out.print("Enter a year greater than 1582: ");
                intInput = scan.nextInt();
            }
                
            if( intInput % 4 == 0 )
            {
                if( intInput % 100 == 0 && intInput % 400 != 0 )
                {
                    System.out.println("The year " + intInput + " is not a leap year.");
                }
                else
                    System.out.println("The year " + intInput + " is a leap year.");
            }
            else
                System.out.println("The year " + intInput + " is not a leap year.");
            
            scan.nextLine();
                
            while( progRun != 'y' && progRun != 'n' )
            {
                System.out.print("Would you like to test another year (Y/N): ");
                stringInput = scan.nextLine().toLowerCase();
                if( stringInput.length() == 0 )
                    progRun = ' ';
                else if ( stringInput.length() > 0 )
                    progRun = stringInput.charAt(0);
            }
        }
    }
}
//end-of-file
//end-of-file