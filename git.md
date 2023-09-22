# Git 

## What? 
Git is a Version Control System (VCS) and a Source Code Management (SCM) tool. 
- We use it to help manage our code base. 
- There are a lot of capabilities. Some benefits include: 
    - Collaboration - we can work together with other developers on code - from many locations 
    - tracks changes - keeping track of the history of our code - we can easily rollback to an earlier version

**Distributed** => DVCS -> which means there is a single central repository in a remote location (the internet)
- with distributed systems there can be as many local copies of the repository as we need. 



## Flow 
git clone https://github.com/dfelleman811/some-repo.git 
    - this will create a local copy of the remote repo on our local machine

then we make changes to the code 
once we're done we need to have those changes reflected in the remote repo 

git add . 
    - `.` => "git add all" the dot is referring to the current **working directory** 
    - once this command runs - our changes have been added to the **staging area**
    - once files are in the staging area - they are being 'tracked'

git commit -m "some commit message" 
    - applying the tracked changes
    - this is creating a savepoint (which git calls a commit) to signify that we're done making changes and git should do it's job (store the new commit - a new snapshot - and update the HEAD pointer)

*git pull*
    - retrieves updates from the remote repository and merges them into your local copy 
    - it's a combo of two git commands: `git fetch` - retrieves all branches, and `git merge` - which combines the new additions/changes with the existing code. 

git push `<name-of-origin>` `<name-of-branch>` 
    - this command tells the remote repo to update to the most recent commit 


## Branching
- we can create local (and remote) duplicates of our repos - and refer to them as branches 

git branch - will list all branches 

git checkout -b `<your-branch-name>`
    - this will create a new branch 
    - AND 'check it out' - which means move your HEAD/pointer to the new branch so any changes you make are isolated in that space
    - it's important to make sure you ahve committed (or stashed) your recent changes before creating a new branch