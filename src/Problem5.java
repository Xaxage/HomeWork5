public class Problem5
{
    public static void main(String[] args)
    {
        char[] a =new char[]{'a','b','c','d','a','b','a','a'};
        char check='a';
        int counter =0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a')
            {
                counter=counter+1;
            }
        }
        System.out.println(counter);
    }
}
