 import java.util.*;
public class invertedstarpattern {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number of lines");
    int line = sc.nextInt();
    for(int i=line;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
    }
    System.out.print("\n");
   } 
}
}

