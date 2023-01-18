#####  1. markdown


#####  2. git commands
    git checkout -b newbranch
    git diff
    git log
    git reflog
    gir reset --hard HEAD^ (^ can be more)
#####  3. What is the basic steps to init a git repo in your local?
     git init
#####  4. How to clone a repo from GitHub?
    git colne + HTTP/SSN

#####  5. How to create a new branch and checkout to that branch?
    git checkout -b newbranch_name
#####  6. How to merge the branch_test to master branch in command?
    in master branch, run: git merge branch_test

#####  7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
    git stash
    git stash pop
#####  8. How do you understand PR is based on Branch?
    after pull request and review by others, it can be merge to the main work branch

#####  9. maven use to do? role?
Easy to download add and remove the dependencies/libraries
- role: 
  - Manage Dependencies(Package). 
  - Build Project (Cycle) 
  - Documentation
  - Reporting

Easy to download add and remove the dependencies/libraries


#####  10. What is the lifecycle of maven? details?
1. Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
2. Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
3. Test: It runs unit tests for the project.
4. Package: This step packages the compiled code in distributable format like JAR or WAR.
5. Integration test: It runs the integration tests for the project.
6. Verify: This step runs checks to verify that the project is valid and meets the quality standards.
7. Install: This step installs the packaged code to the local Maven repository.
8. Deploy: It copies the packaged code to the remote repository for sharing it with other developers.

#####  11. what is the difference between package and install in maven lifecycle?

- Package & install are various phases in maven build lifecycle. 
- package phase will execute all phases prior to that & it will stop with packaging the project as a jar.
- Similarly install phase will execute all prior phases & finally install the project locally for other dependent projects.
- package will generate Jar/war as per POM file. 
- install will install generated jar file to the local repository for other dependencies if any. 
- install phase comes after package phase
#####  12. What is plugins in maven, list some plugins.
Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.
- jar – The current project builds a JAR via the jar plugin.
- rar – The current project builds a RAR via the rar plugin.

