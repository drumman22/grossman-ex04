/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
create List of string for words
get input for the noun, verb, adjective and adverb
print the small story
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        // get input
        System.out.println("Enter a noun: ");
        words.add(input.nextLine());
        System.out.println("Enter a verb: ");
        words.add(input.nextLine());
        System.out.println("Enter an adjective: ");
        words.add(input.nextLine());
        System.out.println("Enter an adverb: ");
        words.add(input.nextLine());

        // output story
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", words.get(1), words.get(2), words.get(0), words.get(3));
    }
}
