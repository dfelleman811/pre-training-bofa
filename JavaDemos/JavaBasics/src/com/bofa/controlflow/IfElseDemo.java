package com.bofa.controlflow;

public class IfElseDemo {

    /*
    Control Flow?
    - relates to the way we can manage our code's execution
    - we as developers can use logic to determine the way our code executes

    - in Java - we have a few techniques for working with control flow
    Conditional Statements (if, else if, else)
    Loops (for, while, do-while)
    Switch Statements (matching some pre-determined value)

     */

    public static void main(String[] args) {
        // declare a variable
        int score = 105;

        String result;

        if (score == 80) {
            result = "You passed!";
        } else if (score > 80) {
            result = "You did great!";
        } else if (score > 100) {
            result = "How did you score more points than available?";
        } else {
            result = "You did not pass. Try again!";
        }

        System.out.println(result);

        // ternary operator - (some condition) ? <value if true> : <value if false>
        String ternaryResult = (score == 80) ? "You passed!" : "You did not get 80";



    }

}
