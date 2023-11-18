import java.util.*;
public class btodcon {
    public static int conversion(int num)
    {
        int x,i=0,result=0;
        while(num!=0)
        {
           x=num%10;
           num=num/10;
           result+=x*(int)(Math.pow(2,i));
           i++;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("the result of binary to decimal conversion :" +conversion(num)); 
    }
}
