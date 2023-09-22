# BofA Pre-Training Survey Questions

## Level of Experience
Rate level of experience in the following from 1-5:
1. Never heard of it
2. Heard of it but never worked with it
3. Have worked with it a little
4. Made a small project with it
5. Feel pretty confident with it

## Terminology/Concepts
- Programming (in general)
- Client-server ("front end"/"back end")
- Databases (in general)
- Test automation
- Agile/SDLC
- Algorithms/Data structures
- HTTP

## Languages
- Java
- SQL
- HTML/CSS
- JavaScript
- JSON

## Libraries/Frameworks
- JDBC
- Hibernate
- Spring
- JUnit
- Selenium

## Other Technologies
- Gradle
- Maven
- Git



# YOUR TASK
You will need to clone the repository, create a branch, add your ratings to this "skill-survey.md" file, and push the changes to your branch.
Do not create a merge or pull request to the main branch! 


Steps to note:
1. Find a location in the File Explorer that is NOT in the H drive (homespace). I recommend the Documents folder.
2. Right click in the folder (anywhere in the whitespace) and click "Git BASH here" to open Git BASH at that location.
3. Clone the repository.
```
git clone https://github.com/dfelleman811/pre-training-bofa.git
```
4. Enter the folder that the repository was cloned into.
```
cd pre-training-bofa/
```
5. Create a branch.
```
git checkout -b mybranchname
```
6. Pull any changes from the master/main branch to your branch before you make any changes.
```
git pull origin main
```
7. Open the `skill-survey.md` file - you can do this from the command line or in your File Explorer.
```
notepad about-us.txt
```
8. Add your self ratings.
9. Add the changes to be tracked by Git.
```
git add skill-survey.md
```
10. Commit your changes - don't forget to include a commit message.
```
git commit -m "I took the survey!"
```
11. Push the committed changes from the local version of your branch to the remote version (origin).
```
git push origin mybranchname
```
12. Let me know when you're done. 
