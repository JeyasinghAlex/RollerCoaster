package Temp;

import java.util.ArrayList;
import java.util.Scanner;

public class VisitorsRegistration {

    private int ticket = 100;
    public Queue  queue = new Queue();
    private ArrayList<Visitor> visitorArrayList = new ArrayList<>();

    public void newRegistration() {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("How Many Visitors - ");
        int totalVisitor = ThemParkUtil.getInstance().checkAndReturnValidInput();
        queue.enQueue(totalVisitor);
        for (int i = 1; i <= totalVisitor; i++) {
            System.out.print(i + " Temp.Visitor Name - ");
            String name = scan.nextLine();
            System.out.print(i + " Temp.Visitor Age - ");
            int age = ThemParkUtil.getInstance().checkAndReturnValidInput();
            System.out.println("Select Gender");
            System.out.println("1) Male");
            System.out.println("2) FeMale");
            System.out.print("Which one ? -");
            int gender = ThemParkUtil.getInstance().checkAndReturnValidInput();
            String gen = "";
            switch (gender)
            {
                case 1:
                    gen = "Male";
                    visitorArrayList.add(new Visitor(name, age, gen));
                    break;
                case 2:
                    gen = "FeMale";
                    visitorArrayList.add(new Visitor(name, age, gen));
                    break;
                default:
                    System.out.println("Enter the Valid Option");
                    scan.nextLine();
                    break;
            }
        }
        System.out.println("Temp.Visitor is coming back ?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int option = ThemParkUtil.getInstance().checkAndReturnValidInput();
        if(option == 1)
            newRegistration();
    }

    public void showVisitors() {
        for (int i = 0; i < visitorArrayList.size(); i++){
            System.out.println(visitorArrayList.get(i).toString());
        }
    }
}
