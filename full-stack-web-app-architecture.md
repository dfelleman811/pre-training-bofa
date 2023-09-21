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





## CatApp Example 
Vet has this app to keep track of the cats and their treatments. 
> User story: As a ________, I can/want/need _____________, so that I _______________________.

Functionalities: 
1. A user can register for an account
2. A user can log in
3. A user can view their upcoming appointments
4. A user can schedule appointments
5. A user can see their Cat's profile (to see medications, test results, etc.)

Entities: some object, some structured thing that we manipulate
- Cat
- User
- Status
- Breed

Flow of the application: 
1. Functionality (a.k.a user story 1)
    1. A user will enter in their information on the front end and click a 'register' button.
        1. You can add more details here as you see fit. Keep it brief for the first pass. 
    2. The front end sends the information to the back end. (It says - "Hey back end, add this user to the database please").
    3. The back end will get that info and make sure the username is not taken, and the password has the necessary length and characters.
    4. If all is good - it will add that user's information to the database. 
    5. The back end now tells the front end how it went - "Hey front end - please tell the user that they have been registered successfully.  


Cat
    - name
    - weight
    - breed
    - age
    - etc
Treatments that the vet offers
    - check-up
    - surgery
    - first-aid
    - grooming
Owner
    - address
    - other pets they have
    - last visit
    - payment method
    - etc. 




