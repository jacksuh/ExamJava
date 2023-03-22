public class Exercicio17 {

    public static void main(String[] args) {

        //Quando no for o x++ esta dentro conta de 0 a 9
        for (int x = 0; x < 10; x++){
            System.out.println(x);
        }

        //Dessa forma ele ira imprimir de 1 a 10
        for(int x = 0; x < 10; System.out.println(x))
            x++;

    }
}
