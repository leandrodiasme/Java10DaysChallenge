package Day8;

public class Exercise02 {
    interface Operacao{
        int executar(int a, int b);
    }

    public static void main(String[] args) {
        Operacao soma = (x, y)-> x+y;
    }
}


