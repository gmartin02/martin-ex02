/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * Import the Scanner library
 * 'input' = new Scanner
 * prompt the user to input any string
 * 'userInput' = the string from user
 * use the length() method to get length of 'userInput'
 * 'length' = userInput.length()
 * print 'userInput' and 'length' using concatenation
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args){
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        int length = userInput.length();        //variable.length() gets the length of a string as an integer
        System.out.println(userInput + " has " + length + " characters.");
    }
}
