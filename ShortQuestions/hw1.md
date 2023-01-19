
# HW1

1. What is the basic steps to init a git repo in you local ?
   ```shell
      mkdir new_directory
      cd new_directory
      git init
      touch README.md
      git add .
      git commit -m 'init new repo'
    ```

2. How to clone a repo from Github ?
    ```shell
    git clone https://github.com/TAIsRich/chuwa0116.git
    ```
3. How to create a new branch and checkout to that branch ? 
   ```shell
    git checkout -b new_branch
    ```
4. How to merge the branch_test to master branch in command ? show me the commands 
    ```shell
    git checkout master
    git merge branch_test
   ```
5. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
    checkout back to **branch_learn_stash ? try commands way and intellij way. 
    ```shell
    git stash
    
    git checkout branch_learn_stash 
    git stash pop
   ```
6. How do you understand PR is based on Branch? \
    PR attaches to a branch that you want to merge. \
A PR tells others about changes you've pushed to a branch in a repo.
7. What is maven role ? what it is used to do ? 
    Maven is a tool for automation and management.\
    maven is used for projects build, dependency and documentation.
8. What is the lifecycle of maven? could you tell me the details ? 
    * validate: validate if the project is correct
    * compile: compile source code
    * test: run unit tests using compiled code
    * package: package source code in distributed format like JAR and WAR
    * verify: run integration tests 
    * install: install the package into the local repository
    * deploy: copies the final package to the remote repository.
9. what is the difference between package and install in maven lifecycle ? 
    * Package: compile source code and package it as JAR or WAR.
    * Install: In addition to compile source code and package it into JAR or WAR, it also installs the package into the local repository, for use as a dependency in other projects locally
10. What is plugins in maven, list some plugins.\
    Maven is really just a core framework for a collection of Maven Plugins. Plugins are where much of the real action is performed.
    * maven-compiler-plugin
    * tomcat7-maven-plugin
    * jetty-maven-plugin
11. In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows:
    1. groupID: com.chuwa.learn 
    2. artifactID: java-core 
12. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other
     students' PR, please don't merge it.