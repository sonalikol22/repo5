
class PrimeNumber {
    public static void main(String[] args)
{
    int counter,limit=0,i=1,j;
    while(limit<20)
    {
        j=1;
        counter=0;
        while(j<=i)
        {
            if(i%j==0)
                counter++;
            j++;
        }
        if(counter==2)
        {
            System.out.printf("%d ",i);
            limit++;
        }
        i++;
    }
}
}


