public class RollerCoasterBuilder {

    private int seat;
    private String gameName;

    public RollerCoasterBuilder setSeat(int seat) {
        this.seat = seat;
        return this;
    }

    public RollerCoasterBuilder setGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    public RollerCoaster getRollerCoaster() {
        return new RollerCoaster(seat, gameName);
    }
}
