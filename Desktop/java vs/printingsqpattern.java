import java.util.Scanner;

public class printingsqpattern {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int side =s.nextInt();
        for(int i=0;i<side;i++)
        {
            for(int j=0;j<side;j++)
            {
                System.out.println("$");
            }
        } 
    }
    
}
