public class FibonacciSeries {
    public static void main(String[] args){
        int num1=0, num2=1, num3,limit=20;
        for(int i=1;i<limit;i++){
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }

    }
}
