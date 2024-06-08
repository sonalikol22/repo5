public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args){


       // int number=125.4875;

        int number=525600;
        int year,days;
        int minutesInYear = 60 * 24 * 365;
        int temp=number;
        year=temp/minutesInYear;
        temp=temp-(year*minutesInYear);
        days=number/(60*24);
        System.out.println(number + " minutes is " + year + " years and " + days + " days");



    }
}
