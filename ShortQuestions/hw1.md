### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
See [link for markdown usage](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax).
See README.md
### 2. practice git using the platform. list the git commands you learned
```
git init
git add .
git commit
git pull
git push
git branch
git checkout
git status
```
### 3. What is the basic steps to init a git repo in you local ?
```
git init
```

### 4. How to clone a repo from Github
Go to Code in the repo, choose the way you want to clone (https,ssh,CLI),
got to the working directory, type
```
git clone <address you cloned from repo>
```

### 5.How to create a new branch and checkout to that branch
```
git branch <branch_name>
git checkout <branch_name>
```
or
```
git checkout -b <branch_name>
```

### 6. How to merge the branch_test to master branch in command ? show me the commands

```
git pull origin master
git merge branh_test
git push origin master
```
### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
```
git stash save "branch_learn_stash"

git checkout branch_learn_stash
git stash pop
```
Intellij way:
Go to Menu, select Git then stash and choose the stash

### 8. How do you understand PR is based on Branch?
Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub

### 9. What is maven role ? what it be used to do ?
Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. 

### 10. What is the lifecycle of maven? could you tell me the details ?
+ validate - validate the project is correct and all necessary information is available
+ compile - compile the source code of the project
+ test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
+ package - take the compiled code and package it in its distributable format, such as a JAR.
+ verify - run any checks on results of integration tests to ensure quality criteria are met
+ install - install the package into the local repository, for use as a dependency in other projects locally
+ deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

### 11. what is the difference between package and install in maven lifecycle?+ package will compile your code and also package it. For example, if your pom says the project is a jar, it will create a jar for you when you package it and put it somewhere in the target directory (by default).
package will generate Jar/war as per POM file. install will install generated jar file to the local repository for other dependencies if any.
install phase comes after package phase

### 12. What is plugins in maven, list some plugins.
Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.
Example:
```
maven-compiler-plugin
maven-surefire-plugin
maven-assembly-plugin
maven-jetty-plugin


```