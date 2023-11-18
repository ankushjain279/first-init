import java.util.*;
public class factorial {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    int fact=1;
    if(num==0 || num==1){
        System.out.println(" factorial is 1");
    }
    else if(num<0){
       System.out.println(" invalid no");  
    }
    else
    {
        for(int i=num;num>1;i--)
        {
            fact=fact*i;
            num--;
        }
         System.out.println(" factorial is "+ fact);
    }
}   
}
