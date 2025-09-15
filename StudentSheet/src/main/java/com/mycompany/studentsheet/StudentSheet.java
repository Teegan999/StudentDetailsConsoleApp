package com.mycompany.studentsheet;

import java.util.Scanner;

public class StudentSheet {

    public static void main(String[] args) {

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Create variables
        String fullName = "";
        String email;
        String studentNumber;
        int year;
        boolean isStudent;

        // Welcome the user to this console application
        System.out.println("-------------------- WELCOME TO OUR STUDENT SHEET APP --------------------");

        System.out.println();

        // Ask the user for input and use PRINT not PRINTLN
        System.out.print("Enter your name: " + fullName);
        fullName = scanner.nextLine();

        System.out.println();

        System.out.print("Enter your email: (Must use an @ sign) :  ");
        email = scanner.nextLine();

        System.out.println();  // I have used these statements throughout the project for better spacing

        System.out.print("Enter your student number (must be 10 characters) :  ");
        studentNumber = scanner.nextLine();

        System.out.println();

        System.out.print("Enter your year (1, 2 or 3):  ");   // Specific years are to be given, depending on the user
        year = scanner.nextInt();

        System.out.println();

        System.out.print("Are you a student ? (true/false) ");   // determines if you are a student or not
        isStudent = scanner.nextBoolean();

        System.out.println();
        System.out.println();
        System.out.println("======== STUDENT DETAILS========");
        System.out.println();

        // Display the details of the student details if the below requirements are met
        if (email.contains("@") && studentNumber.length() == 10 && (year == 1 || year == 2 || year == 3)) {

            System.out.println("Greetings, " + fullName + " ! ");
            System.out.println("Your email used for this school is : " + email);
            System.out.println("Your student number is: " + studentNumber);
            System.out.println("You are in year " + year);
            System.out.println("You are a " + isStudent + " student  at our school !");

        } else {   // If none of the requirements are met, this error message pops up prompting user to restart application

            System.out.println("! ! ! ! ! ----- YOU HAVE ENTERED INVALID DETAILS, PLEASE RESTART THE APPLICATION AND READ THE INSTRUCTIONS GIVEN ! ----- ! ! ! ! !");
        }
    }
}

