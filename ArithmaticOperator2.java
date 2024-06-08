public class ArithmaticOperator2 {
    public static void main(String[] args){
        int a=10, b=6;
        int sum, difference,product,avg,distance;
        sum=a+b;
        System.out.println("Sum of 2 numbers is:-"+sum);
        difference=a-b;
        System.out.println("Difference of 2 numbers is:-"+difference);
        product=a*b;
        System.out.println("Product of 2 numbers is:-"+product);
        avg=(a+b)/2;
        System.out.println("Average of 2 numbers is:-"+avg);
        distance=a-b;
        System.out.println("Distance of 2 numbers is:-"+distance);
        if(a>b)
            System.out.println("Maximum number is:-"+a+" " +"Minimum number is:-"+b);
        else {
            System.out.println("Maximum number is:-" + b + "Minimum number is:-" + a);
        }



    }
}
