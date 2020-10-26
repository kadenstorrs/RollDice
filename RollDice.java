//Kaden Storrs
//CS 1400
//Oct 24 2020


import java.util.Scanner;
import java.util.Random;

public class RollDice {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char reply;
        do {
        System.out.println("How many dice would you like to roll? [1-3]");
        int diceAmount = sc.nextInt();
        displayMenu(diceAmount);
            System.out.println("Would you like to roll again??? \n [Y] or [N]");
            reply = sc.next().charAt(0); 
        } while(reply == 'Y' || reply == 'y');
    }

    static public void displayMenu(int amountOfDice) {
            int dice1 = getrandomNumber();
            int dice2 = getrandomNumber();
            int dice3 = getrandomNumber();
            if (dice1 == 0 || dice2 == 0 || dice3 == 0) {
                dice1 = 2;
                dice2 = 4;
                dice3 = 5;
            }
            switch(amountOfDice) {
                case 1: 
                rollDice(dice1);
                break;
                case 2: 
                rollDice(dice1);
                rollDice(dice2);
                break;
                case 3: 
                rollDice(dice1);
                rollDice(dice2);
                rollDice(dice3);
                break;
                default:
                System.out.println("Please enter a number between 1 - 3");
                break;
             }
    }

    static public void rollDice(int amountOfDice) {
        switch(amountOfDice) {
            case 1: 
            one();
            break;
             case 2: 
             two();
            break;
             case 3: 
             three();
            break;
             case 4: 
             four();
            break;
             case 5: 
             five();
            break;
        }
    }

    public static void one() {
        System.out.println("-----\n|   |\n| o |\n|   | \n-----");
    }
    public static void two() {
        System.out.println("-----\n|o  |\n|   |\n|  o|\n-----");

    }
    public static void three() {
        System.out.println("-----\n|o  |\n| o |\n|  o|\n-----");

    }
    public static void four() {
        System.out.println("-----\n|o o|\n|   |\n|o o|\n-----");
    }
    public static void five() {
        System.out.println("-----\n|o o|\n| o |\n|o o|\n-----");

    }
    public static void six() {
         System.out.println("-----\n|o o|\n|o o|\n|o o|\n-----");
    }

    public static int getrandomNumber() {
        Random random = new Random();
        int lastNum = 6;
        int randomInt = random.nextInt(lastNum);
        return randomInt;
    }
} 