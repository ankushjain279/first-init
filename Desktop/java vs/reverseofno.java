import java.util.Scanner;

public class reverseofno {
    public static void main(String args[]) 
    {
       Scanner s = new Scanner(System.in);
       int num = s.nextInt();
       int i,sum =0;
       while(num!=0) {
         i = num%10;
         sum= sum*10 + i;
         num=num/10;
       }
       System.out.println(sum);
    }
    
}
