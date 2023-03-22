public class Exercicio10 {


    class Animal{
        void eat(){
            System.out.println("Animal eats");
        }
    }

    class Bird extends Animal {
        void eat(){
            System.out.println("Bird eats");
        }

        void print(){
            super.eat();
        }
    }

    public void main(String[] args) {

       Bird b = new Bird();
       b.print();
    }
}
