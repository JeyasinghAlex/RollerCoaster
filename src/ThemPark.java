public class ThemPark {
    public static void main(String[] args) {
        System.out.println("-------------------------Welcome to Them Park---------------------");
        Game game = new Game();
        VisitorsRegistration visitorsRegistration = new VisitorsRegistration();
        Operators operators = new Operators();
        MoneyCollector moneyCollector = new MoneyCollector();
        showGames(game, visitorsRegistration, operators, moneyCollector);
    }

    public static void showGames(Game game, VisitorsRegistration visitorsRegistration, Operators operators, MoneyCollector moneyCollector) {
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
