public class Exercicio2 {

    public static void main(String[] args) {

        try{
            String string = null;

            System.out.println(string.length());

        }catch(NullPointerException e){
            System.out.println("Error");
        }

     //   System.out.println(string);
    }


}
