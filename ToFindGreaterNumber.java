public class ToFindGreaterNumber {
    public static void main(String[] args){
        int a=10, b=34, c=12;
        if(a>b && a>c)
            System.out.println(a+" is the largest Number");
        else if(b>a && b>c)
            System.out.println(b+" is the largest Number");
        else
            System.out.println(c+" is the largest number");
    }
}
