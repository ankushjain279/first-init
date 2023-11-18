public class largestinarray {
  public static void main(String args[])
  {
    int array[]={112,431,1423,235,2324,323};
    int largest = Integer.MIN_VALUE;
    int Smallest = Integer.MAX_VALUE;
    for(int i=0; i<array.length; i++)
    {
        if(largest<array[i])
        largest = array[i];
        if(Smallest>array[i])
        Smallest = array[i];
    }
    System.out.println(largest);
    System.out.println(Smallest);
  }    
}
