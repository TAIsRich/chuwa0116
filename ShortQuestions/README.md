1. 


2.


3.

4.

5.

6.

7.

8.

### 9. What is maven role ? what it be used to do?   
    Maven is a robust project management tool based on the POM (Project Object Model) architecture. It is used for project build, as well as for managing dependencies and documentation.

Its roles include:  
-  Manage Dependencies
-  Build Project (Cycle)
- Documentation
-  Reporting


    

    
    


### 10.



### 11. What is the difference between package and install in maven lifecycle?
- When running the command mvn package, it runs the commands for all lifecycle phases till package:     

    validate >> compile >> test (optional) >> package

- When running the command mvn install：

    validate >> compile >> test (optional) >> package >> verify >> install

So, install commands does everything that package does and some more ( install the package into the local respository, for use as a dependency in other projects locally)





### 12. What is plugins in maven, list some plugins  
    Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.

There are some pulgins: 

| Syntax      | Description |
| ----------- | ----------- |
| clean     | clean up after build |
| compiler   | compiles java source code        |
| deploy | deploys the artifact to the remote repository |
| install | installs the built artifact into the local repository   |
13.
    
