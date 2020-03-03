import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner pig = new Scanner(System.in);
        System.out.println("Enter the quantity of array's elements");
        int a=pig.nextInt();
        System.out.println("The size of array is :" + a);
        int[] array = new int[a];
        for(int i=0;i<array.length;i++)
        {
            int b= pig.nextInt();
            System.out.println("Input element " + i + " : " + b);
        }
    }
}
