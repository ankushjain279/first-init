import java.util.*;
public class typeconversion
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        //implicit conversions or type conversion
       // long l= s.nextDouble();//ERROR
        float f= s.nextInt();
        System.out.println(f);
        
        char c='a';
        int ch = c;
        System.out.println(ch);

        //explict
        int i= (int)s.nextFloat();
        System.out.println(i);
   }
}