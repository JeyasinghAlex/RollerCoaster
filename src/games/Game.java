package games;

import operator.Operator;

public abstract class Game {
    public abstract String getName();
    Operator operator;

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator(){
        return this.operator;
    }
}
