import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner best = new Scanner(System.in);
        int n=best.nextInt();
        int[] array = new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]=i;
            System.out.println(array[i]);
        }
    }
}
