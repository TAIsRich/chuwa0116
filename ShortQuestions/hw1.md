***Question 1***
```
*** head ***
* italized *
This is ** important **
```


*** Question 2: list the git commands you learned****
```
git add .
git commit -m "new commit"
git push origin master
git pull
```

*** Question 3: What is the basic steps to init a git repo in you local ? ***
```
git init
```

*** Question 4: How to clone a repo from Github  ***
```
git clone repo_name
```

*** Question 5: How to create a new branch and checkout to that branch ***
```
git branch branch_name
git checkout branch_name
```

*** Question 6: How to merge the branch_test to master branch in command ? show me the command ***
```
git checkout master
git pull origin master
git merge branch_test
git push origin master
```

*** Question 7: How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way***
```
git stash save "branch_learn_stash"
git checkout branch_learn_stash
git stash pop
```

*** Question 8: How do you understand PR is based on Branch? ***
```
Pull request let you tell other people the changes you have made to a specific branch.
```

*** Question 9: What is maven role ? what it be used to do ? ***
```
Maven is a java development tool mainly used for dependency management.
```

*** Question 10: What is the lifecycle of maven? could you tell me the details ***
```
Validate: check if the project structure is correct
Compile: it compiles the source code
Test: run test for the project
Package: packages the compiled code into JAR or WAR
integration testing for the project
Verify: it check if the project is valid and meets the requirements
install: install the code to the local Maven repository
Deploy: copy the packaged code to remote repository for sharing with other developers
```

*** Question 11: what is the difference between package and install in maven lifecycle ? ***
```
Package compiles the code to JAR or WAR format, install will install the packaged code to the local maven repository.
```

*** Question 12: What is plugins in maven, list some plugins ***
```
compiler, clean
```

*** Question 13: Maven Project ***
```
My Maven Project is in the directory "java-core"
```