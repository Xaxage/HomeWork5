public class Nightmare
{
    public static void main(String[] args)
    {
        int[] array = new int [] {-8, 2, 99999, 1, 55 };
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-1;j++)
            {
                if (array[i] >= 0 && array[j] >=0 && array[i + 1] - array[j] > 1)
                {
                    System.out.println(array[i] + 1);
                }
            }
        }
    }
}
