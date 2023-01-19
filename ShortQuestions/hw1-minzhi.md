# Homework 1

3. What is the basic steps to init a git repo in you local ?

**ANSWER:** The basic steps are

```bash
mkdir myapp && cd myapp
git init .
```

4. How to clone a repo from Github ?

```bash
git clone <repo_url>
```

5. How to create a new branch and checkout to that branch ?

```bash
git checkout -b <branch_name>
```

6. How to merge the `branch_test` to `master` branch in command ? show me the commands

```bash
git checkout master
git merge --no-ff branch_test -m 'merge branch_test into master branch without
fast forwarding'
```

7. How to stash your new code before leaving branch `branch_learn_stash` and pop your stash when you checkout back to `branch_learn_stash` ? try commands way and intellij way.

```bash
git stash  # all new changes will be stashed and we can leave branch safely
git stash list  # we can check all stashed context

# recover
git stash pop  # pop newest context
git stash apply stash@{id}  # recover context with specific stash id
```

8. How do you understand PR is based on Branch?

A pull request is indicating a branch to review compared to another.

9. What is maven role ? what it be used to do ?

Maven has two roles:
  - package management
  - automatic building system

It is used to manage packages the project may use (dependency) and to build our
project.

10. What is the lifecycle of maven? could you tell me the details ?

The lifecycle of maven is mvnClean -> prepare-resources -> validate -> package -> install

- prepare resources: resource copying
- validate: validate if the project is correct and dependencies are integrated.
- compile: compile source code into binary code.
- test (skip optionally): compiled source code suitable for testing
  framework.
- package: creates the JAR/WAR package as mentioned in the packaging in POM.xml.
- install: installs the package in local/remote maven repository.
- deploy: copies the final package to the remote repository.

11. what is the difference between package and install in maven lifecycle ?

Package phase will execute all phases prior to that & it will stop with packaging the project as a jar. Install phase will execute all prior phases & finally install the project locally for other dependent projects.

12. What is plugins in maven, list some plugins.

Maven is actually a plugin execution framework where every task is actually done
by plugins. Maven Plugins are generally used to − create jar file. create war
file.
