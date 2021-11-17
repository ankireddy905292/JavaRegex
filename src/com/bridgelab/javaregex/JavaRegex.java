package com.bridgelab.javaregex;
import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex {
    public void lastNameCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Name of User: " );
        String  lName = sc.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
        if (check)
            System.out.println("Valid Last Name");
        else
            System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" letter");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaRegex user = new JavaRegex();

        System.out.println("Welcome to User Registration Program");


        user.lastNameCheck();
    }
}



