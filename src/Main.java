import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedDate = currentDate.format(formatter);

        System.out.printf("Winning Numbers for %s are:", formattedDate);

        // Create a Random object
        Random random = new Random();

        // Generate and print 6 lottery numbers separated by commas
        for (int i = 1; i <= 6; i++) {
            int randomNumber = random.nextInt(49) + 1;
            System.out.print(" " + randomNumber + ",");
        }

        // Generate and print the crown number between 1 and 10
        int crownNumber = random.nextInt(10) + 1;
        System.out.print(" Crown Number: " + crownNumber);
    }
}
