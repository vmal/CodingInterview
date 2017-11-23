public class stringRotation
{
    private static boolean isSubString(String s1,String s2)
    {
        if(s1.contains(s2))
            return true;
        else
            return false;
    }
    private static boolean stringRot(String s1,String s2)
    {
        if(s1.length()==s2.length() && s1.length()>0)
            return isSubString(s1+s1, s2);
        return false;
    }
    public static void main(String args[])
    {
        System.out.print(stringRot("waterbottle","erbottlewat"));
    }
}
