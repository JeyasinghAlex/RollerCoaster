import java.util.InputMismatchException;
import java.util.Scanner;

final class GeneralUtils {

    private static GeneralUtils generalUtils = new GeneralUtils();
    private GeneralUtils() {

    }

    public static GeneralUtils getInstance() {
        return generalUtils;
    }

    public int checkAndReturnValidInteger() {
        Scanner scan = new Scanner(System.in);
        try {
             return scan.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Type Of Exception is -" + ex);
            System.out.println("Plzz Enter Valid Input");
            System.out.println("Enter the Correct Value");
            return checkAndReturnValidInteger();
        }
    }

    public String checkAndReturnValidString(){
        Scanner scan = new Scanner(System.in);
        try {
            return scan.nextLine();
        } catch (InputMismatchException ex){
           // System.out.println("Type Of Exception is -" + ex);
            System.out.println("Plzz Enter Valid Input");
            System.out.println("Enter the Correct Value");
            return checkAndReturnValidString();
        }
    }


}
