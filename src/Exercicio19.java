public class Exercicio19 {

    public static void main(String[] args) {

        int x = 10;
        //operadores ternario
        //verifica se x é maior que 10 caso contrario, verifica se x é menor que 10 caso contrario atribua 1
        //na variavel Y se a segunda condição for verdadeira ira atribuir -1 caso contrario 0
        int y = x>10?1:x<10?-1:0;

        //se x é menor que dez imprima 1 caso contrario 0
        int g = x>10?1:0;

        System.out.println(y);
        System.out.println(g);
    }
}
