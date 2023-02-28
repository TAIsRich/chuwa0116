1. Can you tell something about docker container?
- A Docker container is a lightweight, portable executable package that includes everything necessary to run an application, including code, dependencies, libraries, and runtime environment.
2. What are docker images?
- They are executable packages for the purpose of creating containers. Docker images can be deployed to any docker environment and the containers can be spun up there to run the application.
3. What is a DockerFile?
- A Dockerfile is a text file that contains a set of commands for building a Docker image.
4. Can you tell what is the functionality of a hypervisor?
- A hypervisor is a virtualization technology that allows multiple virtual machines to run on a single physical host machine.
5. What can you tell about Docker Compose?
- Docker Compose is used for creating multi-container Docker applications. It uses a YAML file to define the services, networks, and volumes required for the application.
6. Can you tell something about docker namespace?
- Docker namespace is a feature that allows for isolation and separation of resources within a Docker container. Examples for namespace types that are currently being supported by Docker – PID, Mount, User, Network, IPC
7. What is the docker command that lists the status of all docker containers?
```
docker ps -a
```
8. On what circumstances will you lose data stored in a container?
- The data of a container remains in it until and unless you delete the container
9. What is docker image registry?
- A Docker image registry is a place where Docker images can be stored, shared, and distributed.
10. How many Docker components are there?
- There are three docker components, they are - Docker Client, Docker Host, and Docker Registry.
- Docker Client: This component performs “build” and “run” operations for the purpose of opening communication with the docker host.
- Docker Host: This component has the main docker daemon and hosts containers and their associated images. The daemon establishes a connection with the docker registry.
- Docker Registry: This component stores the docker images. There can be a public registry or a private one. The most famous public registries are Docker Hub and Docker Cloud.
11. What is a Docker Hub?
- Docker Hub is a cloud-based repository where Docker images can be stored, shared, and distributed.
12. What command can you run to export a docker image as an archive?
```docker save -o <exported_name>.tar <container-name> ```
13. What command can be run to import a pre-exported Docker image into another Docker host?
```docker load -i <export_image_name>.tar```
14. Can a paused container be removed from Docker?
- No, it is not possible! A container MUST be in the stopped state before we can remove it.
15. What command is used to check for the version of docker client and server?
```docker version```
16. Differentiate between virtualization and containerization
- Virtualization and containerization are both technologies used for creating isolated environments, but virtualization uses a hypervisor to create virtual machines with their own operating systems, while containerization uses a single operating system with multiple containers.
17. Differentiate between COPY and ADD commands that are used in a Dockerfile?
- The COPY command copies files from the host machine to the container, while the ADD command can also copy files, but it can also download files from URLs and unpack compressed files.
18. Can a container restart by itself?
- yes ```docker run -dit — restart [restart-policy-value] [container_name]```
19. Can you tell the differences between a docker Image and Layer?
- Image: This is built up from a series of read-only layers of instructions.
- Layer: Each layer corresponds to an instruction of the image’s Dockerfile.
- A Docker image is a collection of layers, where each layer contains a specific set of changes to the image.
20. What is the purpose of the volume parameter in a docker run command?
- The --volume parameter in a docker run command is used to create and mount a Docker volume to the container, providing persistent storage.
21. Where are docker volumes stored in docker?
- Docker volumes are stored in the Docker host's file system, under the /var/lib/docker/volumes/ directory.
22. What does the docker info command do?
- The command gets detailed information about Docker installed on the host system.
23. Can you tell the what are the purposes of up, run, and start commands of docker compose?
- docker-compose up command is used to create and start the containers
- docker-compose run command is used to run one-time commands
- docker-compose start command is used to start stopped containers.
24. What are the basic requirements for the docker to run on any system?
- Windows 10 64bit with 2GB RAM space
25. Can you tell the approach to login to the docker registry?
- Using the `docker login` command credentials to log in to their own cloud repositories can be entered and accessed
26. List the most commonly used instructions in Dockerfile?
- FROM, RUN, CMD, EXPOSE, ENV, ADD, and COPY.
27. Can you differentiate between Daemon Logging and Container Logging?
- Daemon logging is used to collect logs from the Docker daemon, while container logging is used to collect logs from a specific container.
28. What is the way to establish communication between docker host and Linux host?
- This can be done using networking by identifying the “ipconfig” on the docker host.
29. What is the best way of deleting a container?
- docker stop <container_id>
- docker rm <container_id>
30. Can you tell the difference between CMD and ENTRYPOINT?
- CMD command provides executable defaults for an executing container.
- ENTRYPOINT specifies that the instruction within it will always be run when the container starts
31. Can we use JSON instead of YAML while developing docker-compose file in Docker?
- Yes! It can be used. In order to run docker-compose with JSON, `docker-compose -f docker-compose.json up` can be used
32. How many containers you can run in docker and what are the factors influencing this limit?
- There is no clearly defined limit to the number of containers but limit by The size of the app and the CPU resources available. 
33. Describe the lifecycle of Docker Container?
- Created: This is the state where the container has just been created new but not started yet.
- Running: In this state, the container would be running with all its associated processes.
- Paused: This state happens when the running container has been paused.
- Stopped: This state happens when the running container has been stopped.
- Deleted: In this, the container is in a dead state.
34. How to use docker for multiple application environments?
- To use Docker for multiple application environments, you can create separate Dockerfiles or compose files for each environment and use the Docker CLI or Docker Compose to build and run the containers. You can also use environment variables to configure the application settings for each environment.
35. How will you ensure that a container 1 runs before container 2 while using docker compose?
- To ensure that container 1 runs before container 2 while using Docker Compose, you can use the depends_on option in your compose file. This option specifies the order in which containers should be started and ensures that container 1 is started before container 2. You can also use the healthcheck option to wait for container 1 to become healthy before starting container 2.