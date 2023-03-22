public class Exercicio9 {

    public static void main(String[] args) {

        String s = "IZ0-808";

        StringBuilder builder = new StringBuilder("IZ0");

        s.replace("-","");

        builder.append("-808");

        System.out.println(s.equals(builder.toString()));
    }
}
