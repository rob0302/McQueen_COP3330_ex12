/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class simpleInterest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle: ");
        double princi = sc.nextDouble();

        System.out.print("Enter the rate of interest (as a percent): ");
        double interest = sc.nextDouble();
        double interestDeci = interest/100.00;
        System.out.print("Enter the number of years: ");
        int time = sc.nextInt();

        float endInvest = (float)(princi *(1.00 + (interestDeci * time) ));

        System.out.print("After "+time+" years at "+interest+"%, "+" the investment will be worth $"+endInvest);


    }

}
