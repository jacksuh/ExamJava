import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio15 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");

        //indexOf retorna o valor dentro de uma string caso o valor não seja encontrado ele retorna -1
        // C esta na posição 1
        System.out.println(list.indexOf("C"));

        //reverte a ordem de uma lista especifica -1 D não existe então não ira encontrar.
        Collections.reverse(list);
        System.out.println("" + list.indexOf("D"));


        Collections.sort(list);

        System.out.println("" + list.indexOf("A"));

    }
}
