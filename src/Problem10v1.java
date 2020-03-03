import static java.util.Arrays.sort;
public class Problem10v1
{
    public static void main(String[] args)
    {
        int [] array=new int[]{0,0,0,0,1,2,3,2,2,3,7,8,9,3};
        int n=array.length;
        int k=3;
        int counter=0;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n-1; j++) {
                if (array[j] >= array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(array[i]==array[j])
                    counter++;
            }
            if(counter==k)
            {
                System.out.println(array[i]);
                i+=k;
            }
            counter=0;
        }

    }
}
