## What is the basic steps to init a git repo in you local ?

Create a directory to contain the project,

Go to the new directory,

Type git init .

Write some codes,

Use git add .

Type git commit

## How to clone a repo from Github ?

Use http git clone command

How to create a new branch and checkout to that branch ?

Git branch <branch name>

Git checkout <branch name>

## How to merge the branch_test to master branch in command ? show me the commands

git checkout master

git merge branch_test

## How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.

CMD way: Use git stash pop

IntelliJ IDEA way go to VVS menu and select Git then statsh and choose the stash you want to apply.



## How do you understand PR is based on Branch?

In Git, a pull request is based on a branch, meaning that the proposed changes are made on a separate branch, separate from the main branch 

## What is maven role ? what it be used to do ?

Maven is a build automation tool primarily used for Java projects. It is used to manage the build, reporting, and documentation of a project.

## What is the lifecycle of maven? could you tell me the details ?

1. **Clean**: This life cycle is used to clean up resources created during previous builds.
2. **default**: This is the main lifecycle for building and distributing a project.
3. **site**: This lifecycle is used to create a site for the project. 

## what is the difference between package and install in maven lifecycle ?

Package  phase: This phase is responsible for taking the compiled code and creating a distributable package in the format specified in the project's POM file.

Install phase: This phase is used to installing the package that package phase have in the local repo.

## What is plugins in maven, list some plugins.

It's just like chrome extensions. For example: Jar-plugin, war-plugin and dependency-plugin.

# In chuwa0116, MavenProject directory, create a maven Module using Intellij, named it as belows

```xml
  <parent>
    <groupId>com.chuwa.learn</groupId>
    <artifactId>chuwa0116</artifactId>
    <version>1.0-SNAPSHOT</version>
  </parent>  
  
  <groupId>com.chuwa.learn</groupId>
  <artifactId>java-core</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>
```

