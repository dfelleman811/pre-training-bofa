package com.bofa.classesandobjects;

public class RobotPlayground {

    public static void main(String[] args) {

        // Let's create a Robot object from our Robot class

        // new - keyword to denote to jvm that we're about to create an object
        // Robot() - Constructor - a special method to create an object

        // Datatype(Robot) ReferenceVariable(rob) = new Constructor()
        Robot rob = new Robot();
        rob.name = "Mr. Robot";
        rob.color = "Green";
        rob.isOn = false;
        rob.size = 5.0;
        //System.out.println(rob); // prints: com.bofa.classesandobjects.Robot@1b28cdfa

        Robot anotherRob = new Robot();
        anotherRob.name = "Harriet";



        System.out.println(rob.name);
        System.out.println(anotherRob.name);


        // 'instance of a class' and 'object' mean the same

        Robot roberta = new Robot("roberta", "blue", false, 8.0);
        System.out.println(roberta.name);
        System.out.println(roberta.color);
        System.out.println(roberta.isOn);
        System.out.println(roberta.size);

        roberta.speak();
        rob.speak();

        String robertasGreeting = roberta.getGreeting();
        System.out.println(robertasGreeting);

        System.out.println(rob.getGreeting());

        System.out.println(rob.name);
        rob.changeName("robbie");
        System.out.println(rob.name);
        System.out.println(rob.isOn);
        rob.powerSwitch();
        System.out.println(rob.isOn);
    }
}
