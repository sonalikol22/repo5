package package1;

import java.util.Scanner;

public class LoopBelowZeroInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();

        while(true)
        {
            if(number<0)
            {
                break;
            }
            System.out.print("true"+ " ");
        }
    }
    }


