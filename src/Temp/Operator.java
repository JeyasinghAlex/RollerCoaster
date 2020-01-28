package Temp;

public class Operator {
    private String name;
    private int numberOfRounds; //Number of Rounds left to be operated today
    public RecordBook operatorRecordBook;

    public Operator(String name, int numberOfRounds) {
        this.name = name;
        operatorRecordBook = new RecordBook();
    }

    public String getName(){
        return this.name;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}
