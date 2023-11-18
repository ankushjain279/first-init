import java.util.*;
public class function4
{
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
  public static int bincoff(int n, int r)
  {
    int fac_n=fact(n);
    int fac_r=fact(r);
    int fac_nr=fact(n-r);
    return(fac_n/(fac_r*fac_nr));
  }
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    int x=bincoff(n,r);
    System.out.println("the binomail cofficient of the number is " + x );
  }
}