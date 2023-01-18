# Short Questions
## What is the basic steps to init a git repo in you local ?
```
git init
```
## How to clone a repo from Github ?
```
git clone url
```
## How to create a new branch and checkout to that branch ?
```
git checkout -b new_branch_name
```
## How to merge the branch_test to master branch in command ? show me the commands
```
git checkout master
git merge branch_test
```
## How to stash your new code before leaving branch branch_learn_stash and pop your stash when you  checkout back to **branch_learn_stash ? try commands way and intellij way.
commands way
```
# before leaving branch_learn_stash
git stash
# back to branch_learn_stash
git stash pop
```
intellij way
## How do you understand PR is based on Branch?
 A PR is indicating a branch to review compared to another.
## What is maven role ? What it be used to do ?
maven can be used to manage dependencies.
It can also be used to package code to jars.
## What is the lifecycle of maven? could you tell me the details ?
Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.
1.  **Validate:**  This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
2.  **Compile:**  It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
3.  **Test:**  It runs unit tests for the project.
4.  **Package:**  This step packages the compiled code in distributable format like JAR or WAR.
5.  **Integration test:**  It runs the integration tests for the project.
6.  **Verify:**  This step runs checks to verify that the project is valid and meets the quality standards.
7.  **Install:**  This step installs the packaged code to the local Maven repository.
8.  **Deploy:**  It copies the packaged code to the remote repository for sharing it with other developers.
## What is the difference between package and install in maven lifecycle ?
`package`: take the compiled code and package it in its distributable format, such as a JAR.
`install`: install the package into the local repository, for use as a dependency in other projects locally
## What is plugins in maven, list some plugins?
Maven Plugins are generally used to 
-   create jar file
-   create war file
-   compile code files
-   unit testing of code
-   create project documentation
-   create project reports