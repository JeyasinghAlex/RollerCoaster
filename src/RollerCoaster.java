public class RollerCoaster extends Game {

    private int seat;
    private String gameName;

    public RollerCoaster(int seat, String gameName) {
        this.seat = seat;
        this.gameName = gameName;
    }

    public int getSeat() {
        return this.seat;
    }
}
