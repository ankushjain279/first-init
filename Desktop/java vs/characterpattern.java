import java.util.Scanner;

public class characterpattern {
    public static void main(String args[])
    {

    Scanner sc = new Scanner(System.in);
    System.out.println("input number of lines");
    int line = sc.nextInt();
     char c='A';
    for(int i=0;i<line;i++){
        for(int j=0;j<=i;j++){
            System.out.print(c);
            c++;
    }
    System.out.print("\n");
   } 
}
}
