public class Problem6
{
    public static void main(String[] args)
    {
        int[] array=new int[]{13,0,8,3,4,5,1,11,10,14};
        int min = array[0];
        int max=array[array.length-1];
        for(int i=1;i<array.length;i++)
        {
            if (min>=array[i])
            {
                min=array[i];
            }
        }
        System.out.println(min);
        for(int i=0;i<array.length;i++)
        {
            if (max<=array[i])
            {
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
