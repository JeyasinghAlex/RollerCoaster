import java.util.ArrayList;
import java.util.HashMap;

public class ThemPark {
    public static ArrayList<Game> games =new ArrayList<>();
    public static HashMap<String,Game> visitorNameVsGameAssigned = new HashMap<>();

    public static ArrayList<Operator> availableOperators = new ArrayList<>();


    static {
        availableOperators.add(new Operator("vignesh"));
        availableOperators.add(new Operator("siva"));
        availableOperators.add(new Operator("saravana"));
    }


    static {
        games.add(new RollerCoaster());
        games.add(new Colambus());
    }
    public static void main(String[] args) {
        System.out.println("-------------------------Welcome to Them Park---------------------");
        VisitorsRegistration visitorsRegistration = new VisitorsRegistration();
        Operator operators = new Operator();
        MoneyCollector moneyCollector = new MoneyCollector();
        showGames( visitorsRegistration, operators, moneyCollector);
    }



    public static void showGames(VisitorsRegistration visitorsRegistration, Operator operators, MoneyCollector moneyCollector) {
        System.out.println();
        Game selectedGame = null;
        for(int i=0;i<games.size();i++){
            System.out.println("Select "+i+1+"for"+games.get(1).getName());
        }
        int selectGameOption = GeneralUtils.getInstance().checkAndReturnValidInteger();
        selectedGame = games.get(selectGameOption-1);


    }
}
