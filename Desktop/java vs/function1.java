import java.util.*;
public class function1 {
    public static int add(int x,int y)
    {
       int sum= x+y;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out .println("input to number to find its sum");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = add(num1,num2);
        System.out.println(sum);
    }
    
}
