package com.bofa.controlflow;

public class SwitchStatementDemo {

    // Switch give us the ability to check for specific cases

    public static void main(String[] args) {

        String dayOfTheWeek = "    TUeSdaY   ";

        // switch - keyword to signify start of switch statement
        switch (dayOfTheWeek.strip().toLowerCase()) {
            case "monday": {
                System.out.println("Happy Monday!");
                break; // keyword - this tells our code to exit whatever loop/block of code we're in
            }
            case "tuesday": {
                System.out.println("Happy Tuesday!");
                break;
            }
            case "wednesday": {
                System.out.println("Happy Wednesday!");
                break;
            }
            case "thursday": {
                System.out.println("Happy Thursday!");
                break;
            }
            case "friday": {
                System.out.println("Happy Friday!");
                break;
            }
            case "saturday": {
                System.out.println("Happy Saturday!");
                break;
            }
            case "sunday": {
                System.out.println("Happy Sunday!");
                break;
            }
            // best practice to include a default case
            default: {
                System.out.println("this runs when no cases are met");
                System.out.println("That's not a day of the week");
            }
        }




    }
}
