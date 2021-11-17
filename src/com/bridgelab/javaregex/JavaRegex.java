package com.bridgelab.javaregex;
import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex{

    // rule1  minimum 8 characters

    public void passWordRule1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password :  ");
        String passWord = sc.nextLine();
        boolean check = Pattern.matches("[a-zA-Z]{8,}", passWord);
        if (check)
            System.out.println("Valid PassWord");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaRegex user = new JavaRegex();

        System.out.println("Welcome to User Registration Program");

        user.passWordRule1();
    }
}