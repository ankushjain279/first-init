import java.util.Scanner;

public class func3 {
    public static int fact(int num)
    {
        if (num == 0)
              return 1;
        else {
            int result =1;
              for(int i=1;i<=num;i++){
                result*=i;
              }      
              return result;
         }
    }
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println(fact(num1));
   } 
}
