package com.bofa;


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
 *      - password (String)
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library! Please choose an option.");
        System.out.println("1. Create an account");
        System.out.println("2. Search Books");
        System.out.println("3. Quit");

        int userChoice = scanner.nextInt();
        // because nextInt() leaves a new-line-character in the InputStream...
        //  we need to call nextLine() to clear the input stream and start fresh
        scanner.nextLine();

        switch (userChoice) {
            case 1: {
                System.out.println("Great! Choose a username:");
                String username = scanner.nextLine();
                System.out.println("Got it, " + username + ". Please make a password:");
                String password = scanner.nextLine();
                User newUser = new User(username, password, "member");
                System.out.println(newUser);
                System.out.println("Welcome " + newUser.username);
                users[0] = newUser;
                System.out.println(Arrays.toString(users));
                break;
            }

            case 2: {
                System.out.println("We're still working on that feature. Come back later");
                break;
            }

            case 3: {
                System.out.println("Thanks for coming in. See you next time!");
                break;
            }

            default: {
                System.out.println("That wasn't an option. Bye.");
            }
        }
    }
    // There's a built-in class called Scanner that we use to get input from the user

    // our Input Stream is going to be our console
    // we have already used an Output Stream to print to the console



}
