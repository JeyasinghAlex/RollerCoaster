package Temp;

import java.util.InputMismatchException;
import java.util.Scanner;

final class ThemParkUtil {

    private static ThemParkUtil themParkUtil = new ThemParkUtil();
    private ThemParkUtil() {

    }

    public static ThemParkUtil getInstance() {
        return themParkUtil;
    }

    public int checkAndReturnValidInput() {
        Scanner scan = new Scanner(System.in);
        try {
             return scan.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Type Of Exception is -" + ex);
            System.out.println("Plzz Enter Valid Input");
            System.out.println("Enter the Correct Value");
            return checkAndReturnValidInput();
        }
    }
}
