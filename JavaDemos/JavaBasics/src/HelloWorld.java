public class HelloWorld {
    
    // This is a single-line comment
    
    /*
    This is how we do 
    multiple line comments
     */

    /*
    static - this is what we call a Non-Access Modifier
            it is modifying the main method (in this example  - it can be used elsewhere)

            static specifies "Class Scope" - a.k.a Static Scope
                (Scope - where a variable is visible)

            In JavaScript: (N.B. Scopes do NOT work in the same way in Java)
            let / const- block scope
            var - function scope
            ___ - global
     */

    // This is THE main method - it is the entry point (and exit point) or our program
    // A class that has a main method is called an Executable Class
    // access modifier + non-access modifier + return type + method name + (parameters)
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


}
