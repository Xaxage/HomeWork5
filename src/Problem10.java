public class Problem10
{
    public static void main(String[] args)
    {
        int[] array = new int[]{1,1,2,2,2,3,4,4,5,1};
        int k=3;
        int counter=0;
         for(int i=0;i<array.length;i++)
        {
             for(int j=0;j<array.length;j++)
             {
                 if(array[i]==array[j])
                 {
                    counter=counter+1;

                 }
              }
             if(k==counter)
             {
                 System.out.println(array[i]);
                 array[i]=0;
             }
             counter=0;
        }
    }
}