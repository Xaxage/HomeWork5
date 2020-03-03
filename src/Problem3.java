import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner shor=new Scanner(System.in);
        String a=shor.nextLine();
        String[] array = new String[] {"Pig","Goat","Chicken","Cow","Dog"};
        for(int i=0;i<array.length;i++)
        {
            if(a.equals(array[i])) //Intelij arajarkec +_+
            {
                break;
            }
            else if (!array[(array.length - 1)].equals(a) && i==(array.length-1))
            {
                System.out.println("It is NOT there");
            }

        }
    }
}
