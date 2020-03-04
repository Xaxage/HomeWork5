import java.util.Arrays;

public class HomeworkQuestions1
{
    public static void main(String[] args)
    {
        char[] chars=new char[]{'a','b','c','d','e'};
        for(int i=0;i<chars.length/2;i++)
        {
            char temp=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp;
        }
        /*System.out.println(Arrays.toString(char));*/
    }
}
