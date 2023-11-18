import java.util.Scanner;

public class dtobconversion {
    public static int conversion(int num)
    {
        int x,i=0,result=0;
        while(num>0)
        {
            x=num%2;
            num/=2;
            result += x*(int)(Math.pow(10, i));
            i++;
        }
        return result;
    }
      public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("the result of decimal to binary conversion :" +conversion(num)); 
    }  
}
