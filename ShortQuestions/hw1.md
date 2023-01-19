# HW1

## Q1 Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
> hello world

**hello world**

*hello world*

[hello world](https://github.com/)

## Q2 practice git using the platform. list the git commands you learned
- git branch
- git switch
- git stash
- git merge
- git reset
- git add/commit/push

## Q3 What is the basic steps to init a git repo in you local ?
> git init

## Q4 How to clone a repo from Github ?

> git clone repo_url

## Q5 How to create a new branch and checkout to that branch ?
> git checkout -b new_branch_name

## Q6 How to merge the branch_test to master branch in command ? show me the commands
> git checkout master
> 
> git merge branch_test

## Q7 How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
checkout back to **branch_learn_stash ? try commands way and intellij way.
- Command line
> git stash
> 
> git stash pop

- IntelliJ
> Git -> VCS Operations -> Stash changes
> 
> Git -> VCS Operations -> Unstash changes
## Q8 How do you understand PR is based on Branch?
The branch is a separate version of the codebase that allows developers to 
work on new features or bug fixes without affecting the main branch. 
Once the changes in the pull request have been reviewed and approved by 
other members of the team, changes on dev branch will be merged into the main branch.
## Q9 What is maven role ? what it be used to do ?
Maven is the dependency/library manager for java projects.
Maven's main function is to simplify the build process for developers. It does this by managing dependencies,
compiling and packaging the code, and providing plugins for the project.

## Q10 What is the lifecycle of maven? could you tell me the details ?
mvn Clean -> prepare-resources -> validate -> package -> install
- clean: Deletes target directory
- prepare-resources: Resource copying
- validate: Validate if project is correct and any necessary information is available.
- package: Take the compiled code and package it in distributable format, like JAR/WAR packages, as mentioned in the packaging in POM.xml
- install: Install the package in local/remote maven repo

## Q11 what is the difference between package and install in maven lifecycle ?
Package phrase is creating distributable format like JAR and install phrase is to install the package on the local machine.

## Q12 What is plugins in maven, list some plugins.
In Maven, plugins are used to perform specific tasks, such as compiling code, creating a JAR file, or generating documentation.

Some common plugins:
- The Compiler Plugin: responsible for compiling the source code of the project.
- The Jar Plugin: responsible for creating a JAR file for the project.
- The Surefire Plugin: responsible for running the unit tests of the project.

## Q13 In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows:
...

## Q14 Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.
...

