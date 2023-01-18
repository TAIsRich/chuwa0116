## 1.  Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

1.  https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formattin
g-on-github/basic-writing-and-formatting-syntax
## 2.  practice git using the platform. list the git commands you learned
1.  https://learngitbranching.js.org/
## 3.  What is the basic steps to init a git repo in you local ?

Initilizing a git repository by using "git init" commands

## 4.  How to clone a repo from Github ?

"git clone branch_name"

## 5.  How to create a new branch and checkout to that branch ?

to create, "git branch branch_name"
to checkout, "git checkout branch_name"

## 6.  How to merge the branch_test to master branch in command ? show me the commands

1. git checkout master
2. git merge branch_test

## 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.

commands way:  
1. git stash save
2. git stash pop  # when check back

intellij way:  
1. VCS -> Git -> Stash Changes
2. VCS -> Git -> Unstash Changes

## 8.  How do you understand PR is based on Branch?

Pull Requests are made to submit changes on the branch. Only after the approval, changes will be merged to the main branch.

## 9.  What is maven role ? what it be used to do ?

Maven is a build automation tool used primarily for Java projects. It can be used to manage project dependencies, build, test and deploy projects.

## 10.  What is the lifecycle of maven? could you tell me the details ?

 prepare-resources, validate, compile, test, package, integration-test, verify, install, deploy.

## 11.  what is the difference between package and install in maven lifecycle ?

'Package' phase will create the JAR/WAR package as mentioned in the packaging in POM.xml, whereas 'install' will install the package in local/remote maven repository.

## 12.  What is plugins in maven, list some plugins.

Plugins are used to perform tasks like compling and runnign unit tests. 
Some plugins are Compiler Plugin and Maven Jar Plugin.

## 13.  In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows:
1.  groupID: com.chuwa.learn
2.  artifactID: java-core
## 14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other 
students' PR, please don't merge it.
