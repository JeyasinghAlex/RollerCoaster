import java.util.ArrayList;

public class RecordBook {
    private static class Record {
        private int numberOfRoundsOperated;
        private int numberOfSeatsFilled;
        private int totalAmountEarned;

        private Record(int numberOfRounds, int numberOfSeats, int amountEarned){
            this.numberOfRoundsOperated = numberOfRounds;
            this.numberOfSeatsFilled = numberOfSeats;
            this.totalAmountEarned= amountEarned;
        }
    }

    ArrayList<Record> records;

    public RecordBook() {
    }

    public void addRecordInRecordBook(int numberOfRounds, int numberOfSeats, int amountEarned){
        records.add(new Record(numberOfRounds, numberOfSeats, amountEarned));
    }

    public ArrayList<Record> getRecords(){
        return records;
    }
}
