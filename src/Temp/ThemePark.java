package Temp;

import games.AirShip;
import games.Game;
import games.GameHandler;
import games.RainbowDragon;
import games.RollerCoaster;
import operator.Operator;
import util.GeneralUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ThemePark {
    private static ArrayList<Operator> overallOperatorsList = new ArrayList<>();
    private static ArrayList<Game> overallGamesList = new ArrayList<>();

    private ArrayList<Game> availableGameList;

    public ThemePark() {
        availableGameList = new ArrayList<>();
    }

    static {
        overallOperatorsList.add(new Operator("O1", 0));
        overallOperatorsList.add(new Operator("O2", 0));
        overallOperatorsList.add(new Operator("O3", 0));

        overallGamesList.add(new RollerCoaster());
        overallGamesList.add(new AirShip());
        overallGamesList.add(new RainbowDragon());
    }

    public void setGameAndAssignOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the rides available today: ");
        for (int i = 0; i < overallGamesList.size(); i++) {
            System.out.print(i + 1 + ")" + overallGamesList.get(i).getName() + "\n");
        }
        System.out.print("Rides available: ");
        String selectedRides = scanner.nextLine();
        ArrayList<String> selectedRidesList = GeneralUtils.getInstance().getSpaceSeperatedValues(selectedRides);
        setAvailableGameList(selectedRidesList);
        for(int i = 0; i < getAvailableGameList().size(); i++){
            assignOperatorForGame(getAvailableGameList().get(i));
        }
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

    public void assignOperatorForGame(Game game) {
        Scanner scanner = new Scanner(System.in);
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

    public void listAvailableOperators() {
        for (int i = 0; i < overallOperatorsList.size(); i++) {
            System.out.println(i + 1 + ")" + overallOperatorsList.get(i).getName());
        }
    }

    public Operator getSelectedOperator(String name) {
        for (int i = 0; i < overallOperatorsList.size(); i++) {
            if (overallOperatorsList.get(i).getName().equals(name)) {
                return overallOperatorsList.get(i);
            }
        }
        return null;
    }


    public void removeAssignedOperator(Operator operator) {
        overallOperatorsList.remove(operator);
    }
}