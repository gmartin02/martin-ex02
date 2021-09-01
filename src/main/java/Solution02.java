/*
 * UCF COP3330 Fall 2021 Exercise 1 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * Import the Scanner library
 * new Scanner = 'input'
 * prompt the user to input any string
 * 'userInput' = the string the user inputs
 * use the length() method to get length of 'userInput'
 * 'length' = length of 'userInput'
 * print the 'userInput' and 'length' using concatenation in the print statement
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
