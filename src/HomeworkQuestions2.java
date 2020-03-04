public class HomeworkQuestions2
{
    public static void main(String[] args)
    {
        char[] chars1=new char[]{'a','b','c','d','e','a',};
        int k=2;
        for(int i=0;i<chars1.length;i++)
        {
           int counter=0;
           for(int j=0;j<chars1.length;j++)
           {
               if(chars1[i]==chars1[j])
               {
                   counter++;
               }
           }
           if(counter==k)
           {
               System.out.println(chars1[i]);
           }
        }
    }
}
