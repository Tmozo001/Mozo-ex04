/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Mozo
 */
/*
Psuedo
ask user for a noun using print
gather the noun with scanner(system.in)(keyboard) and assign to a string
ask user for a verb using print
gather the verb with scanner(system.in)(keyboard) and assign to a string
ask user for a adjective using print
gather the adjective with scanner(system.in)(keyboard) and assign to a string
ask user for a adverb using print
gather the adverb with scanner(system.in)(keyboard) and assign to a string
using a printf and data specifiers (%s) to print each string in the correct spots with the desired out ouput.

 */
package exercise04;
import java.util.Scanner;

public class solution04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun:");
        String noun = input.nextLine();

        System.out.println("Enter a verb:");
        String verb = input.nextLine();

        System.out.println("Enter an adjective:");
        String adjective = input.nextLine();

        System.out.println("Enter an adverb:");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);

    }
}
