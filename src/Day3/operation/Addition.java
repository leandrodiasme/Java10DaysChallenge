package Day3.operation;

import Day2.MathOperation;

public class Addition implements MathOperation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
