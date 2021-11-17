package com.bridgelab.javaregex;
import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex{
    // rule1  minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char
    public void passWordRule4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password :  ");
        String passWord = sc.nextLine();
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", passWord);
        if (check)
            System.out.println("Valid Special Character");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaRegex user = new JavaRegex();

        System.out.println("Welcome to User Registration Program");

        user.passWordRule4();
    }
}
