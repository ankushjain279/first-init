import java.util.*;
public class incometax
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int income=s.nextInt();
        int tax;
       // System.out.println(tax);//error
        if(income<500000){
            System.out.println("zero percent tax");
            tax=0;
        }
        else if(income>500000 && income<1000000){
            System.out.println("20 percent tax");
            tax= (int)(income*(0.2));
        }
         else{ 
            System.out.println("30 percent tax");
            tax= (int)(income*(0.3));    
        }
         System.out.println("tax is : " +tax);
    
}
}