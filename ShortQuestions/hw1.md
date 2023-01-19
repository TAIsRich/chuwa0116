### 2. practice git using the platform. list the git commands you learned
   ```
      git init
      git add .
      git commit
      git pull
      git push
      git branch
      git checkout
      git status
   ```

### 3. What is the basic steps to init a git repo in you local ?
   ```
      mkdir new_directory
      cd new_directory
      git init
      git add .
      git commit -m 'init new repo'
   ```

### 4. How to clone a repo from Github ?
   ```
    git clone <url>
   ```
### 5. How to create a new branch and checkout to that branch ? 
   ```
    git checkout -b <new_branch>
   ```

### 6. How to merge the branch_test to master branch in command ? show me the commands 
   ```
    git pull origin master
    git merge branh_test
    git push origin master
   ```
   
### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
    checkout back to **branch_learn_stash ? try commands way and intellij way. 
   ```
    git stash
    git checkout branch_learn_stash 
    git stash pop
   ```
### 8. How do you understand PR is based on Branch? 
    PR tells others about changes you've pushed to a branch in a repo.

### 9. What is maven role ? what it is used to do ? 
    Maven is a popular open-source build tool developed by the Apache Group to build, publish, and deploy several projects at once for better project management. It is used for projects build, dependency and documentation.

### 10. What is the lifecycle of maven? could you tell me the details ? 
    * validate: validate the project is correct and all necessary information is available.
    * compile: compile the source code.
    * test: test the compiled source code using a suitable unit testing framework.
    * package: package the compiled code in its distributed format like JAR.
    * verify: run integration tests 
    * install: install the package into the local repository
    * deploy: done in the build environment, copies the final package to the remote repository.

### 11. what is the difference between package and install in maven lifecycle ? 
    package compiles source code and package it as JAR. install will install the package into the local repository for other dependencies in other projects locally

### 12. What is plugins in maven, list some plugins.
    Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. 
   ```
    maven-compiler-plugin
    maven-jetty-plugin
   ```