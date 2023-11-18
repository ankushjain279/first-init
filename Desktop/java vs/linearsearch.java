public class linearsearch {
    public static int ls(int number[],int key)
    {
      for(int i=0;i<number.length;i++){
        if(number[i]==key)
         return i;
      }
      return -1;
    }
   public static void main(String args[])
   {
     int array[]={2,4,6,8,10,12,14,16,18,20};
     int key= 100;
     int index = ls(array,key); 
     if(index!=-1)
       System.out.print(index);
     else
      System.out.print("not found");
     
   } 
}
