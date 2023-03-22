import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;

public class Exercicio6 {

    public static void main(String[] args) {

        Alpha a = new Beta();
        ((Beta)a).print();
    }
}

class Alpha{
    public void print()throws IOException{
        System.out.println("A");
    }
}

class Beta extends Alpha{
    public void print()throws NullPointerException{
        System.out.println("B");
    }
}