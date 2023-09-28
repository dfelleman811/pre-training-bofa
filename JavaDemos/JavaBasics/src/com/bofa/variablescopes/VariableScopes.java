package com.bofa.variablescopes;
/* JS -> variable scopes are different from Java
        let, const -> block scope
        var -> function scope
        ___ -> global

    When a variable is declared in Java it is attached to a specific SCOPE within the program.
    The scope is determined by where in your code the variable resides.

    In Java, the different scopes:

    - Class (a.k.a. Static) scope
    - Instance (a.k.a. Object) scope
    - Method scope
    - Block scope

     */

public class VariableScopes {

    /*
    Class scoped variables reside within the class itself.
    This means that when objects update a class-scoped variable, that change is
            reflected across ALL instances of the class.
    Class scope is declared with the 'static' keyword
    Methods can have class scope as well (public static void main(String[] args) {})
     */
    static String classScope = "Initial value";

    /*
    Instance Scope means the variable is attached to individual objects created from the class
    In contrast to Class Scope, when an instance-scoped variable is modified, it has not effect
            on the other instances of the class (the other objects).
     */
    String instanceScope;

    // static methods are class-scoped
    // for methods, just like with variables, we do NOT need an instance of the class to call/invoke it
    static void classScopedMethod() {
        System.out.println("Hi there! I'm a static or class-scoped method!");
    }

    // Instance scoped methods - required an object to invoke
    void instanceScopeMethod() {
        System.out.println("I'm instance scoped - I need an object. ");
    }

    // Method scope - is restricted to a method and its body
    static void methodScopeExampleMethod(String methodScopedParameter) { // param is also method scope
        String anotherMethodScope = "Method Scope";
    }


    public static void main(String[] args) {
        // Reference class-scoped variables by the class name
        System.out.println(VariableScopes.classScope);
        // same with class-scoped methods
        VariableScopes.classScopedMethod();// just like Arrays.toString(some array)

        // instance-scoped methods need an instance of the class to be invoked
        VariableScopes anInstance = new VariableScopes();
        anInstance.instanceScopeMethod();


        // To reference instance-scoped variables - we need an instance of the class
        //VariableScopes.instanceScope; // this line doesn't work
        VariableScopes instance1 = new VariableScopes();
        instance1.instanceScope = "instance 1";

        VariableScopes instance2 = new VariableScopes();
        instance2.instanceScope = "instance 2";

        System.out.println("instance1's value of instanceScope: " + instance1.instanceScope);
        System.out.println("instance2's value of instanceScope: " + instance2.instanceScope);

        // this is for demo only - reference class scopes with ClassName
        instance1.classScope = "New value"; // this SHOULD be VariableScopes.classScope
        System.out.println("instance1's value of classScope: " + instance1.classScope);
        System.out.println("instance2's value of classScope: " + instance2.classScope);

        /*
        Block-scoped variables only exist within the specific control-flow block where they're declared
        for loops, if/else, while, do-while, switch statements, case: {}

        After that block ends - the variables declared within it are no longer available
         */

        if (true) {
            String str = "It's true!"; // this string has a block scope
            System.out.println(str);
        }
        // str is not accessible outside of its block scope
//        str = "Hello again";
//        System.out.println(str);

        if (true) {
            int myInt = 5;
            if (true) {
                myInt = 6;
                int anotherInt = 7;
            }
            //anotherInt = 10; // no access outside of block scope
        }





    }

}
