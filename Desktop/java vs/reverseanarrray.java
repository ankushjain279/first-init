public class reverseanarrray {
    public static void main(String args[])
    {
      int array[] ={1,2,3,4,5,6};
      int end = array.length-1;
      for(int i=0; i<array.length/2; i++)
      {
          int temp; 
          temp=array[i];
          array[i]=array[end];
          array[end]=temp;
          end--;

      }
      for(int i=0; i<array.length; i++)
      System.out.println(array[i]);
    }
}
