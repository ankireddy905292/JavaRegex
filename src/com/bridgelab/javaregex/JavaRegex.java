package com.bridgelab.javaregex;
import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex {
    public void mobileNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile number with country code : ");
        String mobileNum = sc.nextLine();
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mobileNum);
        if (check)
            System.out.println("Valid Mobile Number ");
        else
            System.out.println("Please Enter a Valid Mobile Num ex:- 91 9052824862");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaRegex user = new JavaRegex();

        System.out.println("Welcome to User Registration Program");


        user.mobileNum();
    }
}



