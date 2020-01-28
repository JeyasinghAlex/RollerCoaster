public class RecordBook {

    private int perDayRound;
    private int rollerCoasterSeat;
    private int perDayEarning;

    public RecordBook(int perDayRound, int rollerCoasterSeat, int perDayEarning) {
        this.perDayRound = perDayRound;
        this.rollerCoasterSeat = rollerCoasterSeat;
        this.perDayEarning = perDayEarning;
    }

    @Override
    public String toString() {
        return " perDayRound = " + perDayRound + ", rollerCoasterSeat = " + rollerCoasterSeat + ", perDayEarning = " + perDayEarning ;
    }
}
