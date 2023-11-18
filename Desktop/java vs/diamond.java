public class diamond {
    public static void main(String args[])
    { 
      int k=0;
      for(int i=1;i<=8;i++)
      {
        if(i<=4)
        k=i;
        if(i>5)
        k--;
        for(int j=1;j<=7;j++)
        {
            if(j>=5-k && j<=3+k)
            System.out.print("*");
            else
            System.out.print(" ");
        }
         System.out.println();
      }
    }
}
