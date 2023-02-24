package com.knoldus;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = scan.nextLine();
        System.out.println("String before reverse : "+string);
        StringManipulation stringManipulate = new StringManipulation();
        String revString =  stringManipulate.reverseString(string);
        int stringLength =  stringManipulate.getStringLength(string);
        System.out.println("String before reverse : "+revString);
        System.out.println("Length of the string : "+stringLength);

    }
}
