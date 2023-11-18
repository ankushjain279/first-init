import java.util.*;
public class pelendromfunc {
    public static boolean pelendrom(int num){
        int flag=num;
        int result=0;
        while(num>0)
        {
           int x;
           x=num%10;
           num/=10;
           result=result*10 +x;
        }
        if(flag==result)
         return true;
         else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(pelendrom(num));
    }
}
