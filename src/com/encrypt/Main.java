package com.encrypt;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print(encrypt("This is a test!", 2));
    }

    public static String encrypt(String text, int n)
    {
        String result = "";
        if (text == "" || text.equals(null))
        {
            return null;
        }
        if (n <= 0)
        {
            return text;
        }
        String temp = "";
        for (int j = 1; j <=n; j++)
        {
            for (int i = 1; i < text.length(); i=i+2)
            {
                result = result + text.charAt(i);
            }
            for (int i = 0; i < text.length(); i= i+2)
            {
                result = result + text.charAt(i);
            }
            text = result;
        }
        return result;
    }
    /*
    public static String decrypt(final String encryptedText, final int n)
    {

    }
    */
}
