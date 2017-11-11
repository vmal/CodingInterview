/*
Check if the first String is the perumatation of another String
For example: "hello" and "ellho" is true
             "hello" and "eilho" is false
 */
import java.util.ArrayList;
import java.util.Collections;

public class checkPermutation
{
    public static boolean isPermutation(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        for(int i=0;i<str1.length();i++)
        {
            arr1.add(str1.charAt(i));
            arr2.add(str2.charAt(i));

        }
        Collections.sort(arr1);
        Collections.sort(arr2);

        return arr1.equals(arr2);

    }
    public static void main(String args[])
    {
        System.out.print(isPermutation("hello","eilho"));
    }
}
