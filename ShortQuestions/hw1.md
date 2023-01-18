### 1. See MREADME.md
### 2. GIt commands:
```
git commit
git branch
git checkout
git merge
git rebase
git branch -f <branchName> <commit1>
git reset <branchName>
git revert <branchName>
git cherry-pick <Commit1> <Commit2> <...>
git clone
git fetch
git push
	 
```
### 3.  What is the basic steps to init a git repo in you local ?
```
git init
```
### 4.  How to clone a repo from Github ?
```
git clone <your work space>
```
### 5.  How to create a new branch and checkout to that branch ?
```
git checkout -b <new branch>
```
### 6.  How to merge the branch_test to master branch in command ? show me the commands
```
git checkout master
git merge branch_test
```
### 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you  checkout back to **branch_learn_stash ? try commands way and intellij way.
- Commands way:
```
git stash
git checkout branch_learn_stash
git stash pop
```
- Intellij way:
  - Save changes to a stash﻿
    - From the main menu, choose Git | Uncommitted Changes | Stash Changes.

    - In the Stash dialog that opens, select the appropriate Git root and make sure that the correct branch is checked out.

    - In the Message field describe the changes you are about to stash.

    - To stash local changes and bring the changes staged in the index to your working tree for examination and testing, select the Keep index option.

    - Click Create Stash.
  - Apply a stash﻿
    - From the main menu, choose Git | Uncommitted Changes | Unstash Changes.

    - Select the Git root where you want to apply a stash, and make sure that the correct branch is checked out.

    - Select the stash you want to apply from the list.

    - If you want to check which files are affected in the selected stash, click View.

    - To remove the selected stash after it is applied, select the Pop stash option.

    - To apply stashed index modifications as well, select the Reinstate Index option.

    - If you want to create a new branch on the basis of the selected stash instead of applying it to the branch that is currently checked out, type the name of that branch in the As new branch field.


### 8.  How do you understand PR is based on Branch?
Pull request can let others to review the difference of your branch and the master branch before merging them together. Thus it is based on branch.

### 9.  What is maven role ? what it be used to do ?
Maven is a tool thac can manage dependncies, build project, give documentations and reporting.

### 10.  What is the lifecycle of maven? could you tell me the details ?
The lifecycle of maven is as following:
- Resources perparing(Resource copying can be customized in this phase.)
- Validation(Validates if the project is correct and if all necessary information is available.)
- Compilation(Source code compilation is done in this phase.)
- Testing(Tests the compiled source code suitable for testing framework.)
- Packaging(This phase creates the JAR/WAR package.)
- Installation(This phase installs the package in local/remote maven repository.)
- Deploying(Copies the final package to the remote repository.)

### 11.  what is the difference between package and install in maven lifecycle ?
- package: Creates JAR/WAR pakcage for the project to convert it into a distributable format.
- install: Deploys the packaged JAR/ WAR file to the local/remote maven repository.

### 12.  What is plugins in maven, list some plugins.
Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.
- clean
- compiler
- deploy




