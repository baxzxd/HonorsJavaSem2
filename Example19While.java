import java.util.Scanner;

public class Example19While
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = -1,i = 0,j = 0;
        
        while( input > 15 || input < 0)
        {
            System.out.print("Enter an integer between 1-15: ");
            input = scan.nextInt();
            i = j = input;
            System.out.println();
        }
        
        while( i > 0 )
        {
            while( j > 0 )
            {
                System.out.print("X ");
                j--;
            }
            System.out.println();
            i--;
            j = input;
        }
    }
}