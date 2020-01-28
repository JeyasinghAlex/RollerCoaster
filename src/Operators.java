import java.util.ArrayList;
import java.util.Scanner;

public class Operators {

    private int round;
    public ArrayList<RecordBook> recordBookArrayList  = new ArrayList<>();
    public void setRound(int round) {
        this.round = round;
    }
    public int getRound() {
        return this.round;
    }

    public int accessGame() {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------Welcome to Roller Coasters--------------------");
        System.out.print("How Much Round/day - ? - ");
        setRound(scan.nextInt());
        System.out.print("How Many seat available in Roller Coasters - ? - ");
        return scan.nextInt();
    }

    public void showRollerCoastEarning() {
        for(int i = 0; i < recordBookArrayList.size(); i++){
            System.out.println(recordBookArrayList.get(i).toString());
        }
    }
}
