### Homework 1

1. The uses have already been included in README.md
2. **git commands I learn:**
```
git status
git clone
git add
git commit
git reset
git log
git show
git branch
git checkout
git merge
git remote
git push
git pull
```
3. **The basic steps to init a git repo are as follows:**
- create a new directory, and then enter it
- type the following command in the terminal
```
git init .
```
- Try to add some files
- Then type the following command:
```
git add .
```
- commit the changes:
```
git commit -m "leave your message here"
```
4. **clone command:**
```
git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY
```

5. **create a new branch and then checkout to that branch:**
```
git branch yourNewBranch
git checkout yourNewBranch
```
or 
```
git checkout -b yourNewBranch
```

6. **Commands are as follows:**
```
git checkout master
git merge branch_test
```

7. **How to stash your new code before leaving branch** branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way?

Command ways:
```
git stash save <description>
git checkout main
git checkout branch_learn_stash
git stash pop
```

Intellij ways:
- First enable VCS in your Intellij
- Then go to Git - VCS operations
- select the Commit tab
- Then for the changes on the left, your right-click it
- Then you select the shelve changes
- Then you could do something in the main branch
- Then you switch back to the branch_learn_stash branch
- Again, in the left commit tab, you could find the shelf option
- You could then restore the stashed changes here.

8. **How do you understand PR is based on Branch?**
Actually, in the process of development, it's common that developers create their branches, and then modify the files or add the files, in this way, the changes in the branches do not bother the main branch. Then, PR is raised on that branch so that other teammates could review the changes on that branch, and make their comments. It's that developer's responsibility to make several iteration on that branch. In the end, after other people's approval, he could finally merge that branch to the main branch.

9. **What is maven role ? what it be used to do ?**
Maven is the depedency management tool for your project, using Maven could facilitate your efficiency when building projects.

10. **The lifecycle of Maven is as follows:**
validate: validate the project is correct and all necessary information is available
compile: compile the source code of the project
test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package: take the compiled code and package it in its distributable format, such as a JAR.
verify: run any checks on results of integration tests to ensure quality criteria are met
install: install the package into the local repository, for use as a dependency in other projects locally
deploy: done in the build environment, copies the final package to the remote repository for sharing with other develo

11. Actually, package is just to take the compiled code and make it distirbutable, for example, convert that into the JAR/WAR, however, install is just to push the package into the local repository, therefore, they are fundamentally different.

12. Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. Some essential plugins are like: maven-surefire-plugin,
maven-assembly-plugin, maven-jar-plugin, etc.

13. The Maven project is in the folder of chuwa0116/MavenProject