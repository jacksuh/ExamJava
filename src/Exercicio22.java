public class Exercicio22 {

    public static void main(String[] args) {

        int x = 10, y = 12;

        if(Boolean.logicalAnd(x++ > 11, y -- > x)){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
    }
}
