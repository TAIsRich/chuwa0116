### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

### 2. practice git using the platform. list the git commands you learn
    git init
    git clone
    git status
    git branch "branch_name"
    git switch "branch_name"
    git checkout
    git pull
    git add
    git commit 
    git push
    git merge
    


### 3. What is the basic steps to init a git repo in you loc?
    git init

### 4. How to clone a repo from Github
    git clone "url of repository"


### 5. How to create a new branch and checkout to that branch?

    git branch new_branch_name
    git switch new_branch_name

### 6.  How to merge the branch_test to master branch in command? show the commands?
    git checkout master
    git pull origin master
    git merge branch_test
    

### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
- commands way:  

    git stash 


    git checkout branch_learn_stash  
    git stash pop

- intellij way:

    Save changes to a stash：  
    1. From the main menu, choose <b>Git | Uncommitted Changes | Stash Changes</b>.  

    2. In the <b>Stash</b> dialog that opens, select the appropriate Git root and make sure that the correct branch is checked out.

    3. In the <b>Message</b> field describe the changes you are about to stash.

    4. To stash local changes and bring the changes staged in the index to your working tree for examination and testing, select the <b>Keep index</b> option.

    5. Click <b>Create Stash</b>.

    Apply a stash：  

    1. From the main menu, choose <b>Git | Uncommitted Changes | Unstash Changes</b>.

    2. Select the Git root where you want to apply a stash, and make sure that the correct branch is checked out.

    3. Select the stash you want to apply from the list.

        If you want to check which files are affected in the selected stash, click <b>View</b>.

    4. To remove the selected stash after it is applied, select the <b>Pop stash</b> option.

    5. To apply stashed index modifications as well, select the <b>Reinstate Index</b> option.

    6. If you want to create a new branch on the basis of the selected stash instead of applying it to the branch that is currently checked out, type the name of that branch in the <b>As new branch</b> field.

    To remove a stash, select it in the list and click <b>Drop</b>. To remove all stashes, click <b>Clear</b>.



    

### 8. How do you understand PR is based on Branch?
    Pull requests let us tell others about changes we have pushed to a branch in a repository. Once a pull request is opened, we can discuss and review the potential changes with collaborators and add follow-up commits before our changes are merged into the base branch.

### 9. What is maven role ? what it be used to do?   
    Maven is a robust project management tool based on the POM (Project Object Model) architecture. It is used for project build, as well as for managing dependencies and documentation.

Its roles include:  
-  Manage Dependencies
-  Build Project (Cycle)
- Documentation
-  Reporting



    
    


### 10. What is the lifecycle of maven? could you tell me the details？
    As running a command for any of the lifecycle phases, it executes each default life cycle phase in order, before executing the command itself.

    validate >> compile >> test (optional) >> package >> verify >> install >> deploy

- validate: validate the project is correct and all necessary information is available
- test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- package - take the compiled code and package it in its distributable format, such as a JAR.
- verify - run any checks on results of integration tests to ensure quality criteria are met
- install - install the package into the local repository, for use as a dependency in other projects locally
- deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
    






### 11. What is the difference between package and install in maven lifecycle?  

- When running the command mvn package, it runs the commands for all lifecycle phases till package:     

    validate >> compile >> test (optional) >> package

- When running the command mvn install：     

    validate >> compile >> test (optional) >> package >> verify >> install  

  
    So, install commands does everything that package does and some more ( install the package into the local respository, for use as a dependency in other projects locally)




  

### 12. What is plugins in maven, list some plugins    
  
    Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.

There are some pulgins: 

| Syntax      | Description |
| ----------- | ----------- |
| clean     | clean up after build |
| compiler   | compiles java source code        |
| deploy | deploys the artifact to the remote repository |
| install | installs the built artifact into the local repository   |


### 13. In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows:
1.  groupID: com.chuwa.learn
2.  artifactID: java-core

    
