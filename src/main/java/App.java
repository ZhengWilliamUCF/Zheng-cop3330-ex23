/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    int choice;

    public static void main(String[] args) {
        App myApp = new App();
        myApp.userInput();
        myApp.switchStatement();
    }

    public void userInput() {
        System.out.print("Is the car silent when you turn the key? ");
        String answer = in.nextLine().toLowerCase();
        if (answer.equals("y")){
            BatteryTerminals();
        }
        else if (answer.equals("n")){
            SlickingNoise();
        }
    }

    public void BatteryTerminals() {
        System.out.print("Are the battery terminals corroded? ");
        String answer = in.nextLine().toLowerCase();
        if (answer.equals("y")){
            choice = 1;
        }
        else if (answer.equals("n")){
            choice = 2;
        }
    }

    public void SlickingNoise() {
        System.out.print("Does the car make a slicking noise? ");
        String answer = in.nextLine().toLowerCase();
        if (answer.equals("y")){
            choice = 3;
        }
        else if (answer.equals("n")){
            CrankUp();
        }
    }

    public void CrankUp() {
        System.out.print("Does the car crank up but fail to start? ");
        String answer = in.nextLine().toLowerCase();
        if (answer.equals("y")){
            choice = 4;
        }
        else if (answer.equals("n")){
            EngineDeath();
        }
    }

    public void EngineDeath() {
        System.out.print("Does the engine start and then die? ");
        String answer = in.nextLine().toLowerCase();
        if (answer.equals("y")){
            FuelInjection();
        }
        else if (answer.equals("n")){
            choice = 7;
        }
    }

    public void FuelInjection() {
        System.out.print("Does your car have a fuel injection? ");
        String answer = in.nextLine().toLowerCase();
        if (answer.equals("y")){
            choice = 5;
        }
        else if (answer.equals("n")){
            choice = 6;
        }
    }

    public void switchStatement(){
        String outputText;

        outputText = switch (choice) {
            case 1 -> "Clean terminals and try starting again.";
            case 2 -> "The battery cables may be damaged.\nReplace cables and try again.";
            case 3 -> "Replace the battery.";
            case 4 -> "Check spark plug connections.";
            case 5 -> "Get it in for service.";
            case 6 -> "Check to ensure the choke is opening and closing.";
            default -> "This should not be possible.";
        };
        System.out.println(outputText);
    }
}
