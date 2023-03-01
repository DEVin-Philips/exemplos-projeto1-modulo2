import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {



                Scanner scanner = new Scanner(System.in);
                String dataInput = scanner.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataInput, formatter);
                System.out.println(data.format(formatter));

                if (data.isAfter(LocalDate.of(1950, 1, 1)) && data.isBefore(LocalDate.now())) {

                }
            } catch (DateTimeParseException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }

    }
}