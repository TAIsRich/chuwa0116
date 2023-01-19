# hw1

## 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

See README.md

## 2. practice git using the platform. list the git commands you learned

```
git clone
git add
git commit
git push
git stash
git stash pop
git branch
git checkout
git merge
```

## 3. What is the basic steps to init a git repo in you local ?

```
git init
git add .
git commit -m "some commit message"
git push --set-upstream origin branch_name
```


## 4. How to clone a repo from Github ?

`git clone`

## 5. How to create a new branch and checkout to that branch ?

`git checkout -b branch_name`

## 6. How to merge the branch_test to master branch in command ? show me the commands

```
git checkout master
git merge branch_test
```
## 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.

```
git stash
git checkout other_branch
git checkout branch_learn_stash
git stash pop
```
## 8. How do you understand PR is based on Branch?

When we want to modify code on master branch, we can create a pull request to tell others what we did in this modification.

## 9. What is maven role ? what it be used to do ?

manage dependencies
build project
documentation
reporting

## 10. What is the lifecycle of maven? could you tell me the details ?

mvnClean
prepare-resources: Resource copying can be customized in this phase.
validate: Validates if the project is correct and if all necessary information
is available.
compile: Source code compilation is done in this phase
test: Tests the compiled source code suitable for testing framework
package: This phase creates the JAR/WAR package as mentioned in the
packaging in POM.xml.
install: This phase installs the package in local/remote maven
repository.
Deploy: Copies the final package to the remote repository.


## 11. what is the difference between package and install in maven lifecycle?

The package phase creates the JAR/WAR packages.
The install phase install packages in local or remote maven repository.

## 12. What is plugins in maven, list some plugins

Plugins are some real actions which can be reused for common build logic across multiple projects. 

Examples: maven-antrun-plugin
