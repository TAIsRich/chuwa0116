# HW1 - Hao Jia

### Practice git using the platform. list the git commands you learned
| Git Commands | 
|--------------|
| `git commit` | 
| `git branch` |
| `git merge`  |
| `git pull`   | 
| `git push`   | 
| `git stash`  |

### What is the basic steps to init a git repo in you local ?

1. Navigate to the directory where you want to create the repository using the command line.
2. Run the command `git init` to initialize an empty repository. 
3. Add your files to the repository by running the command `git add <file>` for each file you want to add.
4. Commit your changes by running the command `git commit -m <message>` where message is a brief description of the changes you made.

### How to clone a repo from Github ?
`git clone <repo_url>`, Where <repo_url> is the URL of the repository you want to clone. The URL can be either HTTPS or SSH based on the type of authentication you have set up.

### How to create a new branch and checkout to that branch ?
1. To create a new branch in git: `git branch <branch_name>` and switch to newly created branch: `git checkout <branch_name>`
2. Create a new branch and switch to it in one command: `git checkout -b <branch_name>` in one step.

### How to merge the branch_test to master branch in command ? show me the commands
1. First, make sure that you are on the "master" branch by running the command: `git checkout master`
2. Next, make sure that your local "master" branch is up-to-date with the remote "master" branch by running the command: `git pull origin master`
3. Now you can merge "branch_test" into "master" by running the command: `git merge branch_test`
4. After resolving the conflicts if any, you can push the changes to the remote repository by running the command: `git push origin master`

### How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
Commands way:
1. Stash the new code by running the command: `git stash save "my stash"`
2. Check out to a different branch by running the command: `git checkout <another_branch>`
3. When you are ready to return back to the "branch_learn_stash" branch, you can check out to that branch by running the command: `git checkout branch_learn_stash`
4. Apply the stash to the branch by running the command: `git stash apply "my stash"`

IntelliJ way:
1. Go to Local Changes on the right side of the screen 
2. Right-click on the changes and select the option “Stash Changes” 
3. Give your stash a name, then click on the “Stash” button. 
4. Now you can switch to another branch or do whatever you need to do.
5. When you're ready to return to your previous branch, go to the VCS menu at the top of the screen and select Git > Stashes.
6. Click on the stash you want to apply and then click on the “Apply” button.
### How do you understand PR is based on Branch?
A pull request (PR) is a way to propose changes to a project on a code hosting platform like GitHub. It is based on a branch, because it allows you to propose changes to a specific branch of a repository.

When you create a pull request, you are essentially suggesting that the changes you have made in your branch be merged into the branch that you are proposing the changes to. The branch that you are proposing the changes to is known as the "target branch" or "base branch".

The process of creating a PR usually starts by creating a new branch from the target branch, making changes to the code in that branch, and then submitting a PR to propose those changes be merged into the target branch.

Once a PR is created, the changes in the branch are reviewed by the other collaborators or maintainers of the project, who can provide feedback, ask for changes or approve the request. Once the changes are approved, the branch can be merged into the target branch.

It's worth noting that a PR can also be created from a fork of the repository, in this case, the target branch is the branch in the original repository and the branch from the fork will be merged into the target branch after review.

In summary, a pull request is a way of proposing changes to a specific branch of a repository, and it allows other collaborators to review and approve the changes before they are merged into the target branch.





### What is maven role ? what it is used to do ?
Maven's main role is to help automate the process of building, testing, and deploying software. It does this by providing a standard way of managing dependencies, compiling code, running tests, creating documentation, and more.

Maven uses a project object model (POM) to manage the different aspects of a project. The POM is an XML file that contains information about the project, such as the project's name, version, and dependencies. This information is used by Maven to determine how to build the project and what resources are needed.

Maven also provides a set of plugins that can be used to perform specific tasks, such as compiling code, running tests, creating a jar file, and more. These plugins can be configured in the POM file to be executed at different stages of the build process.

Some of the main features of Maven are:

Dependency management: Maven makes it easy to manage the libraries and frameworks a project depends on. It can automatically download and update dependencies as needed.
Build Automation: Maven provides a consistent way to build a project, regardless of the project's size or complexity.
Project Structure: Maven enforces a standard project structure, which makes it easy to understand and navigate a project.
Reporting: Maven can generate reports on the project's tests, code quality, and more.
In summary, Maven is a powerful tool that helps automate the process of building, testing, and deploying software. It provides a standard way of managing dependencies, compiling code, running tests, creating documentation, and more. It is widely used in the Java community to manage the building of Java projects, but it also supports other JVM languages such as Scala, Groovy, and Kotlin.

### What is the lifecycle of maven? could you tell me the details ?
From: [Introduction to the Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

Maven defines a set of standard lifecycle phases that are executed in a specific order. These phases form the backbone of the build process and provide a consistent and predictable way of building a project. The main phases are :

validate: validate that the project is correct and all necessary information is available.
compile: compile the source code of the project.
test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed.
package: take the compiled code and package it in its distributable format, such as a JAR.
verify: run any checks to verify the package is valid and meets quality criteria.
install: install the package into the local repository, for use as a dependency in other projects locally.
deploy: copies the final package to the remote repository for sharing with other developers and projects.
It's worth noting that not all of these phases are required for all projects, and not all plugins execute in each phase. However, the order in which the phases are executed is important, as it defines the dependencies between the phases. For example, the "compile" phase depends on the "validate" phase, and the "test" phase depends on the "compile" phase.

Additionally, Maven also provides a set of predefined goals, which are bound to the phases of the lifecycle. For example, the compile phase has a default goal of compiler:compile which compiles the source code of the project. A goal represents a specific task that can be executed, such as compiling code, running tests, creating a jar file, etc.

Maven also allows you to create custom lifecycle by adding new phases and goals to the build process. This can be useful for projects that have unique requirements that are not covered by the standard lifecycle.

In summary, the Maven lifecycle is a set of standard phases that are executed in a specific order to build a project. These phases provide a consistent and predictable way of building a project, and they can be extended with custom phases and goals for projects with unique requirements.

### what is the difference between package and install in maven lifecycle ?
The "package" phase is responsible for taking the compiled code and packaging it in a distributable format, such as a JAR file. This phase is typically used to create a version of the software that can be distributed and used by other systems or applications.

The "install" phase, on the other hand, is responsible for installing the packaged software into the local repository. This is the location on your local machine where Maven stores the dependencies for your projects. By installing the package into the local repository, it can be used as a dependency in other projects that you are working on locally.

The main difference between these two phases is the location where the package is stored. The "package" phase creates a distributable version of the software, while the "install" phase installs the package into the local repository.

It's worth noting that the "install" phase is typically run after the "package" phase, as the package needs to be created before it can be installed. However, you can run the "install" phase independently if you want to install the package without packaging it first.

In summary, the "package" phase is responsible for packaging the compiled code into a distributable format, while the "install" phase is responsible for installing the package into the local repository. These phases serve different purposes, but they are typically run in conjunction with each other.

### What is plugins in maven? List some plugins.
In Maven, a plugin is a collection of one or more goals that perform specific tasks. Plugins are executed during the build process and provide functionality such as compiling code, running tests, creating a JAR file, and more.

Plugins are defined in the project's POM file and are bound to the phases of the Maven lifecycle. This means that a plugin's goals can be executed during specific phases of the build process, such as the "compile" or "test" phase.

Some common plugins in Maven are:

`The Compiler Plugin`: This plugin is used to compile the source code of the project. It has goals for compiling the code, setting the source and target versions, and more.

`The Surefire Plugin`: This plugin is used to run unit tests for the project. It has goals for running tests, generating reports, and more.

`The Jar Plugin`: This plugin is used to create a JAR file for the project. It has goals for creating the JAR, setting the manifest, and more.

`The Javadoc Plugin`: This plugin is used to generate Javadocs for the project. It has goals for generating Javadocs, creating a JAR, and more.

`The Resources Plugin`: This plugin is used to copy resources to the target directory. It has goals for copying resources and filtering resources.

These are just a few examples of the many plugins available in Maven. There are also many third-party plugins that can be used to provide additional functionality, such as generating code coverage reports, creating a WAR file, and more.

In summary, a plugin in Maven is a collection of one or more goals that perform specific tasks during the build process. Plugins are defined in the project's POM file, and they are bound to the phases of the Maven lifecycle. Some common plugins in Maven are the Compiler Plugin, the Surefire Plugin, the Jar Plugin, the Javadoc Plugin, and the Resources Plugin.
