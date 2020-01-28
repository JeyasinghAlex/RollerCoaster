package Temp;

import games.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|                      Welcome to Theme Park                    |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n***Admin logged in successfully***\n");

        Admin admin = new Admin();
        admin.themePark.setGameAndAssignOperator();
        printAssignedDetails(admin);
        ArrayList<Game> availableGames = admin.themePark.getAvailableGameList();
        loginOperator(availableGames);
    }

    private static void printAssignedDetails(Admin admin) {
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < admin.themePark.getAvailableGameList().size(); i++) {
            Game game = admin.themePark.getAvailableGameList().get(i);
            System.out.println("Operator " + game.getOperator().getName() + " is assigned for " + game.getName());
        }
        System.out.println("-----------------------------------------------");
    }

    private static void loginOperator(ArrayList<Game> games) {
        System.out.println("-----------------------------------------------");
        System.out.println("Enter operator name to login: ");
        Scanner scanner = new Scanner(System.in);
        String operatorName = scanner.nextLine();
        for (int i = 0; i < games.size(); i++) {
            if (operatorName.equals(games.get(i).getOperator().getName())) {
                Game assignedGame = games.get(i);
                assignedGame.getOperator().operateGame(assignedGame);
            }
        }

    }

}
