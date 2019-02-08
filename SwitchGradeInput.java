import java.util.Scanner;
public class SwitchGradeInput
{
    public static void main(String [] args)
    {
        int gradeInput = -1;
        Scanner scan = new Scanner(System.in);
        while( gradeInput < 0 || gradeInput > 100 )
        {
            System.out.print("Enter a grade between 0 and 100: ");
            gradeInput = scan.nextInt();
        }
        
        System.out.println( gradeInput / 10 );
        switch( gradeInput / 10 )
        {
            case 10: 
                System.out.println("Perfect.");
                break;
            case 9:
                System.out.println("A, Nice!");
                break;
            case 8:
                System.out.println("B, pretty good");
                break;
            case 7:
                System.out.println("C, average.");
                break;
            case 6:
                System.out.println("D, almost a failure.");
                break;
            default:
                System.out.println("Complete failure.");
        }
    }
}
