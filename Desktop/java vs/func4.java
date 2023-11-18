import java.util.Scanner;

public class func4 {
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
    System.out.println("input  the value of n and r to find binomial cofficent");
     Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int r= sc.nextInt();
    int n1=fact(n);
    int r1=fact(n);
    int d=fact(n-r);
    System.out.println(n1/(d*r1));
   } 
}
