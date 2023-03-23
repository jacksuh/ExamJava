public class Exercicio24 {

    public static void main(String[] args) {

        //iraimprimirOCAJP, primeiro esta vazio, ultimo informa a quantidade de caracteres
        //Para que o StringBuilder guarde para a gente.
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder("OCAJP");
        StringBuilder builder3 = new StringBuilder(12);


        System.out.println(builder1.toString() + builder2.toString() + builder3.toString());
    }
}
