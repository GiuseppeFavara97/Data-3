import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataStringAnno = data.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Anno: " + dataStringAnno);

        String dataStringMese = data.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("Mese: " + dataStringMese);

        String dataStringGiorno = data.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("Giorno: " + dataStringGiorno);

        String dataStringGiornoDellaSettimana = data.format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("Giorno della settimana: " + dataStringGiornoDellaSettimana);
    }
}