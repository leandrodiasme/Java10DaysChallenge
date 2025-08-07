package Day2;

public class Main {
    public static void main(String[] args) {
        MathOperation add = new Addition();
        MathOperation multiply = new Multiplication();

        double resultAdd = add.execute(5,5);
        double resultMultiply = multiply.execute(5,5);

        System.out.println(resultAdd);
        System.out.println(resultMultiply);
    }
}
