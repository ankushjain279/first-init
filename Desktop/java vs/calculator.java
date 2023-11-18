import java.util.*;
public class calculator {
public static void main(String args[]){    
Scanner s = new Scanner(System.in);
System.out.println("input a:");
int a = s.nextInt();
System.out.println("input b:");
int b = s.nextInt();
System.out.println("input operator:");
char c = s.next().charAt(0);
switch(c)
    {
    case '+':System.out.println(a+b);
             break;
    case '-':System.out.println(a-b);
             break;
    case '*':System.out.println(a*b);
             break;
    case '/':System.out.println(a/b);
             break;               
    default : System.out.println("invalid choie");           
    }

}
}
