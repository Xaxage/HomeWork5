public class Problem4
{
    public static void main(String[] args)
    {
        int[] a=new int[]{1,2,5,9};
        int[] b=new int[4];
        int j=0;
        for(int i=0 ;i<a.length;i++ , j++)
        {
            b[j]=a[i];
            System.out.println(b[j]);
        }
    }
}
