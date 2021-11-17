package com.bridgelab.javaregex;
import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex {
    public void email() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email of User: ");
        String eMail = sc.next();
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
        if (check)
            System.out.println("Valid Email");
        else
            System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" letter");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaRegex user = new JavaRegex();

        System.out.println("Welcome to User Registration Program");

        user.email();
    }
}



