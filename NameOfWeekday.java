import java.util.Scanner;

public class NameOfWeekday {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        number = sc.nextInt();
        if(number==1)
            System.out.println("Name of weekday is: Sunday");
        else if(number==2)
            System.out.println("Name of weekday is: Monday");
        else if(number==3)
            System.out.println("Name of weekday is: Tuesday");
        else if(number==4)
            System.out.println("Name of weekday is: Wednesday");
        else if(number==5)
            System.out.println("Name of weekday is: Thursday");
        else if(number==6)
            System.out.println("Name of weekday is: Friday");
        else if(number==7)
            System.out.println("Name of weekday is: Saturday");
        else
            System.out.println("Wrong input");
    }
}