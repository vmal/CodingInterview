public class stringCompression
{
    private static String compress(String str)
    {
        char initial = str.charAt(0);
        int counter =1;
        StringBuilder newString = new StringBuilder();
        for(int i=1;i<str.length();i++)
        {
            if(initial == str.charAt(i))
            {
                counter++;
            }
            else
            {
                newString.append(initial);
                newString.append(counter);
                initial = str.charAt(i);
                counter=1;
            }
        }
        newString.append(initial);
        newString.append(counter);
        return newString.toString();

    }
    public static void main(String args[])
    {
        System.out.print(compress("aaabbbbbbcccccaaaa"));
    }
}
