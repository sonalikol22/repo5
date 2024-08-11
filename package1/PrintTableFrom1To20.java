package package1;

public class PrintTableFrom1To20 {
    public static void main(String args[]) {

        {
            for (int i = 1; i <= 20; i++) {
                for (int j = 1; j <= 10; j++) {
                    if (i == 6 || i == 12 | i == 17) {
                        continue;
                    } else {
                        //System.out.print(i * j + " ");
                        System.out.println(i + " * " + (j) + " = " + (i * (j)));
                    }

                }
                System.out.println(" ");

            }
        }
    }
}