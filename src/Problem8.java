public class Problem8
{
    public static void main(String[] args)
    {
        int [] array=new int[]{1,2,3,4,5,2,3,7,4};
        int n=array.length;
        int j=n-1;
        int k=0;
        for (int i=0;i<n/2;i++)
        {
            if(i!=j)
                k=array[i];
            array[i]=array[j];
            array[j]=k;
            j--;
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }

    }
}