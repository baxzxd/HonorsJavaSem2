/*
 * Name: Adam Mason
 * Date: 1/23/2019
 * Project Description: 
 */
import java.util.Scanner;
import java.util.Random;
public class StringManipulator
{
    public static void main( String args[] )
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int subString1, subString2, uppercaseIndex = -1, inputLength;
        char randChar;
        String input = " ";
        boolean uppercaseContained = false;
        
        while( input.length() < 8 || input.length() > 15 )
        {
            System.out.println("Enter a string that is longer than 8 but less than 15: ");
            input = scan.nextLine();
        }
        
        inputLength = input.length();
        randChar = input.charAt( rand.nextInt( inputLength ));
        subString1 = rand.nextInt( inputLength - 1);
        subString2 = rand.nextInt( inputLength - subString1 ) + subString1;
       
        System.out.println( "String length: " + inputLength );
        System.out.println( "Random Character: " + randChar );
        System.out.println( "Substring: " + input.substring(subString1,subString2 + 1) );
        System.out.println( "Random Starting Character: " + input.substring(rand.nextInt(inputLength - 1)) );
        System.out.println( "Uppercase: " + input.toUpperCase() + "\nLowercase: " + input.toLowerCase() );
        
        for( int i = 0; i < input.length(); i++ )
        {
            if( input.charAt(i) >= 65 && input.charAt(i) <= 90 )
            {
                uppercaseContained = true;
                int upperCaseLocation = i;
                if( uppercaseIndex < 0 )
                {
                    uppercaseIndex = input.charAt(i);
                }
            }
        }
        
        if( uppercaseContained == true && uppercaseIndex > 0 )
        {
            System.out.println( "Uppercase Contained" );
            System.out.println( "Uppercase at index: " + (char)(uppercaseIndex) );
        }
        
        System.out.print("Reversed: ");
        
        for( int j = inputLength - 1; j > -1; j-- )
        {
            System.out.print( input.charAt(j) );
        }
    }
}
//end-of-file