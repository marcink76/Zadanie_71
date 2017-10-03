class CalandarConverter {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDENSDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURSDAY = 6;
    private static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String dayName = "";

        switch (dayNumber) {
            case MONDAY:
                dayName = "Poniedziałek";
                break;
            case TUESDAY:
                dayName = "Wtorek";
                break;
            case WEDENSDAY:
                dayName = "Sroda";
                break;
            case THURSDAY:
                dayName = "Czwartek";
                break;
            case FRIDAY:
                dayName = "Piątek";
                break;
            case SATURSDAY:
                dayName = "Sobota";
                break;
            case SUNDAY:
                dayName = "Niedziela";
                break;
        }
        return dayName;
    }
}
