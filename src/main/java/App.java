/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    public static void main (String[]args) {
        Scanner input1 = new Scanner (System.in);
        System.out.println("Enter a noun:");
        String noun = input1.nextLine();

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter a verb:");
        String verb = input2.nextLine();

        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter a adjective:");
        String adjective = input3.nextLine();

        Scanner input4 = new Scanner (System.in);
        System.out.println("Enter a adverb:");
        String adverb = input4.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
