public class maxsubarray{
    public static void main(String args[])
    {
        int a[]={1
            ,-2,6,-1,3};
        int curr_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                curr_sum+=a[k];
                System.out.println(curr_sum);
                if(curr_sum>max_sum)
                max_sum=curr_sum;
                curr_sum=0;
            }
            
        }
        System.out.println("max_sum  "+max_sum);
    }
}
