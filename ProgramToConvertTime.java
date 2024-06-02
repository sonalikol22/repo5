public class ProgramToConvertTime {
    public static void main(String[] args) {
        int number = 86399;
        int hours = number / 3600;
        int minutes = (number % 3600) / 60;
        int seconds = number % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");

    }
}