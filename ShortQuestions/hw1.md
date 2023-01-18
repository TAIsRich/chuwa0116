# Homework 1

### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

# basic usage
## basic usage
### basic usage
#### basic usage
**basic usage**  
*basic usage*  
~~basic usage~~  
**basic _usage_**  
***basic usage***  
<sub>basic usage</sub>  
<sup>basic usage</sup>  
[basic usage](https://google.com)
>basic usage
```
print("basic usage")
```

### 2. practice git using the platform. list the git commands you learned

```
git init
git commit
git clone 
git branch 
git checkout 
git revert
git diff
git remote
```

### 3. What is the basic steps to init a git repo in your local

```
git init
```

### 4. How to clone a repo from GitHub?

```
git clone <repo>
```

### 5. How to create a new branch and checkout to that branch ?

```
git checkout -b <new_branch_name>
```

### 6. How to merge the branch_test to master branch in command ? show me the commands

```
git checkout master
git merge branch_test
```

### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.

```
git stash
git stash pop
```

### 8. How do you understand PR is based on Branch?

```
Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub. Once a pull request is opened, you can discuss and review the potential changes with collaborators and add follow-up commits before your changes are merged into the base branch.
```

### 9. What is maven role ? what it be used to do ?

```
Maven is chiefly used for Java-based projects, helping to download dependencies, which refers to the libraries or JAR files. The tool helps get the right JAR files for each project as there may be different versions of separate packages.
```

### 10. What is the lifecycle of maven? could you tell me the details ?

```
Default Maven lifecycle contains 7 steps: prepare-resources, Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.
Prepare-resources: Resource copying can be customized in this phase.
Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
Test: It runs unit tests for the project.
Package: This step packages the compiled code in distributable format like JAR or WAR.
Install: This step installs the packaged code to the local Maven repository.
Deploy: It copies the packaged code to the remote repository for sharing it with other developers.
```

### 11. what is the difference between package and install in maven lifecycle ?




### 12. What is plugins in maven, list some plugins.
```
Maven is actually a plugin execution framework where every task is actually done by plugins. Maven plugin is the core function of Maven. Plugin types include build type and report type. Plugins can have multiple objectives, which can be understood as multiple functionalites. Maven Plugins are generally used to: 
    create jar file
    create war file
    compile code files
    unit testing of code
    create project documentation
    create project reports

Common plugins: clean, compiler, surefire, jar, war, javadoc
```