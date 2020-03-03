import java.util.jar.JarOutputStream;

public class Problem9
{
    public static void main(String[] args)
    {
        int[] array1= new int []{1,2,3,4,6,7,8,10,11};
        int[] array2=new int[] {3,4,5,6,8,9};
        boolean check=true;
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j])
                {
                    check=false;
                    break;
                }
                else {check=true;}// esi kodis mej mi ban poxec bayc inqsel chjoga inch . aranc sra chi ashxatum
                // Метод "Тыка" работает!!!!
            }
            if(check)
            {
                System.out.println(array1[i]);
            }
        }
    }
}
