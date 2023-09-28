package com.bofa;

// DRY - Don't Repeat Yourself - we want our code to be modular, reusable, and easily read/maintained/scaled

import com.bofa.entities.Role;
import com.bofa.entities.User;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The Library App allows users to borrow books.
 * Two types of users: member, librarian
 * Both users can register and login to the app
 * Basic users can:
 *  - look for books
 *  - borrow books
 *  - return books
 *
 * Librarians can:
 * - add new books to the library
 *
 * Entities:
 *  - User
 *      - username (String)
 *      - pass (String)
 *      - type of user (member / librarian) (String - we'll use Enum)
 *  - Book
 *      - ID (unique identifier - ISBN)
 *      - title
 *      - Author (String - we'll eventually make this its own entity)
 *      - publication date
 *      - genre
 *      - available or not / number of copies
 */
public class LibraryApp {

    public static User[] users = new User[5];
    // Let's take a look at how we can get input from a user in Java
    // in JS? -> prompt() and there's a UI (User Interface)
    // with our apps - there is no ui - just the console.

    public static void main(String[] args) {
        // Initializing our Scanner
        Scanner scanner = new Scanner(System.in);

        int userChoice = 0;

        while (userChoice != 4) {

            // printing options for the user to choose from in the console
            System.out.println("Welcome to the Library! Please choose an option.");
            System.out.println("1. Create an account");
            System.out.println("2. Login to your account");
            System.out.println("3. Search Books");
            System.out.println("4. Quit");

            // wait and scan for the user input
            userChoice = scanner.nextInt();
            // because nextInt() leaves a new-line-character in the InputStream...
            //  we need to call nextLine() to clear the input stream and start fresh
            scanner.nextLine();

            // switch over the user's input
            switch (userChoice) {
                case 1: { // Creating an account
                    // Gather username and password from user
                    System.out.println("Great! Choose a username:");
                    String username = scanner.nextLine();
                    System.out.println("Got it, " + username + ". Please make a pass:");
                    String password = scanner.nextLine();

                    // Creating a new user object to store their information
                    User newUser = new User(username, password, Role.MEMBER);
                    System.out.println(newUser);
                    System.out.println("Welcome " + newUser.username);

                    // Storing the user in our users array
                    users[0] = newUser;

                    // welcome message
                    if (newUser.role == Role.MEMBER) {
                        System.out.println("Welcome to the library, member!");
                    } else if (newUser.role == Role.LIBRARIAN) {
                        System.out.println("Hi Librarian - we've got some work for you.");
                    }
                    break;
                }

                case 2: { // Login
                    stillWorking();
                    break;
                }

                case 3: { // Search Books
                    stillWorking();
                    break;
                }
                case 4: { // QUIT
                    System.out.println("Thanks for coming in. See you next time!");
                    break;
                }

                default: {
                    System.out.println("That wasn't an option. Bye.");
                }
            }
        }
    }
    // There's a built-in class called Scanner that we use to get input from the user

    // our Input Stream is going to be our console
    // we have already used an Output Stream to print to the console

    // code that repeats - we can turn into a method to be used whenever we need
    public static void stillWorking() {
        System.out.println("We're still working on that feature. Come back later");
    }

}
