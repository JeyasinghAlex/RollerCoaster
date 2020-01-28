package Temp;

public class AdminOperations {
    private static AdminOperations adminOperations = new AdminOperations();
    private Admin admin;

    public static AdminOperations getInstance() {
        return adminOperations;
    }

//    private void configureThemePark() {
//        if (login()) {
//            for (int i = 0; i < Temp.ThemePark.games.size(); i++) {
////                System.out.println("Select "+i+1+"for"+Temp.ThemePark.games.get(1).getName());
//            }
//            int selectGameOption = Temp.GeneralUtils.getInstance().checkAndReturnValidInteger();
//            Game selectedGame = Temp.ThemePark.games.get(selectGameOption - 1);
//            for (int i = 0; i < Temp.ThemePark.games.size(); i++) {
////                System.out.println("Select "+i+1+"to for"+Temp.ThemePark.availableOperators.get(1).name);
//            }
//            int selectedOperatorAction = Temp.GeneralUtils.getInstance().checkAndReturnValidInteger();
//            Temp.Operator selectedOperator = Temp.ThemePark.availableOperators.get(selectedOperatorAction - 1);
//
//        }
//    }
}
