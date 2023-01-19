### 1.  Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
* https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
### 2.  practice git using the platform. list the git commands you learned
```
git stash
git stash pop
git rebase
```
### 3.  What is the basic steps to init a git repo in you local ?
```
git init
git add .
git commit
```
### 4.  How to clone a repo from Github ?
```
git clone [url]
```
### 5.  How to create a new branch and checkout to that branch ?
`git checkout -b <branch name>` 
### 6.  How to merge the branch_test to master branch in command ? show me the commands
```
git checkout -b brach_test
git commit
git checkout master
git merge branch_test
```
### 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
* Command Way
```
git checkout -b brach_learn_stash
(make some changes)
git stash
git checkout main
git checkout branch_learn_stash
git stash pop
```
* IntelliJ Way
    1. Go to `Commit` tool window
    2. Right-click on the changes and select `Shelve changes` to stash the changes
    3. Go to `Shelf` tab under the `Commit` tool window
    4. Select stashed changes you want to restore and right-click to select `Unshelve`
### 8.  How do you understand PR is based on Branch?
* It is a type of request that you send when you want others to review your codes before merging them into the target branch
### 9.  What is maven role ? what it be used to do ?
* Maven is used to manage project dependencies and build a software.
### 10.  What is the lifecycle of maven? could you tell me the details ?
| Cycle    | Details                                                                        |
|----------|--------------------------------------------------------------------------------|
| clean    | clean any compiled java class                                                  |
| validate | validates if the project is correct and all necessary information is available |
| compile  | perform source code compilation                                                |
| test     | test the compiled source code                                                  |
| package  | creates the JAR/WAR package defined in the POM.xml file                        |
| install  | installs the package in local or remote maven repo                             |
| deploy   | put the final package to the remote repo                                       |
### 11.  what is the difference between package and install in maven lifecycle ?
* package: generates JAR/WAR package in the POM.xml file
* install: put these packages into the local/remote maven repo
### 12.  What is plugins in maven, list some plugins.
* plugins are the core feature of Maven which allow for the reuse of common build logic across multiple projects


| Plugin           | Details                               |
|------------------|---------------------------------------|
| **Core Plugins** |                                       |
| clean            | clean after the build                 |
| compiler         | compiles Java sources                 |
| deploy           | deploy built artifact toe remote repo |
### 13.  In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows:
* groupID: com.chuwa.learn
* artifactID: java-core
### 14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.