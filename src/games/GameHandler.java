package games;

import Temp.ThemeParkConstants;

public class GameHandler {
    public static Game getGameHandler(String handlerKey) {
        if(handlerKey == null) {
            return null;
        } else if(handlerKey.equals(ThemeParkConstants.Game.ROLLER_COASTER)) {
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
