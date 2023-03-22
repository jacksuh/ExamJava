import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Exercicio20 {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(0);
        cal.set(2015,04,20,11,22);

        //No Java 8 podemos utilizar
        LocalDateTime local = LocalDateTime.of(2015,05,20,11,22);
        Date date = cal.getTime();

        System.out.println(date);

        //Nesse caso estou pegando a data do dia.
        int date1 = local.getDayOfMonth();
        System.out.println(date1);

    }
}
