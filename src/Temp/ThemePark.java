package Temp;

import Games.AirShip;
import Games.Game;
import Games.RainbowDragon;
import Games.RollerCoaster;

import java.util.ArrayList;
import java.util.Scanner;

public class ThemePark {
    private static ArrayList<Operator> operatorsList = new ArrayList<>();
    private static ArrayList<Game> gamesList = new ArrayList<>();

    private ArrayList<Game> availableGameList;

    public ThemePark() {
        availableGameList = new ArrayList<>();
    }

    static {
        operatorsList.add(new Operator("O1", 0));
        operatorsList.add(new Operator("O2", 0));
        operatorsList.add(new Operator("O3", 0));

        gamesList.add(new RollerCoaster());
        gamesList.add(new AirShip());
        gamesList.add(new RainbowDragon());
    }

    public void setAvailableGames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the rides available today: ");
        for (int i = 0; i < gamesList.size(); i++) {
            System.out.print(i + 1 + ")" + gamesList.get(i).getName() + "\n");
        }
        System.out.print("Rides available: ");
        String selectedRides = scanner.nextLine();
        ArrayList<String> selectedRidesList = GeneralUtils.getInstance().getSpaceSeperatedValues(selectedRides);
        setAvailableGameList(selectedRidesList);
    }

    public void setAvailableGameList(ArrayList<String> ridesList) {
        for (int i = 0; i < ridesList.size(); i++) {
            if (ridesList.get(i).equals("1")) {
                Game game = GameHandler.getInstance().getGameHandler(ThemeParkConstants.Game.ROLLER_COASTER);
                availableGameList.add(game);
            } else if (ridesList.get(i).equals("2")) {
                availableGameList.add(GameHandler.getInstance().getGameHandler(ThemeParkConstants.Game.AIR_SHIP));
            } else if (ridesList.get(i).equals("3")) {
                availableGameList.add(GameHandler.getInstance().getGameHandler(ThemeParkConstants.Game.RAINBOW_DRAGON));
            }
        }
    }

    public ArrayList<Game> getAvailableGameList() {
        return availableGameList;
    }

    public void assignOperatorForGames(ArrayList<Game> gamesList) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < gamesList.size(); i++) {
            Game game = gamesList.get(i);
            System.out.println("--------------------------------------------");
            System.out.println("\nAssign an operator for " + game.getName());
            System.out.println("Available Operators: ");
            listAvailableOperators();
            System.out.print("Please select an operator: ");
            String selectedOperatorForThisRide = scanner.nextLine();
            Operator operator = getSelectedOperator(selectedOperatorForThisRide);
            game.setOperator(operator);
            removeAssignedOperator(operator);
        }
    }

    public void listAvailableOperators() {
        for (int i = 0; i < operatorsList.size(); i++) {
            System.out.println(i + 1 + ")" + operatorsList.get(i).getName());
        }
    }

    public Operator getSelectedOperator(String name) {
        for (int i = 0; i < operatorsList.size(); i++) {
            if (operatorsList.get(i).getName().equals(name)) {
                return operatorsList.get(i);
            }
        }
        return null;
    }


    public void removeAssignedOperator(Operator operator) {
        operatorsList.remove(operator);
    }
}