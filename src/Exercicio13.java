import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio13 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(11,22);
        time.format(DateTimeFormatter.ISO_LOCAL_DATE); //Devido a tentativa de formatação
        // do localtime utilizando o DateTime que pode ser
        //utilizado apenas por localdate e LocalDateTime, com localtime ira dar erro de
        // UnsuppportedTemporalTypeException

        System.out.println(time);

    }
}
