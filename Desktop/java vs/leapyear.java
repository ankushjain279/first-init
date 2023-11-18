import java.util.*;
public class leapyear {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int year=s.nextInt();
        /*
         for leap year
         The year is multiple of 400.
         The year is a multiple of 4 and not a multiple of 100.
         */
        if((year%4==0 &&  year%100!=0) || year%400==0 ){
        System.out.println("Leap year");
        }
        else{
             System.out.println("not a Leap year");
        }
    }
}
