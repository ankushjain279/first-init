import java.util.Scanner;

public class prime {
public static void main(String args[])    
{
 Scanner s = new Scanner(System.in);
 int num= s.nextInt();
 int flag=0;
 if(num==2){
    System.out.println("prime number");
 }
 else if(num<=1){
System.out.println("not a prime number");
 }
 else
 {
for(int i =2;i<=Math.sqrt(num);i++){
    if(num%i==0)
    {
        flag =1;
        break;
    }
    else{
        flag=0;
    }
 }
 if(flag==1)
 System.out.println("not prime");
 else
System.out.println("prime");
}
}
}
