public class Problem7
{
    public static void main(String[] args)
    {
        int[] array1=new int[]{1,2,3,4,5};
        int[] array2=new int[array1.length];
        int j=0;
        for(int i=0;i<array1.length;i++,j++)
        {
            array2[j]=array1[array1.length-1-i];
            System.out.println(array2[j]);
        }
    }
}
