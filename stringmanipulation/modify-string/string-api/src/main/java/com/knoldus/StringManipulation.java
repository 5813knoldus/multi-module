package com.knoldus;

/**
 * Hello world!
 *
 */
public class StringManipulation
{
    public  int  getStringLength(String string){
        int stringLength = 0;
        for(int index = 0; index < string.length(); index++)
            stringLength ++;
        return stringLength;
    }

    /* Function is for reversing  the given String */
    public String reverseString(String string){
        //creating an empty string
        String tempString ="";
        for(int index = string.length() - 1; index >= 0; index--){
            tempString = tempString+string.charAt(index);
        }
        return tempString;
    }
}
