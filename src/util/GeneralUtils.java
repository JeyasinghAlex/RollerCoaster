package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
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

    public ArrayList<String> getSpaceSeperatedValues(String str) {
        List<String> stringArrayList;
        String[] strings = str.split(" ");
        stringArrayList = Arrays.asList(strings);
        return new ArrayList<>(stringArrayList);
    }


}
