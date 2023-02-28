1. Can you tell something about docker container?
It is a runtime instance of docker image.
2. What are docker images?
They are executable packages for the purpose of creating containers.
3. What is a DockerFile?
It is a text file that has all commands which need to be run for building a given image.
4. Can you tell what is the functionality of a hypervisor?
A hypervisor divides the resources of the host system and allocates them to each guest environment installed.
5. What can you tell about Docker Compose?
Docker-compose is used for creating multiple containers, host them and establish communication between them.
6. Can you tell something about docker namespace?
 In docker, the namespaces ensure that the containers are portable and they don't affect the underlying host. 
7. What is the docker command that lists the status of all docker containers?
docker ps -a
8. On what circumstances will you lose data stored in a container?
When you delete the container.
9. What is docker image registry?
A Docker image registry is an area where the docker images are stored.
10. How many Docker components are there?
There are three docker components, they are - Docker Client, Docker Host, and Docker Registry.
11. What is a Docker Hub?
It is a public cloud-based registry provided by Docker for storing public images.
12. What command can you run to export a docker image as an archive?
docker save -o <exported_name>.tar <container-name>
13. What command can be run to import a pre-exported Docker image into another Docker host?
docker load -i <export_image_name>.tar
14. Can a paused container be removed from Docker?
No. A container MUST be in the stopped state before we can remove it.
15. What command is used to check for the version of docker client and server?
    * The command used to get all version information of the client and server is the docker version.
    * To get only the server version details, we can run docker version --format '{{.Server.Version}}'
16. Differentiate between virtualization and containerization.
Virtualization aims to run multiple OS instances on a single server, whereas containerization runs a single OS instance, with multiple user spaces to isolate processes from one another
17. Differentiate between COPY and ADD commands that are used in a Dockerfile?
COPY provides just the basic support of copying local files into the container whereas ADD provides additional features like remote URL and tar extraction support.

18. Can a container restart by itself?
Yes, it is possible only while using certain docker-defined policies while using the docker run commands(On-failure,  Unless-stopped, Always).

19. Can you tell the differences between a docker Image and Layer?
Image is built up from a series of read-only layers of instructions. Layer is also an image but it is the image of the instructions run.

20. What is the purpose of the volume parameter in a docker run command?
The volume parameter is used for syncing a directory of a container with any of the host directories.

21. Where are docker volumes stored in docker?
Volumes are created and managed by Docker and cannot be accessed by non-docker entities. 

22. What does the docker info command do?
The command gets detailed information about Docker installed on the host system.

23. Can you tell the what are the purposes of up, run, and start commands of docker compose?
    * Using the up command for keeping a docker-compose up, we can start or restart all the networks, services, and drivers associated with the app that are specified in the docker-compose.yml file.
    * Using the run command, the docker-compose can run one-off or ad-hoc tasks based on the business requirements. 
    * Using the start command, only those containers can be restarted which were already created and then stopped.

24. What are the basic requirements for the docker to run on any system?
Docker can run on both Windows and Linux platforms.

25. Can you tell the approach to login to the docker registry?
Using the docker login command credentials to log in to their own cloud repositories can be entered and accessed.

26. List the most commonly used instructions in Dockerfile?
FROM, LABEL, RUN, CMD

27. Can you differentiate between Daemon Logging and Container Logging?
    * Daemon Level: This kind of logging has four levels- Debug, Info, Error, and Fatal.
    * Container Level: Container level logging can be done using the command: sudo docker run –it <container_name> /bin/bash 

28. What is the way to establish communication between docker host and Linux host?
This can be done using networking by identifying the “ipconfig” on the docker host. This command ensures that an ethernet adapter is created as long as the docker is present in the host.

29. What is the best way of deleting a container?
    - docker stop <container_id>
    - docker rm <container_id>

30. Can you tell the difference between CMD and ENTRYPOINT?
CMD command provides executable defaults for an executing container. ENTRYPOINT specifies that the instruction within it will always be run when the container starts. 

31. Can we use JSON instead of YAML while developing docker-compose file in Docker?
Yes! It can be used. In order to run docker-compose with JSON, docker-compose -f docker-compose.json up can be used。

32. How many containers you can run in docker and what are the factors influencing this limit?
It all depends on the hardware restrictions.

33. Describe the lifecycle of Docker Container?
The most important stages are:
    * Created: This is the state where the container has just been created new but not started yet.
    * Running: In this state, the container would be running with all its associated processes.
    * Paused: This state happens when the running container has been paused.
    * Stopped: This state happens when the running container has been stopped.
    * Deleted: In this, the container is in a dead state

34. How to use docker for multiple application environments?
In the docker-compose file, we can define multiple services, networks, and containers along with the volume mapping in a clean manner, and then we can just call the command “docker-compose up”.

35. How will you ensure that a container 1 runs before container 2 while using docker compose?
Docker-compose does not wait for any container to be “ready” before going ahead with the next containers. In order to achieve the order of execution, we can use:
    * The “depends_on” which got added in version 2 of docker-compose can be used as shown in a sample docker-compose.yml file below:
        ```
        version: "2.4"
        services:
        backend:
        build: .
        depends_on:
            - db
        db:
        image: postgres
        ```
    The introduction of service dependencies has various causes and effects:

    * The docker-compose up command starts and runs the services in the dependency order specified. For the above example, the DB container is started before the backend.
    * docker-compose up SERVICE_NAME by default includes the dependencies associated with the service. In the given example, running docker-compose up backend creates and starts DB (dependency of backend).
    * Finally, the command docker-compose stop also stops the services in the order of the dependency specified. For the given example, the backend service is stopped before the DB service.