import java.util.Scanner;

public class PositiveNegativeNos {
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        number=sc.nextInt();
        if(number>0)
            System.out.println("Number is positive");
        else if(number<0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
    }
}
