### What are the basic steps to init a git repo in your local?

1. Open a terminal or command prompt.
2. Navigate to the local directory where you want to create the repository.
3. Initialize the repository using the command `git init`. This will create a new subdirectory named ".git" that contains all of the necessary repository files.
4. Optionally, you can also create a new file or add files to the repository by using the command `git add <file>` or `git add .` to add all files in the current directory.
5. Commit the changes to the repository using the command `git commit -m "Initial commit"` and add a commit message.
6. You can then push the changes to a remote repository using the command `git push <remote> <branch>` where remote is the name of the remote repository and branch is the name of the branch you want to push to.

### How to clone a repo from Github?

1. Open a terminal or command prompt.
2. Use the command `git clone <repository URL>` to clone the repository. The repository URL can be found on the GitHub website by clicking the "Clone or download" button and copying the URL.
3. Once the cloning process is complete, a new subdirectory with the same name as the repository will be created in your local directory, and the repository will be fully functional and ready to use.

### How to create a new branch and checkout to that branch?

1. Open a terminal or command prompt.
2. Navigate to the local directory of the repository you want to create the new branch in.
3. Use the command `git branch <branch name>` to create a new branch. For example, `git branch new-feature` will create a new branch named "new-feature".
4. To switch to the new branch, use the command `git checkout <branch name>`. For example, `git checkout new-feature` will switch to the "new-feature" branch.
5. Alternatively, you can create a new branch and switch to it in one command by using `git checkout -b <branch name>` command. For example, `git checkout -b new-feature` will create a new branch named "new-feature" and switch to it.
6. Once you switch to the new branch, you can make changes, commit them and push the new branch to the remote repository using `git push origin <branch name>`.

### How to merge the branch_test to master branch in command? Show me the commands.

1. First, make sure you are in the `master` branch by running the command `git checkout master`.
2. Next, fetch the latest changes from the remote repository by running the command `git pull origin master`.
3. Now, switch to the `branch_test` branch by running the command `git checkout branch_test`.
4. Next, pull the latest changes from the `branch_test` by running the command `git pull origin branch_test`.
5. Then, switch back to the `master` branch by running the command `git checkout master`.
6. Now, merge the changes from the `branch_test` branch into the `master` branch by running the command `git merge branch_test`.
7. Finally, push the changes to the remote repository by running the command `git push origin master`.

This way you will avoid any conflicts that may arise from merging branches with a different code base.

### What does stash do?

`git stash` is a command in Git that allows you to temporarily save changes that you have made to your working directory, but have not yet committed. This is useful when you need to switch branches, but don't want to commit your changes or throw them away. Stashing your changes allows you to save them for later, and apply them again once you are ready to continue working on them.

The `git stash` command creates a new stash with a unique name, and saves the changes in your working directory to that stash. You can then switch branches, make other changes, and come back to your original changes later.

You can also list all your stashes, apply a specific stash, drop a specific stash or clear all the stashes using `git stash list`, `git stash apply`, `git stash drop` and `git stash clear` respectively.

It is important to note that stashing does not save the changes permanently, it just saves them temporarily, so you will need to reapply them or commit them when you want to use them again.

### How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash? Try commands way and intellij way.

To do this in command line:

1. To stash your new code, run the command `git stash save "Stash message"`. You can add a message to describe the stash, it will help you to identify the stash later.
2. To switch to another branch, you can run the command `git checkout other_branch`
3. To switch back to the `branch_learn_stash` branch, you can run the command `git checkout branch_learn_stash`
4. To apply the stash and bring back the new code, you can run the command `git stash apply` or `git stash pop` command. The pop command will remove the stash after applying it, while the apply command will keep the stash in case you need it again.
5. To see the list of all the stashes, you can run the command `git stash list` and use the stash@{index} to apply the specific stash.

To do this in IntelliJ:

To save changes to a stash:

1. From the main menu, choose Git | Uncommitted Changes | Stash Changes.
2. In the Stash dialog that opens, select the appropriate Git root and make sure that the correct branch is checked out.
3. In the Message field describe the changes you are about to stash.
4. To stash local changes and bring the changes staged in the index to your working tree for examination and testing, select the Keep index option.
5. Click Create Stash.

To apply a stash:

1. From the main menu, choose Git | Uncommitted Changes | Unstash Changes.

2. Select the Git root where you want to apply a stash, and make sure that the correct branch is checked out.

3. Select the stash you want to apply from the list.

   If you want to check which files are affected in the selected stash, click View.

4. To remove the selected stash after it is applied, select the Pop stash option.

5. To apply stashed index modifications as well, select the Reinstate Index option.

6. If you want to create a new branch on the basis of the selected stash instead of applying it to the branch that is currently checked out, type the name of that branch in the As new branch field.

To remove a stash, select it in the list and click Drop. To remove all stashes, click Clear.

### How do you understand "PR is based on Branch"?

"PR is based on Branch" means that a Pull Request (PR) in Git is created based on the changes made in a specific branch.

### What is Maven's role? What is it used to do?

Maven is a build automation tool primarily used for Java projects. It is used to manage and automate the process of building, testing, and deploying software.

Maven's primary role is to make the build process easy and efficient. It does this by providing a consistent way to manage dependencies, compile code, run tests, and package software. Maven uses a declarative approach to describe the build process, which makes it easy to understand and maintain.

Maven uses a central repository to manage dependencies, which means that developers don't have to manually manage the jars and libraries that their code depends on. Instead, Maven will automatically download the necessary dependencies from the central repository and add them to the classpath. This makes it easy to manage dependencies across multiple projects and ensures that everyone is using the same version of a library.

Maven also provides a standard directory structure for Java projects, which makes it easy for developers to understand the structure of a project and find the files they need.

In summary, Maven is a tool that helps to automate the build process for Java projects. It provides a consistent way to manage dependencies, compile code, run tests, and package software. It also makes it easy to understand and maintain the build process by using a declarative approach and providing a standard directory structure.

### What is the lifecycle of maven? Could you tell me the details?

Maven has several built-in lifecycles that define the order in which the build process is executed. These lifecycles are the sequence of phases that Maven goes through to build, test and deploy a project. The default lifecycle is called the "default" lifecycle, and it has the following phases:

1. validate: validate the project is correct and all necessary information is available
2. compile: compile the source code of the project
3. test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
4. package: take the compiled code and package it in its distributable format, such as a JAR.
5. integration-test: process and deploy the package if necessary into an environment where integration tests can be run
6. verify: run any checks to verify the package is valid and meets quality criteria
7. install: install the package into the local repository, for use as a dependency in other projects locally
8. deploy: done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

Each phase in the lifecycle corresponds to a goal in Maven, and you can execute a specific goal by running the command `mvn <phase-name>:<goal-name>`, for example `mvn test:test` will execute the test goal during the test phase.

It's also possible to skip a phase by using the `-Dskip` option in the command line, like `mvn package -DskipTests` this command will skip the test phase during the package phase.

Additionally, Maven has other lifecycles that are less frequently used. Some examples are the clean lifecycle, which is used to clean up after a build, and the site lifecycle, which is used to generate documentation for a project.

In summary, Maven has several built-in lifecycles that define the order in which the build process is executed, the default lifecycle is the sequence of phases that Maven goes through to build, test and deploy a project. Each phase corresponds to a goal in Maven, and it is possible to skip a phase or execute a specific goal.

### What are the differences between package and install in maven lifecycle?

In the Maven build lifecycle, the `package` and `install` phases are both used to create a distributable version of the project, but they serve different purposes.

The `package` phase is used to take the compiled source code and package it in a distributable format, such as a JAR or WAR file. This file is typically used for distribution and deployment of the project. Once the package phase is completed, the packaged file is located in the target directory of the project.

The `install` phase, on the other hand, is used to install the package into the local repository, for use as a dependency in other projects. This means that the package file is copied to a location on the local machine where Maven can access it, and it can be used as a dependency in other Maven projects. The purpose of the install phase is to make the package available to other projects on the same machine, so that they can use the package as a dependency, without needing to rebuild it.

In summary, The `package` phase is used to create a distributable version of the project that can be deployed, while the `install` phase is used to make the package available to other projects on the same machine as a dependency. In general, after the package phase, the project is ready to be deployed, while after the install phase the project is ready to be consumed by other projects.

### What is plugins in maven? List some plugins.

In Maven, a plugin is a set of goals that can be executed to perform specific tasks. Plugins are used to extend the functionality of Maven, and they are typically used to perform tasks such as compiling code, running tests, creating documentation, and packaging software.

Plugins are defined in the `plugins` section of a project's POM file, and they are executed as part of the Maven build process.

Here are some examples of commonly used plugins in Maven:

1. `maven-compiler-plugin`: This plugin is used to compile the source code of the project. It supports different versions of the Java compiler and can be configured to use a specific version.
2. `maven-surefire-plugin`: This plugin is used to run tests for the project. It supports different testing frameworks, such as JUnit, TestNG, and more.
3. `maven-jar-plugin`: This plugin is used to create a JAR file from the compiled code. It can be configured to include specific files and resources in the JAR file.
4. `maven-javadoc-plugin`: This plugin is used to generate Java documentation for the project. It can be configured to include specific source files and packages.
5. `maven-source-plugin`: This plugin is used to create a source archive for the project. It can be configured to include specific source files and resources.
6. `maven-deploy-plugin`: This plugin is used to deploy the project to a remote repository. It can be configured to deploy to different types of repositories, such as Nexus, Artifactory, and more.
7. `maven-surefire-report-plugin`: This plugin is used to generate test reports for the project, with test results, coverage, statistics and more.

There are many more plugins available, depending on the needs of your project. Maven also allows you to create your own plugin or use third-party plugins.
