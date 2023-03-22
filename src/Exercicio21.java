public class Exercicio21 {

    class A {
        protected void method(){
            System.out.println("base version");
        }
    }

    class C extends A{
        final void method(int i){
            System.out.println("int version");
        }

        void method(double d){
            System.out.println("double version");
        }

        void method(char c){
            System.out.println("char version");
        }
    }

    class MyExamCloud{
        public static void main(String[] args) {
            //A ab = new C();
           // ab.method(5);
        }
    }
}
