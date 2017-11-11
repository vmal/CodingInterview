/*
Given a String, write a function to check if it is a permutation of a palindrome.
ex – Input -> Tact Coa.. Output -> True (taco cat, atco cta etc.)
* LOGIC -> String is palindrome if all letters, except one (at most) are paired.
* If more than one letter unpaired, implies not a palindrome

Input – A string

Output – True or false
 */
import java.util.*;


public class pallindromePermutation
{
    public static boolean checkPermutation(String str)
    {
        str = str.toLowerCase();
        int oddCount=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            char temp = str.charAt(i);
            //System.out.println(temp);
            if(map.containsKey(temp))
            {
                map.put(str.charAt(i),map.get(temp)+1);
            }
            else if(temp !=' ')
                map.put(temp,1);
        }

        Set<Character> keys = map.keySet();
        Iterator<Character> itr = keys.iterator();
        while(itr.hasNext())
        {
            char word  = itr.next();
            int num = map.get(word);
           // System.out.println(word+","+num);

            if(num%2 !=0)
                oddCount++;
        }

        return oddCount <= 1;


    }
    public static void main(String args[])
    {
        System.out.print(checkPermutation("tacto coa"));
    }
}
