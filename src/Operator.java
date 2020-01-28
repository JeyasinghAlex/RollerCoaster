public class Operator {
    private String name;
    private int numberOfRounds; //Number of Rounds left to be operated today
    public RecordBook operatorRecordBook;

    public Operator(String name) {
        this.name = name;
        operatorRecordBook = new RecordBook();
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}
