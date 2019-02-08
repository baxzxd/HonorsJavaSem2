import java.util.Scanner;
public class SwitchColorInput
{
    public static void main(String [] args)
    {
        String gradeInput = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        gradeInput = scan.nextLine();
        
        switch( gradeInput )
        {
            case "red": 
                System.out.println("Apple.");
                break;
            case "blue":
                System.out.println("Like the sky.");
                break;
            case "yellow":
                System.out.println("Banana.");
                break;
            case "green":
                System.out.println("Tree leaves");
                break;
            case "black":
                System.out.println("Night sky");
                break;
            default:
                System.out.println("Wrong.");
        }
    }
}
