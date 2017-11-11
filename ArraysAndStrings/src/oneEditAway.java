/*
There are three types of edits that can be performed on strings: insert a character,
remove a character and replace a character. Given two strings, write a function to check if they are within one edit of each other.
 */

import java.util.*;

public class oneEditAway
{
    private static boolean oneEdit(String str1,String str2)
    {
        //Replace
        int replaceCounter=0;
        if(str1.length()==str2.length())
        {
            for(int i=0;i< str1.length();i++)
            {
                if(str1.charAt(i)!= str2.charAt(i))
                    replaceCounter++;
            }
            if(replaceCounter>1)
                return false;
        }
        if(str1.length()+1 == str2.length() || str1.length()-1 == str2.length())
        {
            int index1=0;
            int index2=0;
            int insertCounter=0;
            while(index1<str1.length() && index2<str2.length())
            {
                if(str1.charAt(index1)!= str2.charAt(index2))
                {
                    index1++;
                    insertCounter++;
                    continue;
                }
                index1++;
                index2++;
            }
            if(insertCounter>1)
                return false;
        }

        return true;


    }
    public static void main(String args[])
    {
        System.out.print(oneEdit("pale","bae"));
    }
}
