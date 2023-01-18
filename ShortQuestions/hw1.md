# 1.18 Homework 1 
1. ``Learn MarkDown and show all of basic usage in the ShortQuestions/README.md``
   1. The following answers can show basic usages of MarkDown.
   2. More in the template.md.
2. ``Practice git using the platform.list the git commands you learned``
   1. git commit -m
   2. git add .
   3. git push
   4. git pull
   5. git diff
3. ``What is the basic steps to init a git repo in you local?``
   1. cd to a directory containing your target project
   2. git init
   3. git add .
   4. git commit
   5. set up upstream git repo link by using ***git remote add***
   6. git push
4. ``How to clone a repo from Github?``
   1. cd to the directory you want to save the project
   2. git clone ***git_repo_link*** 
5. ``How to create a new branch and checkout to that branch?``
   1. cd to a git repo directory
   2. git checkout -b ***branch_name***
6. ``How to merge the branch_test to master branch in command?show me the commands``
   1. git checkout branch_test
   2. git add .
   3. git commit -m 'msg'
   4. git checkout master
   5. git merge branch_test
7. `` How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.``
   1. git stash
   2. git stash pop
   3. In intellij, we can use ``shelved changes`` to stash code, and use ``Restore`` files in ``Show Already Unshelved``.
8.  `` How do you understand PR is based on Branch?``
    1.  Pull reuqests let you tell others about changes you've pushed to a branch in a repository.
9.  ``What is maven role? what it be used to do?``
    1.  Maven is a project building and management tool. I used to make the addition and removal of dependencies/libraries more easily.
10. ``What is the lifecycle of maven? could you tell me the details ?``
    1.  Validate, Compile, Test, Package, Integration Test, Verify, Install, and Deploy
    2.  mvn clean, mvn compile, mvn test-compile, mven test, mvn package, mvn isntall/mvn build, mvn deploy
11. ``What is the difference between package and install in maven lifecycle ?``
    1.  Package: packaging the compiled code to format like jar.
    2.  Install: Installing packaged code to local maven repo.
12. `` What is plugins in maven, list some plugins.``
    1.  Plugins are some jar files, like some external tools (browser extensions) you are allowed to use under maven to achieve some goals.
    2.  Examples: maven-compiler-plugin, maven-surefire-plugin, maven-jar-plugin
13. ``In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows: groupID:com.chuwa.learn, artifactID:java-core``
14. ``Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other
students' PR, please don't merge it.``