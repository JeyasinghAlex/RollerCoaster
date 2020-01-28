public class GameHandler {
    public GameHandler gameHandler = null;

    public GameHandler getInstance() {
        if(gameHandler == null){
            return new GameHandler();
        } else {
            return gameHandler;
        }
    }

    public Game getGameHandler(String handlerKey) {
        if(handlerKey == null) {
            return null;
        } else if(handlerKey.equals(ThemeParkConstants.Game.ROlLLER_COASTER)) {
            return new RollerCoaster();
        } else if(handlerKey.equals(ThemeParkConstants.Game.AIR_SHIP)) {
            return new AirShip();
        } else if(handlerKey.equals(ThemeParkConstants.Game.KIDS_RIDE)) {
            return new KidsRide();
        } else if(handlerKey.equals(ThemeParkConstants.Game.RAINBOW_DRAGON)) {
            return new RainbowDragon();
        }
        return null;
    }
}
