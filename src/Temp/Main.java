package Temp;

import Games.Game;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static ArrayList<Game> games =new ArrayList<>();
    public static HashMap<String,Game> operatorGameMap = new HashMap<>();



    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|                      Welcome to Theme Park                    |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n***Admin logged in successfully***\n");

        Admin admin = new Admin();
        admin.themePark.setGameAndAssignOperator();
        printAssignedDetails(admin);
    }

    private static void printAssignedDetails(Admin admin){
        System.out.println("-----------------------------------------------");
        for(int i = 0; i < admin.themePark.getAvailableGameList().size(); i++){
            Game game  = admin.themePark.getAvailableGameList().get(i);
            System.out.println("Operator " + game.getOperator().getName() + " is assigned for " + game.getName());
        }
        System.out.println("-----------------------------------------------");

    }
}
