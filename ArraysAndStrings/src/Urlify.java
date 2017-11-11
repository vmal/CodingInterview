/*
Write a method to replace all spaces in a string with %20.
You may assume that the string has sufficient space at the end of the string to hold the additional characters,
and that you are given the true length of the string. USE character array to perform this operation in place.
Input : "Mr John Smith", 13
Output : Mr%20John%20Smith

 */
public class Urlify
{
    public static String replace(String str,int len)
    {
        StringBuilder newString = new StringBuilder();
        char space = ' ';
        for(int i=0;i<len;i++)
        {
            if(space == str.charAt(i))
            {
                newString.append("%20");
            }
            else
            {
                newString.append(str.charAt(i));
            }

        }
        return newString.toString();
    }
    public static void main(String args[])
    {
        System.out.print(replace("Mr John Smith", 13));
    }
}
