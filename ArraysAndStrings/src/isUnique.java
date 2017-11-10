import java.util.ArrayList;

/*
    Implement an algorithm to determine if a string has all unique characters.
    For example: "hello" : Fasle
                 "abcdef" : True
 */
public class isUnique
{
    public static boolean checkUnique(String str)
    {
        ArrayList arr = new ArrayList();
        for(int i=0;i<str.length();i++)
        {
            if(arr.contains(str.charAt(i)))
                return false;
            else
            {
                arr.add(str.charAt(i));
            }
        }
        return true;

    }
    public static void main(String args[])
    {
        System.out.println(checkUnique("ylo"));
    }
}
