package com.bridgelab.javaregex;
import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex {
    Scanner sc = new Scanner(System.in);
    public void firstNameCheck() {
        System.out.print("Enter First Name of User: ");
        String fName = sc.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
        if (check)
            System.out.println("Valid First Name");
        else
            System.out.println("Please Enter a Valid First name with only \"One Starting Capital\" letter");
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        JavaRegex user = new JavaRegex();

        System.out.println("Welcome to User Registration Program");

        user.firstNameCheck();
    }
}


