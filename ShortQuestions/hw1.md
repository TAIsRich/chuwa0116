#HW1
### 1 Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
Please check ShortQuestions/README.md

### 2 practice git using the platform. list the git commands you learned
```
git init
git clone
git add
git commit 
git pull
git push
git branch
git checkout 
git status
```

### 3 What is the basic steps to init a git repo in you local ?
```
git init
```

### 4 How to clone a repo from Github ?
```
git clone <HTTPS/SSH>
```

### 5 How to create a new branch and checkout to that branch?
```
git checout -b <branch_name>
```

### 6 How to merge the branch_test to master branch in command? show me the commands
```
git checkout master
git pull
git merge branch_test
git commit
git push
```

### 7 How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way
```
git stash save "branch_learn_stash"
git checkout branch_learn_stash
git stash pop
```

### 8 How do you understand PR is based on Branch?
```
PR let us tell others changes you've pushed to a branch in a repository on GitHub.
```

### 9 What is maven role ? what it be used to do ?
```
Maven is a robust project management tool
It is used for project build, as well as for managing dependencies and documentation.
```

### 10 What is the lifecycle of maven? could you tell me the details
```
Maven lifecycle consists of 8 steps: Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.
Validate: This step validates if the project structure is correct.
Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
Test: It runs unit tests for the project.
Package: This step packages the compiled code in distributable format like JAR or WAR.
Integration test: It runs the integration tests for the project.
Verify: This step runs checks to verify that the project is valid and meets the quality standards.
Install: This step installs the packaged code to the local Maven repository.
Deploy: It copies the packaged code to the remote repository for sharing it with other developers.
```

### 11 what is the difference between package and install in maven lifecycle
```
Package: This step packages the compiled code in distributable format like JAR or WAR.
Install: This step installs the packaged code to the local Maven repository.
```

### 12 What is plugins in maven, list some plugins.
```
Plugins are where much of the real action is performed, plugins are used to: create jar files, create war files, compile code, unit test code, create project documentation, and on and on.
maven-compiler-plugin
maven-surefire-plugin
maven-assembly-plugin
maven-jetty-plugin
maven-dependency-plugin
maven-jar-plugin
maven-war-plugin
maven-deploy-plugin
```


