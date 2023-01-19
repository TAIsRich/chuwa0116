**1.see ShortQuestions README.md**
**2.practice git using the platform. list the git commands you learned**
Some basic Git commands are:
```
git init 
git status
git add
git commit -m
git push
git log
```

**3. What is the basic steps to init a git repo in you local**
```
git init 
git status
git add .
git commit -m
git push
git log
```
**4.How to clone a repo from Github ?**
```
git clone HTTPS/SSH
```

**5.How to create a new branch and checkout to that branch ?**
```
git branch [branch_name]
git checkout [branch_name]
```
Or you can do in one line
```
git checkout -b [branch_name]
```
**6. How to merge the branch_test to master branch in command ? show me the commands**
```
git checkout master
git pull
git merge branch_test
git commit
git push
```

**7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
checkout back to branch_learn_stash ? try commands way and intellij way.**
```
git stash save "branch_learn_stash"
git stash list
git checkout branch_learn_stash
git stash pop
git stash list
```

**8. How do you understand PR is based on Branch?**

PR means pull request, so which branch you want to merge with you need to create a PR to do so.

**9. What is maven role ? what it be used to do ?**

Manage Dependencies(Package).

Build Project (Cycle)

Documentation

Reporting

**10. What is the lifecycle of maven? could you tell me the details**

Maven lifecycle is a whole process to deploy the prod. Only test phase can skip.

mvnClean -> prepare-resources -> validate -> compile -> test(skip) ->package -> install -> deploy

**11. what is the difference between package and install in maven lifecycle**

Package phase creates the JAR/WAR package as mentioned in the packaging in POM.xml

Install phase installs the package in local/remote maven repository

**12. What is plugins in maven, list some plugins.**
plugins are a set of components can be used for specific tasks during the build process.

Example: maven-compiler-plugin, maven-antrun-plugin etc.



