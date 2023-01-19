# hw1
## 1.Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
## 2. practice git using the platform. list the git commands you learned
```
git clone
git commit
git push
git pull
git stash
git branch
git checkout
git merge
```
##3. What is the basic steps to init a git repo in you local ?
```
git init # init a git repo(repository-->source code)
git status
git add .
git commit -m "some message"
git push origin master/main
```
##4. How to clone a repo from Github?
```
git clone <repo>
```
##5. How to create a new branch and checkout to that branch ?
```
git checkout -b branch_name
```
##6. How to merge the branch_test to master branch in command ? show me the commands
```
git checkout master
git pull origin master
git merge branch_test
```
##7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you check back to **branch_learn_stash ? try commands way and intellij way.
- commands way:
```
git stash
git checkout branch_b
git checkout branch_learn_stash
git stash pop
```
- intellij way:
## 8. How do you understand PR is based on Branch?
It means that when a new branch was created, some changes were made on that new branch and then a PR can be submitted from that branch to merge those changes into main/master branch. This approach can keep the main branch clean, stable and to separate new features and bugfixes in different branches before they are finally merged into main branch after they are reviewed and approved by other team members.
## 9. What is maven role ? what it be used to do ?
In Maven, a role refers to the specific responsibility or function that a particular user or group of users has within a project. Maven provides built-in roles that can be assigned to users or groups.
## 10. What is the lifecycle of maven? could you tell me the details ?

mvnClean -> prepare-resources -> validate -> compile -> test -> package -> install
- prepare-resources: Resource copying can be customized in this phase.
- validate: Validates if the project is correct and if all necessary information
  is available.
- compile: Source code compilation is done in this phase.
- Test: Test Testing Tests the compiled source code suitable for testing framework.
- package: This phase creates the JAR/WAR package as mentioned in the
  packaging in POM.xml.
- install: This phase installs the package in local/remote maven
  repository.
- deploy: Copies the final package to the remote repository.
## 11. what is the difference between package and install in maven lifecycle ?
In Maven, the "package" phase is used to take the compiled code and package it in its distributable format, such as a JAR or WAR file. The "install" phase, on the other hand, is used to install the package into the local repository, making it available for other projects to use as a dependency. In short, "package" creates the distributable files and "install" makes it available for other projects to use.
## 12. What is plugins in maven, list some plugins.
In Maven, a plugin is a collection of one or more goals that can be executed to perform certain tasks. Plugins are used to provide additional functionality to a Maven project, such as compiling code, generating documentation, or deploying the project to a remote repository.
- Apache Maven Compiler Plugin
- Apache Maven Jar Plugin
- Apache Maven War Plugin