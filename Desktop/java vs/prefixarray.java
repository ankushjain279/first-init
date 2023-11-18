//optimized method of maxsubarray
public class prefixarray {
    public static void main(String args[]){
      int a[]={1,-2,6,-1,3};
      int sum=0;
      int curr_sum=0,max_sum=0;
      int prefixarray[]=new int[a.length];
      for(int i=0;i<a.length;i++)
      {
          sum+=a[i];
          prefixarray[i]=a[i];
      }
      for(int i=0;i<a.length;i++)
      {
        for(int j=i;j<a.length;j++){
            curr_sum=(i==0)? prefixarray[j]:prefixarray[j]-prefixarray[i-1];
         if(max_sum<curr_sum)
            max_sum=curr_sum; 
        }
      }
      System.out.println(max_sum);
    }
}
