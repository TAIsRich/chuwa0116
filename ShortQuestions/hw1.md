### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
In ShortQuestions/README.md

### 2. practice git using the platform. list the git commands you learned
```
git init
git clone 'url' 
git status
git branch [newBranchName]  //Create a new branch
git checkout [branchName]   //Switch branch
git add .
git commit -m
git push
git pull
```

### 3. What is the basic steps to init a git repo in you local?
```
git init
git clone / write some code
git add.
git commit -m [someMessage]
```

### 4. How to clone a repo from Github ?
```
git clone [url/ssh]
```

### 5. How to create a new branch and checkout to that branch ?
```
git checkout -b [newBranchName]
```

### 6. How to merge the branch_test to master branch in command ? show me the commands
```
git checkout branch_test
git merge master
```

### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.
git command
```
git checkout branch_learn_stash
git stash sava "it is branch_learn_stash"
git checkout branch_learn_stash
git stash pop / 
(git stash list 
git stash apply stash@{[num]})
```
intellij
```
 Git --> Vcs Operations --> Stash Changes / Unstash changes
```
![avatar](/ShortQuestions/image/stash.png)

### 8. How do you understand PR is based on Branch?
I think Pr provides a review process to prevent code with issues or bugs from merging into the main branch/other branch. So Pr is based on the developer's own branch request to merge the main branch/other branches

### 9. What is maven role ? what it be used to do ?
Maven is a build automation tool primarily used for Java projects. It can be used to manage dependencies, compile and test code, and package it into an executable format such as a JAR file

### 10. What is the lifecycle of maven? could you tell me the details?
<p> clean : Deletes target directory
<p> validate : Validates if the project is correct and if all necessary information
is available.
<p> compile : Source code compilation is done in this phase.
<p> Test : Tests the compiled source code suitable for testing framework.
<p> package : This phase creates the JAR/WAR package as mentioned in the
packaging in POM.xml.
<p> install : This phase installs the package in local/remote maven
repository.
<p> deploy : Copies the final package to the remote repository.

### 11. what is the difference between package and install in maven lifecycle
The maven package  will compile the source and will package it in its distributable formats, such as a JAR or WAR. 
<p>The maven install , however, additionally to compiling the source code and packaging it into a JAR or a WAR, it will also install the package into the local repository, for use as a dependency in other projects locally.

### 12. What is plugins in maven, list some plugins. 
"Maven" is really just a core framework for a collection of Maven Plugins. In other words, plugins are where much of the real action is performed, plugins are used to: create jar files, create war files, compile code, unit test code, create project documentation, and on and on. 
`some plugins `
```
clean
compiler
surfire
jar
war
javadoc
...
```
### 13. In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows:
1.  groupID: com.chuwa.learn
2.  artifactID: java-core
### 14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other student\`s PR, please don`t merge it.

     

