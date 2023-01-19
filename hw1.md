###### 1. Learn MarkDown
See shortQuestions/README.md   

###### 2. Practice git using the platform. list the git commands you learned:
```
git commit
git branch
git checkout
git merge
git rebase
```

###### 3. What is the basic steps to init a git repo in your local:   
1. Create a directory to contain the project  
2. Go into the new directory   
3. Type git init   
4. Write your code   
5. Type git add to add the files   
6. Type git commit   

###### 4. How to clone a repository from Github:   
1. Open “Git Bash” and change the current working directory to the location where you want the cloned directory.   
2. Type git clone in the terminal, paste the URL you copied earlier, and press “enter” to create your local clone.   

###### 5. How to create a new branch and checkout to that branch:   
Use "git checkout -b <new branch name>"   

###### 6. How to merge the branch_test to master branch in command:   
```
git merge branch_test   
```

###### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash?   
```
git stash   
git stash pop   
```

###### 8. How do you understand PR is based on Branch?   
A PR is indicating a branch to review compared to another, for example, Master branch. When you create a PR, the system will evaluate how many new commits have been made to the feature branch since the moment it has been branched off of the Master branch.   

###### 9. What is maven role? what it be used to do?   
1. Manage Dependencies(Package)   
2. Build Project(Cycle)   
3. Documentation   
4. Reporting   

###### 10. What is the lifecycle of maven? could you tell me the details?   
mvnClean -> prepare-resources -> validate -> package -> install   
prepare-resources: resource copying   
validate: validating the information   
compile: Source code compilation   
test: Tests the compiled source code suitable for testing framework   
package: Creates the JAR/WAR package as mentioned in the packaging in POX.xml   
install: installs the package in local/remote maven repository   
Deploy: Copies the final package to the remote repository   

###### 11. what is the difference between package and install in maven lifecycle?   
package: Creates the JAR/WAR package as mentioned in the packaging in POX.xml  
install: installs the package in local/remote maven repository   

###### 12. What is plugins in maven, list some plugins.   
Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.   
maven-jetty-plugin   
maven-dependency-plugin   
maven-jar-plugin   
maven-war-plugin   



