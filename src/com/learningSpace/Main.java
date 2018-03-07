package com.learningSpace;

import static com.learningSpace.Main.ReverseWords.reverseWords;

public class Main {

    public static void main(String[] args)
    {
       System.out.print(reverseWords("I like eating"));
    }
    public static class ReverseWords
    {
        public static String reverseWords(String str)
        {
            String[] words = str.split(" ");
            String result = "";
            for (int i = words.length-1; i >= 0; i--)
            {
                if (i == 0)
                {
                    result += words[i];
                }
                else
                {
                    result += words[i] + "   ";
                }
            }
            return result;
        }
    }
}
