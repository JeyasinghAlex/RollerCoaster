import java.util.ArrayList;
import java.util.Scanner;

public class Operator {


    private int roundsAssigned;

    public Operator(String name) {
        this.name = name;
    }

    public  String name;




    public void setRoundsAssigned(int roundsAssigned) {
        this.roundsAssigned = roundsAssigned;
    }

    public int getRoundsAssigned() {
        return this.roundsAssigned;
    }

   /* public void operateGame(Game game) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Roller Coasters");
        System.out.print("How Much Round/day - ? - ");
        setRoundsAssigned(scan.nextInt());
        System.out.print("How Many seat available in Roller Coasters - ? - ");
        int seat scan.nextInt();
    }

    public void show() {
        for(int i = 0; i < operatorRecordBook.size(); i++){
            System.out.println(operatorRecordBook.get(i).toString());
        }
    }*/
}
