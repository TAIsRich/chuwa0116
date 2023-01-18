1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

# The largest heading
## The second largest heading
###### The smallest heading

Text that is not a quote

> Text that is a quote

Some basic Git commands are:
```
git status
git add
git commit
```

The background color should be `#ffffff` for light mode and `#0d1117` for dark mode.

This site was built using [GitHub Pages](https://pages.github.com/).

[Contribution guidelines for this project](docs/CONTRIBUTING.md)

![This is an image](https://myoctocat.com/assets/images/base-octocat.svg)

- George Washington
* John Adams
+ Thomas Jefferson

1. James Madison
2. James Monroe
3. John Quincy Adams

1. First list item
   - First nested list item
     - Second nested list item

- [x] #739
- [ ] https://github.com/octo-org/octo-repo/issues/740
- [ ] Add delight to the experience when all tasks are complete :tada:

@github/support What do you think about these updates?

@octocat :+1: This PR looks great - it's ready to merge! :shipit:

Here is a simple footnote[^1].

A footnote can also have multiple lines[^2].  

You can also use words, to fit your writing style more closely[^note].


<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://user-images.githubusercontent.com/25423296/163456776-7f95b81a-f1ed-45f7-b7ab-8fa810d529fa.png">
  <source media="(prefers-color-scheme: light)" srcset="https://user-images.githubusercontent.com/25423296/163456779-a8556205-d0a5-45e2-ac17-42d089e3c3f8.png">
  <img alt="Shows an illustrated sun in light mode and a moon with stars in dark mode." src="https://user-images.githubusercontent.com/25423296/163456779-a8556205-d0a5-45e2-ac17-42d089e3c3f8.png">
</picture>

<!-- This content will not appear in the rendered Markdown -->

Let's rename \*our-new-project\* to \*our-old-project\*.

2. practice git using the platform. list the git commands you learned

git commit

git checkout/git switch

git merge

git branch

git rebase

git revert

git diff

git remote

3. What is the basic steps to init a git repo in you local ?

git init

4. How to clone a repo from Github ?

git clone <url>

5. How to create a new branch and checkout to that branch ?

git checkout -b <name>

6. How to merge the branch_test to master branch in command ? show me the commands

git checkout master

git merge branch_test

7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
checkout back to **branch_learn_stash ? try commands way and intellij way.

git stash

git stash pop

8. How do you understand PR is based on Branch?

Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub. Once a pull request is opened, you can discuss and review the potential changes with collaborators and add follow-up commits before your changes are merged into the base branch.

9. What is maven role ? what it be used to do ?

Maven is chiefly used for Java-based projects, helping to download dependencies, which refers to the libraries or JAR files. The tool helps get the right JAR files for each project as there may be different versions of separate packages.

10. What is the lifecycle of maven? could you tell me the details ?

There are three main built-in build lifecycles: default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, while the site lifecycle handles the creation of your project's web site.

Details:

Validate: This step validates if the project structure is correct. For example: It checks if all the dependencies have been downloaded and are available in the local repository.

Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.

Test: It runs unit tests for the project.

Package: This step packages the compiled code in distributable format like JAR or WAR.

Integration test: It runs the integration tests for the project.

Verify: This step runs checks to verify that the project is valid and meets the quality standards.

Install: This step installs the packaged code to the local Maven repository.

Deploy: It copies the packaged code to the remote repository for sharing it with other developers.

11. what is the difference between package and install in maven lifecycle ?

Install: This step installs the packaged code to the local Maven repository.

Package: This step packages the compiled code in distributable format like JAR or WAR.

Package & install are various phases in maven build lifecycle. package phase will execute all phases prior to that & it will stop with packaging the project as a jar. Similarly install phase will execute all prior phases & finally install the project locally for other dependent projects.

12. What is plugins in maven, list some plugins.

What is a Plugin? "Maven" is really just a core framework for a collection of Maven Plugins. In other words, plugins are where much of the real action is performed, plugins are used to: create jar files, create war files, compile code, unit test code, create project documentation, and on and on.

clean compiler deploy ear ejb jar...

https://maven.apache.org/plugins/

