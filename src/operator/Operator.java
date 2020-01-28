package operator;

import games.Game;

import java.util.Scanner;

public class Operator {
    private String name;
    Scanner scanner = new Scanner(System.in);
    private int numberOfRounds; //Number of Rounds left to be operated today
    public RecordBook operatorRecordBook;

    public Operator(String name, int numberOfRounds) {
        this.name = name;
        operatorRecordBook = new RecordBook();
    }

    public String getName() {
        return this.name;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public void operateGame(Game game) {
        System.out.print("Provide the number of seats available for " + game.getName() + ": ");
        int numberOfSeatsAvailable = scanner.nextInt();
        fillSeats(numberOfSeatsAvailable);
    }

    public void fillSeats(int numberOfSeatsAvailable) {

    }
}
