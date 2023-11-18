public class arraypassing {
    public static void arraypass(int array[])
    {
        for(int i=0;i<array.length;i++){
           array[i]=array[i]+1;
        }
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        arraypass(array);
        for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
        }
    }
}
