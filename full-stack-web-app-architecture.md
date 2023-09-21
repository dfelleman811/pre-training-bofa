# Web Application Architecture 
Full stack = front end (client), back end (server), database

## Database
The database is where all of your data is stored. 

The data? Data depends on the application and what the user is trying to do.
> input from users  
> info we want to give to our users (depends on request)  
> login info (credentials like a username and password)  
> personal info about our users

The data is everything we want to keep even after the user stops using the application (and comes back)
- usernames/password(encrypted)
- addresses
- inventory (shop items, posts, comments....)
- color / size options (user preferences)
- statuses 

These might be things the user wants to look at or things that are necessary to make sure that the user sees what they're supposed to see. 


## Back end (Server-side) 
This is where the "business logic" of an application occurs. 
Business logic can be any number of things, and can be thought of as business rules.
- A user must authenticate themselves before accessing the system 
- A user's username must be unique
- How we get data from the user
- Calculations that our app needs to do 
- changing the status of some order from shipping to delivered

One of the main roles of the backend is to communicate (act as a bridge) between the front end and the database. It handles EVERYTHING in between. 


## Front End (Client)
The front end is where the user interacts with our application. 
Its main job is to show the user the correct things and respond with what the user wants. 
This could include things like: 
- showing the inventory of some e-commerce shop
- allow the user to login 
- allowing the user to search for something 
- etc. 

In order for the front end to provide these functionalities to the user, the front end needs to make requests to the back end.
The user lets the front end know what they want, the front end tells the backend, the back end has a flow and will then tell the user what they want - or tell the user why they can't have what they want. 

## Example
CatApp: A web application used for adopting cats.

Functionalities:
1. A user can register an account.
2. A user can log in.
3. A user can view the available cats.
4. A user can adopt a cat.
5. A user can view the cats that they've adopted.

Entities:
- Cat*
- User*
- Status (a cat can be available, adopted, etc.)
- Breed (cat breeds)
- Role (a user can be a regular user, an employee, a foster, an admin, etc.)
- Special Need (special needs that a cat could have like blindness, FIP, etc.)

*These are the ones that are absolutely necessary - the others are helpful, but not necessary (we'll talk about it later).

Flow of the application:
1. Functionality/Story 1:
    1. A user will enter their information on the front end and click a "register" button.
    2. The front end will send the information and tell the back end "hey, add this user to the database, please."
    3. The back end will get the information and add it to the database.
    4. The database now has the user's information and the back end will tell the front end "hey, let the user know that they registered successfully, please."
2. Functionality/Story 2:
    1. A user will enter their username and password and click a "log in" button.
    2. The front end will send the information and tell the back end "hey, this user would like to try to log in."
    3. The back end will check if that information is in the database.
    4. If it is, it will send the rest of the user's information and tell the front end "hey, this user is good to go, they can be logged in now."
    5. If it isn't, it will tell the front end "hey, that user doesn't exist, please let them know that information is wrong."
3. Functionality/Story 3:
    1. A user will go to a page to see the available cats.
    2. The front end will tell the back end, "hey, please give me all of the available cats that are in the database right now."
    3. The back end will grab the cats from the database and make sure that it only sends back the available ones.
    4. The front end will take the cats that it got and show them to the user in a nice format.
4. Functionality/Story 4:
    1. A user will see a cat that they like and click an "adopt" button for that cat.
    2. The front end will tell the back end, "hey, this user wants to adopt this particular cat."
    3. The back end will make sure that that cat is available to be adopted.
    4. The back end will then tell the database to update that cat's status to adopted.
    5. The database is updated and the back end will tell the front end, "hey, that cat is adopted by that user now."
5. Functionality/Story 5:
    1. A user will go to a page to see their cats.
    2. The front end will tell the back end, "hey, please give me the cats that are owned by this user."
    3. The back end will ask the database for any cats that are adopted by the user and return those to the front end.
    4. The front end will show those cats to the user, or give them a special message if they don't have any cats yet.



