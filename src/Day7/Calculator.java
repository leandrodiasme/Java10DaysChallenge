package Day7;

public class Calculator {
    public double divide(double d1, double d2) throws CustomException {
        if(d2 == 0){
            throw new CustomException("Division by zero is not allowed, sweet");
        }
        return d1 / d2;
    }
}

