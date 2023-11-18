public class butterflypatt {
 public static void main(String args[])
 {
    int k=0;
    for(int i=1;i<=8;i++){
       if(i<=4)
        k=i;
        if(i>5)
        k--;
        for(int j=1;j<=8;j++){
            if(j<=k || j>=8-k+1  )
            {
                System.out.print("*");
            }
            else
             System.out.print(" ");
        }
           System.out.println();
    }
 }   
}
