import java.util.Scanner;

public class tests 
{
    public static int input = 0;
    public static int rangeMin, rangeMax = -2147483648;
    public static String stringInput = "yes";
    public static Scanner scan = new Scanner(System.in);
    
    public static void main()
    {
        while(stringInput.equals("yes"))
        {
            rangeMin = 0; rangeMax = -2147483648;
            System.out.print("Enter the min: ");
            rangeMin = scan.nextInt();
            while (rangeMax < rangeMin || rangeMax == rangeMin || rangeMin + 1 == rangeMax)
            {
                System.out.print("Enter the max: ");
                rangeMax = scan.nextInt();
            }
            intVerification(rangeMin, rangeMax); 
            System.out.println("The value is " + input);
            scan.nextLine();
            stringVerification();
        }
    }
    
    public static int intVerification( int rangeMin, int rangeMax )
    {
        input = rangeMin - 1;
        while( input > rangeMax || input < rangeMin )
        {
            System.out.print("Enter a value between " + rangeMin + " and " + rangeMax + ": ");
            input = scan.nextInt();
        }
        return input;
    }   
    
    public static String stringVerification()
    {
        stringInput = " ";
        while( !stringInput.equals("yes") && !stringInput.equals("no") )
        {
            System.out.print("Enter yes or no: ");
            stringInput = scan.nextLine();
            
        }
        return stringInput;
    }   
}
