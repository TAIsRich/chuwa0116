# HW1

### 1 Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

See README.md

### 2 practice git using the platform. list the git commands you learned

```
git init
git add .
git commit
git pull
git push
git branch
git checkout
git status
```

### 3 What is the basic steps to init a git repo in you local ?

```
git init
```

### 4 How to clone a repo from Github ?

```
git clone url
```

### 5 How to create a new branch and checkout to that branch?

```
git branch new_branch
git checkout new_branch
```

### 6 How to merge the branch_test to master branch in command? show me the commands

```
git checkout master
git pull origin master
git merge branch_test
git push origin master
```

### 7 How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.

```
git stash save "branch_learn_stash"

git checkout branch_learn_stash
git stash pop
```

Intellij:

+ Save changes to a stash
  1. From the main menu, choose Git | Uncommitted Changes | Stash Changes.
  2. In the Stash dialog that opens, select the appropriate Git root and make sure that the correct branch is checked out.
  3. In the Message field describe the changes you are about to stash.
  4. To stash local changes and bring the changes staged in the index to your working tree for examination and testing, select the Keep index option.
  5. Click Create Stash.

+ Apply a stash
  1. From the main menu, choose Git | Uncommitted Changes | Unstash Changes.
  2. Select the Git root where you want to apply a stash, and make sure that the correct branch is checked out.
  3. Select the stash you want to apply from the list.If you want to check which files are affected in the selected stash, click View.
  4. To remove the selected stash after it is applied, select the Pop stash option.
  5. To apply stashed index modifications as well, select the Reinstate Index option.
  6. If you want to create a new branch on the basis of the selected stash instead of applying it to the branch that is currently checked out, type the name of that branch in the As new branch field.

### 8 How do you understand PR is based on Branch?

Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub.

### 9 What is maven role ? what it be used to do ?

Maven is a build automation tool used primarily for Java projects.

### 10  What is the lifecycle of maven? could you tell me the details 

1. **Validate:** This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
2. **Compile:** It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
3. **Test:** It runs unit tests for the project.
4. **Package:** This step packages the compiled code in distributable format like JAR or WAR.
5. **Integration test:** It runs the integration tests for the project.
6. **Verify:** This step runs checks to verify that the project is valid and meets the quality standards.
7. **Install:** This step installs the packaged code to the local Maven repository.
8. **Deploy:** It copies the packaged code to the remote repository for sharing it with other developers.

### 11  what is the difference between package and install in maven lifecycle ?

Package: This step packages the compiled code in distributable format like JAR or WAR.

Install: This step installs the packaged code to the local Maven repository.

### 12 What is plugins in maven, list some plugins.

Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. They do this by executing an "action" (i.e. creating a WAR file or compiling unit tests) in the context of a project's description - the Project Object Model (POM).

Example: `clean`, `complier`, `deploy`, `failsafe`