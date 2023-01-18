#HW1
1. Learn MarkDown and show all of basic usage in the **ShortQuestions/README.md**  
[https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formattin g-on-github/basic-writing-and-formatting-syntax]()

2. practice git using the platform.list the git commands you learned
  [https://learngitbranching.js.org/]()  
  commit, branch, merge, rebase, HEAD, HEAD^, HEAD~1, cherry-pick, rebase
3. What is the basic steps to init a git repo in you local?  
Build a repository.
4. How to clone a repo from Github?  
`git clone [address of repo]`
5. How to create a new branch and checkout to that branch?
`git checkout -b [nameOfBranch]`
6. How to merge the branch_test to master branch in command? show me the commands  
Firstly, you need to switch to master branch, and the merge the branch_test into the master barnch  
```
git checkout main 
git merge branch_test
```
7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout  back to **branch_learn_stash ? try commands way and intellij way.
```
git checkout branch_learn_stash
git stach save "message"
git checkout branch_learn_stash
git stash pop
git stash list 
```
Git -> Uncommitted Changes -> Stash Changes.

8. How do you understand PR is based on Branch?  
PR helps user to manage their code to avoid the bugs or other problem been merged in main project.  

9. What is maven role? what it be used to do?
Maven is a tool to help users manage their project. It can be user in get different jar package, test project,  build project, etc. 

10. What is the lifecycle of maven? could you tell me the details ?  
Lifecycle of maven: Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.  
 * Validate: This step validates if the project structure is correct.  
 * Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
 * Test: It runs unit tests for the project.
 * Package: This step packages the compiled code in distributable format like JAR or WAR.
 * Integration test: It runs the integration tests for the project.
 * Verify: This step runs checks to verify that the project is valid and meets the quality standards.
 * Install: This step installs the packaged code to the local Maven repository.
 * Deploy: It copies the packaged code to the remote repository for sharing it with other developers.
11. what is the difference between package and install in maven lifecycle?  
install is to install package code to local Maven repository. Package is to compiled code.
12. What is plugins in maven, list some plugins.  
    Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. 
