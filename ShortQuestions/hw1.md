HW1-1 Maven, Git, PR
submit your assignments using PR
In your first_name/notes branch, do the below steps:
Write your hw1 in hw1.md

1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
    - https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formattin g-on-github/basic-writing-and-formatting-syntax
2. practicegitusingtheplatform.listthegitcommandsyoulearned
    - https://learngitbranching.js.org/
3. What is the basic steps to init a git repo in you local
```
git init 
git status
git add .
git commit -m
git push
git log
```

4.How to clone a repo from Github ?
`git clone HTTPS/SSH`

5.How to create a new branch and checkout to that branch ?
```
git branch [branch_name]
git checkout [branch_name]

Or one line
git checkout -b [branch_name]
```
6. How to merge the branch_test to master branch in command ? show me the commands
```
git checkout master
git pull
git merge branch_test
git commit
git push
```
7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.
```
git stash save "branch_learn_stash"
git stash list
git checkout branch_learn_stash
git stash pop
git stash list
```
8. How do you understand PR is based on Branch?
    - PR stands for pull request, a PR is indicating a branch to review compared to another, so we know the changes/commits you made to the feature branch.

9. What is maven role ? what it be used to do ?
    - Maven is a robust project management tool based on the POM architecture (project object model). It is used for project build, as well as for managing dependencies and documentation. In simple terms, Maven is a tool that can be used to create and manage any Java-based project.

10. What is the lifecycle of maven? could you tell me the details
    - Maven lifecycle is a whole process to deploy the prod. Only test phase can skip.
    - mvnClean -> prepare-resources -> validate -> compile -> test(skip) ->package -> install -> deploy
    - <img width="700" alt="image" src="https://user-images.githubusercontent.com/92887232/213316241-5b71277e-4d53-46f2-a1cb-e5658a250c6b.png">

11. what is the difference between package and install in maven lifecycle
     - Package phase creates the JAR/WAR package as mentioned in the packaging in POM.xml
     - Install phase installs the package in local/remote maven repository

12. What is plugins in maven, list some plugins.
    - Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.
    - Example: maven-antrun-plugin, maven-clean-plugin, maven-compiler-plugin etc.
