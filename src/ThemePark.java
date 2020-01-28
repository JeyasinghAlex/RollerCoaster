public class ThemePark {
    public static void main(String[] args) {
        System.out.println("#------------------------------------------------------#");
        System.out.println("#                      Theme Park                      #");
        System.out.println("#------------------------------------------------------#");
        Game game = new Game();
        Operator operator = new Operator();
        VisitorsRegistration visitorsRegistration = new VisitorsRegistration();
        MoneyCollector moneyCollector = new MoneyCollector();
        showGames(game, visitorsRegistration, operator, moneyCollector);
    }

    public static void showGames(Game game, VisitorsRegistration visitorsRegistration, Operator operators, MoneyCollector moneyCollector) {
        System.out.println();
        Game selectedGame = null;
        System.out.println("1) Roller Coaster");
        System.out.println("2) Columbus ");
        System.out.print("Enter your selection - ");
        int selectGameOption = ThemParkUtil.getInstance().checkAndReturnValidInput();
        if (selectGameOption == 1){
            int seat = operators.accessRollerCoaster();
            selectedGame  = game.getInstance("Roller Coaster", seat);
        }
        visitorsRegistration.newRegistration();
        moneyCollector.collectMoney(selectedGame, operators, visitorsRegistration);
        showGames(game, visitorsRegistration, operators, moneyCollector);
    }
}
