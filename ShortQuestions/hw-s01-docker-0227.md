### 1. Can you tell something about docker container?
Docker containers are runtime instances of docker images consist of applications and all their dependencies. They run as isolated systems in the host operating system. Docker containers get rid of the infrastructure dependency while deploying and running applications.

### 2. What are docker images?
Docker images are executable packages to create containers. They can be deployed to any docker environment and the containers can be spun up there to run the application.

### 3. What is a DockerFile?
It is a text file that has all commands which need to be run for building a given image.

### 4. Can you tell what is the functionality of a hypervisor?
A hypervisor is a software that makes virtualization happen because of which is sometimes referred to as the Virtual Machine Monitor. This divides the resources of the host system and allocates them to each guest environment installed.


### 5. What can you tell about Docker Compose?
It is a YAML file consisting of all the details regarding various services, networks, and volumes that are needed for setting up the Docker-based application. So, docker-compose is used for creating multiple containers, host them and establish communication between them. For the purpose of communication amongst the containers, ports are exposed by each and every container.

### 6. Can you tell something about docker namespace?
Namespace ensures OS resources partition in a mutually exclusive manner. In docker, the namespaces ensure that the containers are portable and they don't affect the underlying host.

### 7. What is the docker command that lists the status of all docker containers?
`docker ps -a`

### 8. On what circumstances will you lose data stored in a container?
When the container is deleted.

### 9. What is docker image registry?
A Docker image registry is an area where the docker images are stored. Instead of converting the applications to containers each and every time, a developer can directly use the images stored in the registry.

### 10. How many Docker components are there?
There are three docker components: Docker Client, Docker Host, and Docker Registry.

- **Docker Client:** This component performs “build” and “run” operations for the purpose of opening communication with the docker host.
- **Docker Host:** This component has the main docker daemon and hosts containers and their associated images. The daemon establishes a connection with the docker registry.
- **Docker Registry:** This component stores the docker images. There can be a public registry or a private one. The most famous public registries are Docker Hub and Docker Cloud.

### 11. What is a Docker Hub?
It is a public cloud-based registry provided by Docker for storing public images of the containers along with the provision of finding and sharing them. We use the `dock push` command to push the images to Docker Hub.

### 12. What command can you run to export a docker image as an archive?
`docker save -o <exported_name>.tar <container-name>`

### 13. What command can be run to import a pre-exported Docker image into another Docker host?

 `docker load -i <export_image_name>.tar`

### 14. Can a paused container be removed from Docker?
No. A container MUST be in the stopped state before we can remove it.

### 15. What command is used to check for the version of docker client and server?
- `docker version`

    The command used to get all version information of the client and server.
- `docker version --format '{{.Server.Version}}'`
    
    To get only the server version details.

### 16. Differentiate between virtualization and containerization.
Virtualization:

- helps developers to run and host multiple OS on the hardware of a single physical sever;
- hypervisor provides overall virtual machines to the guest OS;
- virtual machines form an abstraction of the system hardware layer means that each virtual machine on the host acts as a real physical machine. Containerization:

Containerization:

- helps developers to run multiple applications using the same OS on a single vietual machine or server;
- containers ensure isolated environment are provided for running the application. Any changes done within the container do not affect the host or other containers of the same host;
- containers form abstraction of the application layer which means that each container constitutes a different application.

### 17. Differentiate between COPY and ADD commands that are used in a Dockerfile?
`COPY` means copy local file to the container whereas `ADD` provides additional features like URL and tar extraction support.

`COPY` is more preferred because of its higher transparency level than of `ADD`.

### 18. Can a container restart by itself?
Yes, it is possible only while using certain docker-defined policies while using the docker run command.

- Off: In this, the container won’t be restarted in case it's stopped or it fails.
- On-failure: Here, the container restarts by itself only when it experiences failures not associated with the user.
- Unless-stopped: Using this policy, ensures that a container can restart only when the command is executed to stop it by the user.
- Always: Irrespective of the failure or stopping, the container always gets restarted in this type of policy.

These policies can be used as:
`docker run -dit - restart [restart-policy-value] [container_name]

### 19. Can you tell the differences between a docker Image and Layer?
**Image:** This is built up from a series of read-only layers of instructions. An image corresponds to the docker container and is used for speedy operation due to the caching mechanism of each step.

**Layer:** Each layer corresponds to an instruction of the image’s Dockerfile. In simple words, the layer is also an image but it is the image of the instructions run.

### 20. What is the purpose of the volume parameter in a docker run command?
The volume parameter is used for syncing a directory of a container with any of the host directories. Also ensures data security in case of container deletion. This ensures that even if the container is deleted, the data of the container exists in the volume mapped host location making it the easiest way to store the container data.

### 21. Where are docker volumes stored in docker?
They are stored in Docker host filesystem at `/var/lib/docker/volumes/`.

Volumes are created and managed by Docker and cannot be accessed by non-docker entities. 

### 22. What does the docker info command do?
The command gets detailed information about Docker installed on the host system. The information can be like what is the number of containers or images and in what state they are running and hardware specifications like total memory allocated, speed of the processor, kernel version, etc.

### 23. Can you tell the what are the purposes of up, run, and start commands of docker compose?

+ **Up**: Using up command for keeping a docker-compose up (ideally at all times), we can start or restart all the networks, services, and drivers associated with the app that are specified in the docker-compose.yml file. If the docker-compose are running up in the attached mode, we can get access to all the logs of the containers. If it is running in detached mode, then once the containers are started, it just exits and shows no logs.

+ **Run**:Using the run command, the docker-compose can run one-off or ad-hoc tasks based on the business requirements. Here, the service name has to be provided and the docker starts only that specific service and also the other services to which the target service is dependent (if any).

  This command is helpful for testing the containers and also performing tasks such as adding or removing data to the container volumes etc.

+ **Start**: Only containers which were created before and then stopped can be restarted. It cannot create new containers on its own.

### 24. What are the basic requirements for the docker to run on any system?
- For Windows, docker atleast needs Windows 10 64bit with 2GB RAM space. Docker can be installed by taking help of the toolbox for lower versions.
- For Linux, Docker can run on various Linux flavors such as Ubuntu >=12.04, Fedora >=19, RHEL >=6.5, CentOS >=6 etc.

### 25. Can you tell the approach to login to the docker registry?
Using the `docker login` command.

### 26. List the most commonly used instructions in Dockerfile?
- **FROM**: It is used to set the base image for upcoming instructions. A Dockerfile is valid if it starts with the FROM instruction.
- **LABEL**: It is used for the image organization based on projects, modules, or licensing. It is also used for annotations. We can specify a key-value pair while defining a label which can be later accessed and handled programmatically.
- **RUN**: It is used to execute followed instructions on the top of the current image in a new later. With each RUN command execution, we add layers on top of the image and then use that in subsequent steps. 
- **CMD**: It is used to provide default values of an executing container. If there are multiple CMD commands, only the last one will be considered.

### 27. Can you differentiate between Daemon Logging and Container Logging?
- **Daemon Logging**: There are four levels:
  + Debug: All the data which happened during the exectuion of the deamon process.
  + Info: All the information along with the error informationduring the exectuion of the deamon process.
  + Error: All the errors which occurred during the exectuion of the deamon process.
  + Fatal: Fatal errors which occurred  during the exectuion of the deamon process.
- **Container Logging**:
  + Container level logging can be done using the command: `sudo docker run –it <container_name> /bin/bash`
  + In order to check for the container level logs, we can run the command: `sudo docker logs <container_id>`

### 28. What is the way to establish communication between docker host and Linux host?
We can use networking by identifying the "ipconfig" on the docker host. This ensures that an ethernet adapter will be created as long as the docker is present in the host.

### 29. What is the best way of deleting a container?
- `docker stop <container_id>`
- `docker rm <container_id>`

### 31. Can we use JSON instead of YAML while developing docker-compose file in Docker?
Yes. Use the command `docker-compose -f docker-compose.json up`.

### 32. How many containers you can run in docker and what are the factors influencing this limit?
There is no clearly defined limit to the number of containers that can be run within docker. But it all depends on the limitations - more specifically hardware restrictions. The size of the app and the CPU resources available are 2 important factors influencing this limit. In case your application is not very big and you have abundant CPU resources, then we can run a huge number of containers.

### 33. Describe the lifecycle of Docker Container?
- Created: This is the state that the container has just been created but not started yet.
- Running: In this state, the container would be running with all its associated processes.
- Paused: This state happens when the running container has been paused
- Stopped: This state happens when the running container has been stopped
- Deleted: The container has been deleted

### 34. How to use docker for multiple application environments?
We could use Docker-compose

### 35. How will you ensure that a container 1 runs before container 2 while using docker compose?
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