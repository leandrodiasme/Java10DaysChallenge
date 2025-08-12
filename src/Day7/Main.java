package Day7;

public class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try{
            double result = calculator.divide(10, 0);
            System.out.println(result);
        }catch(CustomException e){
            System.out.println("Error: " + e);
        }
    }
}
