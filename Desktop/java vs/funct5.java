//printing all prime number in a range
import java.util.*;
public class funct5 {
    public static void allprime(int range)
    {
    if (range==2)
     System.out.println(range);
    else{
    for(int i=2;i<range;i++)
    {
        int flag=1;
       for(int j=2;j<i;j++)
       {
        if(i%j==0)
        {
           flag=0;
            break;
        }
       }
       if(flag==1)
        System.out.println(i);

    }
    }
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int range =sc.nextInt();
        allprime(range);
    }
}
 