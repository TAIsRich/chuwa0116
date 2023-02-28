### Docker Basis

Name: Zijun Zhou

#### Basic Questions

##### 1. Can you tell something about docker container?
Docker containers basically contain an application and its relevant dependencies. And it shares the kernel and system resources with our host and other containers, but it's a separate system from our host. The main reason of using the docker containers is to try to avoid the need of installing complex infrastructure dependencies when deploying the infrastructure so that a container could run on any platform.

##### 2. What are docker images?
Docker images are used to create the docker containers, and it could be shipped to any platform so that the relevant docker container could be run there irrespective of their infrastructure dependencies.

##### 3.  What is a DockerFile?
A dockerfile is basically a text file that states the detailed steps of building a docker image.

##### 4.  Can you tell what is the functionality of a hypervisor?
Hypervisor is the prerequisite of running a visualized operating system. It's basically used to divide the resources of the host so that each guest environment could get their own resources.

##### 5.  What can you tell about Docker Compose?
Docker Compose is basically a yaml file that states how multiple containers run, and communicate with each other. And we could expose the relevant ports of different containers to enable the communication.

##### 6. Can you tell something about docker namespace?
Docker namespace is a linux feature that actually enables OS resources to be partitioned in a mutually exclusive manner, which is the reason why the different containers in Docker could work separately, and isolate different containers. In addition, this mechanism also presents the containers to affect the underlying host.

##### 7. What is the docker command that lists the status of all docker containers?
We could use the following command
```
docker ps -a
```

##### 8. On what circumstances will you lose data stored in a container?
If we delete the container, and the container's file does not persist in our local disk.

##### 9. What is docker image registry?
Docker Image Registry basically contains multiple images for developers to download. Developers do not need to go through the complicated process of constructing a docker image, instead, he could just download. Docker registry could be public and private, and Docker Hub is a very popular registry

##### 10. How many Docker components are there?
There are basically three components in Docker.
- Docker Client: This is used to open communication with the Docker hosts, we could use docker run, pull, build, etc, to run the containers or build the images.
- Docker Host: This hosts the main daemon and the images and containers. It could initialize the communication with the Docker Registry.
- Docker Registry: This is where multiple docker images are stored, and it could be private or public. And Docker Hub and Docker Cloud are the most known docker registries.


##### 11. What is a Docker Hub?
Docker Hub is basically a public Docker Registry provided by Docker to enable developers to push, share and find their docker images. By docker push, people could directly push their own docker images.

##### 12. What command can you run to export a docker image as an archive?
We could simply use the following command:
```
docker save -o <exported_name>.tar <container-name>
```

##### 13. What command can be run to import a pre-exported Docker image into another Docker host?
We could simply use the following command:
```
docker load -i <export_image_name>.tar
```

##### 14. Can a paused container be removed from Docker?
No, we should first stop our Docker containers.

##### 15. What command is used to check for the version of docker client and server?
We could use the following command to get both the client and server information of our Docker
```
docker version
```
If we only want to get the information of our server, we could run the following command:
```
docker version --format '{{.Server.Version}}'
```

##### 16. Differentiate between virtualization and containerization.



##### 17. Differentiate between COPY and ADD commands that are used in a Dockerfile?
COPY and ADD basically have the same functionality, which is to copy the file to our container. However, COPY is much more preferred considering that it's more clear and transparant with the only function of copying the local files to our containers. However, the ADD contains more advanced functions, such as COPY files through URL, and the extraction from TAR files.

##### 18. Can a container restart by itself?
Yes, we can specify the restart policy while starting our container:
- Off: the container would not restart even the container stops or fails
- On-failure: the container would restart if the container fails to execute its tasks
- Unless-stopped: the container would restart, however if it's stopped by the user, it will stop
- Always: The container would always restart irrespective of the failure or stopping.

##### 19. Can you tell the differences between a docker Image and Layer?
Docker images are built on the several read-only layers. And different layers correspond to an instruction in the Dockerfile

##### 20. What is the purpose of the volume parameter in a docker run command?
The relevant command is as follows:
```
docker run -v host_path:docker_path <container_name>
```
The purpose is to map the host path to the docker_path so that any updates to the host path would be reflected in the docker containers, and any updates in the docker containers would be also reflected in the host path. In this way, even if the docker container is deleted, the important data would be persistently stored on the host path.

##### 21. Where are docker volumes stored in docker?
They are stored in the path of `/var/lib/docker/volumes/` in the host operating system

##### 22. What does the docker info command do?
It could show the information about the status of containers or images, and we could also see the hardware specifications of the containers, such as total memory allocated, speed of the processor, and the kernel version.

##### 23. Can you tell the what are the purposes of up, run, and start commands of docker compose?
- The up command can start or restart all the networks, services, and drivers associated with the app that are specified in the docker-compose.yml file. 
- The run command, the docker-compose can run one-off or ad-hoc tasks based on the business requirements. Here, the service name has to be provided and the docker starts only that specific service and also the other services to which the target service is dependent (if any).
- Using the start command, only those containers can be restarted which were already created and then stopped. This is not useful for creating new containers on its own.

##### 24. What are the basic requirements for the docker to run on any system?
The Docker could run on both Windows and Linux, and the basic hardware requirements are listed on the official website.

##### 25. Can you tell the approach to login to the docker registry?
We could use the following command to login to the docker registry
```
docker login
```

##### 26. List the most commonly used instructions in Dockerfile?
- FROM: this instruction is used to specify which image this image is based on, and the Dockerfile would be invalid if it does not start with FROM
- LABEL: This is used for the image organization based on projects, modules, or licensing. It also helps in automation as we specify a key-value pair while defining a label that can be later accessed and handled programmatically.
- RUN: This instruction is to execute the command on top of the current image, for each RUN command execution. we would add layers on top of the image, and then use that in subsequent steps
- CMD: This command is used to provide the default values of the executing container. And if there exist multiple CMD commands, only the last one would be executed.

##### 27. Can you differentiate between Daemon Logging and Container Logging?
- Daemon Level: It has four levels:
  1. Debug: It contains all the data during the execution of the daemon process
  2. Info: It contains the information and the error information during the execution of the daemon process
  3. Errors: It contains the errors 
  4. Fatal: only contains the fatal errors

- Container Level:
We could use the following two commands to see the Container Level logs:
```
sudo docker run –it <container_name> /bin/bash
sudo docker logs <container_id>
```

##### 28. What is the way to establish communication between docker host and Linux host?
This could be finished by identifying the `ipconfig` on the docker host.

##### 29. What is the best way of deleting a container?
We could use the following two commands:
```
docker stop <container_id>
docker rm <container_id>
```

##### 30. Can you tell the difference between CMD and ENTRYPOINT?
CMD command provides executable defaults for an executing container. In case the executable has to be omitted then the usage of ENTRYPOINT instruction along with the JSON array format has to be incorporated.
ENTRYPOINT specifies that the instruction within it will always be run when the container starts. 
This command provides an option to configure the parameters and the executables. If the DockerFile does not have this command, then it would still get inherited from the base image mentioned in the FROM instruction.
The most commonly used ENTRYPOINT is /bin/sh or /bin/bash for most of the base images.

##### 31. Can we use JSON instead of YAML while developing docker-compose file in Docker?
We could use JSON by switching to the following command:
```
docker-compose -f docker-compose.json up
```

##### 32. How many containers you can run in docker and what are the factors influencing this limit?
Actually, there are no specific limitations to the number of containers we could run. It all depends on the hardware of your machine. If permitted, we could run a huge number of Docker containers.

##### 33. Describe the lifecycle of Docker Container?
- Created: This is the state that the container is just created but not started
- Running: This is the state in which the container is now started
- Paused: This means that the currently executing container has been paused
- Stopped: This means that the currently executing container has been stopped
- Deleted: This means that this container has been deleted

##### 34. How to use docker for multiple application environments?
We could use Docker-compose
##### 35. How will you ensure that a container 1 runs before container 2 while using docker compose?
Docker-compose does not wait for any container to be “ready” before going ahead with the next containers. In order to achieve the order of execution, we can use:
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