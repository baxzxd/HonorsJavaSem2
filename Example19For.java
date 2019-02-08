import java.util.Scanner;

public class Example19For
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = -1;
        
        while( input > 15 || input < 0)
        {
            System.out.print("Enter an integer between 1-15: ");
            input = scan.nextInt();
            System.out.println();
        }
        
        for( int i = 0; i < input; i++ )
        {
           for( int j = 0; j < input; j++ )
           { 
                System.out.print("X ");
           }
           System.out.println();
        }
    }
}