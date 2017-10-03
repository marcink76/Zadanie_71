import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj numer dnia:");
        int dayNumber = scanner.nextInt();

        System.out.println(CalandarConverter.convertDayToString(dayNumber));

        ConverterTest.converterTest();

    }
}
