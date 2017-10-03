public class ConverterTest {
    public static void converterTest() {
        final int DAYS_NUMBER = 7;


        for (int count = 1; count <= DAYS_NUMBER; count++) {
            System.out.println(count + " Dzień tygodnia to " + CalandarConverter.convertDayToString(count));
        }
    }
}
