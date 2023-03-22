public class Exercicio18 {

    public static void main(String[] args) {

        //args[0] é uma String que não pode ser convertida e retornara o erro
        // ArrayIndexOutOfBoundsException
        int x = Integer.parseInt(args[0]);

        System.out.println(x);
    }
}
