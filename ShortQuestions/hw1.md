#### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
**basic usage**  
*basic usage*  
~~basic usage~~  
**basic _usage_**  
***basic usage***  
<sub>basic usage</sub>  
<sup>basic usage</sup>  
[basic usage](https://google.com)
>basic usage
```
print("basic usage")
```
#### 2. Practice git using the platform. List the git command learned
```
git init
git clone repo_url.git
git branch branch_name
git checkout branch_name
git checkout -b branch_name
git merge branch_test
```


#### 3. What is the basic steps to init a git repo in your local
```
git init
```

#### 4. How to clone a repo from Github
```
git clone repo_url.git
```
#### 5. How to create a new branch and checkout to that branch
```
git branch branch_name
git checkout branch_name
```
or
```
git checkout -b branch_name
```


#### 6. How to merge the branch_test to master branch in command? show the commands
```
git checkout master
git merge branch_test
```

#### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash? try commands way and intellij way.
```
git stash
git stach pop
```


#### 8. How do you understand PR is based on Branch
Pull Request let you tell others about the changes you've made before merging it 
into the master branch. Therefore, it is based on branch
<br>
<br>
#### 9. What is maven role? What is it used to do
Maven is a tool to manage dependencies, build project and provides documentations.
<br>
<br>
#### 10. What is the lifecycle of maven? Could you tell the details.
**prepare-resources**: Copying resources in this phase \
**validate**: Validates if the project is correct and if all necessary information 
is available \
**compile**: Source code compilation is done in this phase \
**Test**: Tests the compiled source code suitable for testing framework \
**package**: This phase creates the JAR/WAR packages\
**install**: This phase installs the package in local/remote maven repository
**deploy**: Copies the final package to the remote repository
<br>
<br>
#### 11. What is the difference between package and install in maven life cycle
**package**: take the compiled code and package it in its distributable format, such as a JAR \
**install**: install the package into the local repository, for use as a dependency in other projects locally 
<br>
<br>
#### 12. What is plugins in maven, list some plugins
Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.
