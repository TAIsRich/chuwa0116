## 1. LearnMarkDownandshowallofbasicusageintheShortQuestions/README.md

## 2. practicegitusingtheplatform.listthegitcommandsyoulearned
```aid
git init
git commit
git clone 
git branch 
git checkout 
git revert
git diff
git remote
```
## 3. Whatisthebasicstepstoinitagitrepoinyoulocal?
```
git init
```

## 4. How to clone a repo from GitHub?

```aidl
git clone <repo>
```

## 5. How to create a new branch and checkout to that branch ?

```aidl
git checkout -b <new_branch_name>
```
## 6. How to merge the branch_test to master branch in command ? show me the commands
```aidl
git checkout master
git merge branch_test
```
## 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.

```aidl
git stash
git stash pop
```

## 8. How do you understand PR is based on Branch?

A pull request (PR) in Git is a way to propose changes to a specific branch in a repository and ask for those changes to be reviewed and potentially merged into the branch. When a user creates a pull request, they typically create a new branch in their own fork of the repository, make their changes on that branch, and then open a pull request to merge those changes back into the original repository's branch. The branch that the pull request is targeting is called the "base" branch, and the branch with the proposed changes is called the "head" branch.
## 9. What is maven role ? what it be used to do ?
dependency management and project building
## 10. What is the lifecycle of maven? could you tell me the details ?
Maven defines a standard set of phases for the build lifecycle of a project. These phases represent a series of steps that must be executed in a specific order to build, test, and deploy a project.

The default build lifecycle in Maven consists of the following phases:

validate: validate the project is correct and all necessary information is available
compile: compile the source code of the project
test: test the compiled source code using a suitable unit testing framework
package: take the compiled code and package it in its distributable format, such as JAR or WAR
verify: run any checks on results of integration tests to ensure quality criteria are met
install: install the package into the local repository, for use as a dependency in other projects locally
deploy: done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

## 11. what is the difference between package and install in maven lifecycle ?
The "package" phase is responsible for taking the compiled code and creating a distributable package, such as a JAR or WAR file. This package is then ready to be distributed or deployed.

The "install" phase is responsible for installing the package created in the "package" phase into the local repository. This allows the package to be used as a dependency in other projects that are built on the same machine.
## 12. What is plugins in maven, list some plugins.

In Maven, a plugin is a set of goals that can be executed to perform specific tasks. Plugins are used to provide additional functionality beyond what is included in the core Maven distribution.

Some common plugins in Maven are:

The Maven Compiler Plugin: used to compile the source code of a project.
The Maven Surefire Plugin: used to run unit tests.
The Maven Jar Plugin: used to create a JAR file for the project.
The Maven WAR Plugin: used to create a WAR file for the project.


