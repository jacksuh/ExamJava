public class Exercicio4 {

    public static void main(String[] args) {

        if(Move.getSpeed() > 10){
            System.out.println("RUN");
        }else{
            System.out.println("Walk");
        }
    }

    interface Move{
        public static int getSpeed(){
            return 10;
        }
    }
}
