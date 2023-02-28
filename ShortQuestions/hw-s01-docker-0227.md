https://www.interviewbit.com/docker-interview-questions/#docker-basic-questions
1. Can you tell something about docker container?  
A Docker container is a standalone and executable package of software that includes everything needed to run an application or a service, such as code, runtime, libraries, and system tools. It is built from a Docker image, which is essentially a template or blueprint that defines the environment and configuration of the container. 
2. What are docker images?  
They are executable packages for creating containers. It can be deployed to all docker environment adn the containers can be spun up there to run the application.
3. What is a DockerFile?  
It is a text file which used to build Docker images. It contains a series of commands that are executed in order to create a Docker image.
4. Can you tell what is the functionality of a hypervisor?  
   A hypervisor is a type of virtualization software that enables multiple operating systems to share a single hardware host by creating and managing virtual machines (VMs). It allows multiple operating systems to run on a single physical machine, each operating system in its own isolated virtual environment. The hypervisor provides a layer of abstraction between the physical hardware and the virtual machine, allowing each VM to run its own guest operating system and applications as if it were running on its own dedicated hardware.   
The main functionality of a hypervisor is to manage the virtual machines and their resources, including CPU, memory, and storage. It also provides isolation and security between the virtual machines and their respective operating systems, preventing interference and potential conflicts between them. Additionally, hypervisors often provide features such as live migration, snapshots, and high availability to make it easier to manage and maintain the virtual environment.
5. What can you tell about Docker Compose?  
   Docker Compose is a tool used to define and run multi-container Docker applications. It allows developers to define all the services, networks, and volumes required for a complete application in a single YAML file, making it easy to manage and deploy complex applications. Docker Compose can be used to define and run applications in development, staging, and production environments, making it a valuable tool for building and deploying scalable and reliable applications. With Docker Compose, developers can easily manage multiple containers, networks, and volumes, and launch and scale services with a single command.
6. Can you tell something about docker namespace?  
   In Docker, namespaces are a feature of the Linux kernel that allows multiple isolated user-space instances (i.e., containers) to run on a single host. Each container runs in its own namespace, which isolates it from the host system and other containers. Namespaces provide a way to partition kernel resources such as network interfaces, file systems, process trees, and inter-process communication (IPC) mechanisms.

    Docker uses several namespaces, such as:

* PID namespace: isolates the process ID number space. 
* Network namespace: provides network isolation between containers. 
* Mount namespace: provides file system isolation between containers. 
* IPC namespace: isolates inter-process communication between containers. 
* UTS namespace: isolates hostname and domain name information.
7. What is the docker command that lists the status of all docker containers?  
   docker ps -a
8. On what circumstances will you lose data stored in a container?
When I delete my container
9. What is docker image registry?  
   A Docker image registry is a centralized storage and distribution system for Docker images. It allows developers to store and share Docker images, which can then be downloaded and used to create containers. There are several public and private Docker image registries available, including Docker Hub, Google Container Registry, and Amazon Elastic Container Registry. A registry can be used to share Docker images within an organization, across teams, or with the wider community. It is an essential component of a container-based infrastructure, as it provides a secure, scalable, and reliable way to manage Docker images.
10. How many Docker components are there?
* Docker Client: This component performs “build” and “run” operations for the purpose of opening communication with the docker host. 
* Docker Host: This component has the main docker daemon and hosts containers and their associated images. The daemon establishes a connection with the docker registry. 
* Docker Registry: This component stores the docker images. There can be a public registry or a private one. The most famous public registries are Docker Hub and Docker Cloud.
11. What is a Docker Hub?  
    Docker Hub is a cloud-based registry service for Docker images. It allows developers to store, share, and manage their Docker images and repositories with other team members or the broader Docker community.  
    The images can be pushed to Docker Hub through the `docker push` command.

12. What command can you run to export a docker image as an archive?  
`docker save -o <exported_name>.tar <container-name>`
13. What command can be run to import a pre-exported Docker image into another Docker host?  
`docker load -i <export_image_name>.tar`
14. Can a paused container be removed from Docker? 
No, we need to stop container first before we delete it.
15. What command is used to check for the version of docker client and server?
Docker Intermediate Interview Questions  
for all version we could use `docker version.`
for only the server version detail, we use `docker version --format '{{.Server.Version}}'`
16. Differentiate between virtualization and containerization.  
* Virtualization: In virtualization, a hypervisor is used to create multiple virtual machines (VMs) on a single physical machine. Each VM has its own operating system and runs as if it were a separate physical machine. This provides strong isolation between VMs and allows different operating systems to run on the same physical hardware. However, each VM requires its own set of resources, including CPU, memory, and disk space, which can lead to resource inefficiency.
* Containerization: In containerization, a container engine (such as Docker) is used to create multiple containers on a single host operating system. Each container shares the host operating system kernel, but has its own file system, libraries, and application code. This provides lightweight isolation between containers, with less overhead compared to virtualization. Containers are also more portable and can be easily moved between hosts.
17. Differentiate between COPY and ADD commands that are used in a Dockerfile? 
They are similar, but `COPY` is more preferred than `ADD`, because it has higher transparency level.  
    The COPY command simply copies files and directories from the host machine to the container's file system. On the other hand, the ADD command not only copies files and directories but also has additional features like automatic file extraction, downloading files from URLs, and copying files from remote files.
18. Can a container restart by itself?
yes, there are different policies that can be used with the --restart option, such as no, on-failure, always, unless-stopped, among others. The on-failure policy, for example, will restart the container only if it exits with a non-zero status code.  
`docker run -dit — restart [restart-policy-value] [container_name]`
19. Can you tell the differences between a docker Image and Layer?   
    Image: This is built up from a series of read-only layers of instructions. An image corresponds to the docker container and is used for speedy operation due to the caching mechanism of each step.

    Layer: Each layer corresponds to an instruction of the image’s Dockerfile. In simple words, the layer is also an image but it is the image of the instructions run.
20. What is the purpose of the volume parameter in a docker run command?   
    The syntax of docker run when using the volumes is: `docker run -v host_path:docker_path <container_name>`  
    The volume parameter is used for syncing a directory of a container with any of the host directories. Consider the below command as an example: `docker run -v /data/app:usr/src/app myapp`  
    The above command mounts the directory  `/data/app` in the host to the `usr/src/app` directory. We can sync the container with the data files from the host without having the need to restart it.  
    This also ensures data security in cases of container deletion. This ensures that even if the container is deleted, the data of the container exists in the volume mapped host location making it the easiest way to store the container data.  

21. Where are docker volumes stored in docker?  
    Docker volumes are stored outside the container's filesystem, typically in the host filesystem or in a remote storage location. The specific location depends on the type of volume being used and the configuration of the Docker engine.    
    By default, named volumes are stored in `/var/lib/docker/volumes` on the host machine, while anonymous volumes are stored in a location specific to the storage driver being used (such as `/var/lib/docker/vfs/di`r). However, it is possible to specify a custom location for volumes using the `--mount` or `-v` flag when running a container.
22. What does the docker info command do?  
    The `docker info` command provides detailed information about the Docker installation, including the version of Docker that is installed, the number of containers and images that are currently running, the storage driver being used, and other system information like CPU and memory usage. It can be useful for troubleshooting issues with Docker or for understanding the overall configuration of the Docker environment.
23. Can you tell the what are the purposes of up, run, and start commands of docker compose?
* up: This command is used to create and start all the services that are defined in a Compose file. If the services are already created, it starts them instead.
* run: This command is used to start a one-time run of a specific service. It creates a new container for the service, starts it, and then stops and removes it when the command completes.
* start: This command is used to start all the containers that are defined in a Compose file that have already been created with the up command. It does not recreate the containers or their services.
24. What are the basic requirements for the docker to run on any system?  
* Windows: 10 64bit with 2GB RAM
* Linux: Ubuntu >=12.04, Fedora >=19, RHEL >=6.5, CentOS >=6 etc.
25. Can you tell the approach to login to the docker registry?  
`docker login`
26. List the most commonly used instructions in Dockerfile?
* FROM - specifies the base image for the Docker image being built.
* RUN - executes a command inside the container.
* COPY/ADD - copies files or directories from the host system to the container.
* ENV - sets environment variables inside the container.
* WORKDIR - sets the working directory for any RUN, CMD, ENTRYPOINT, COPY, or ADD instructions that follow it.
* EXPOSE - specifies the port(s) on which the container listens for connections.
* CMD - specifies the default command to run when the container starts.
* ENTRYPOINT - specifies the command to run when the container starts, with any additional arguments passed to the container being appended to the entrypoint command.
* VOLUME - creates a mount point for external volumes to be mounted on the container.
* USER - sets the user that the container should run as.
27. Can you differentiate between Daemon Logging and Container Logging?
* Daemon Level:
    - Debug has all the data that happened during the execution of the daemon process.
    - Info carries all the information along with the error information during the execution of the daemon process.
    - Errors have those errors that occurred during the execution of the daemon process.
    - Fatal has the fatal errors that occurred during the execution.
- Container Level:
    - Container level logging can be done using the command: sudo docker run –it <container_name> /bin/bash
    - In order to check for the container level logs, we can run the command: sudo docker logs <container_id>

28. What is the way to establish communication between docker host and Linux host?  
We could using networking by identifying the "ipconfig" on the docker hose. This command ensures that an ethernet adapter is created as long as the docker is present in the host.

29. What is the best way of deleting a container?   
stop firstly, and delete it. `docker stop <container_id>`, `docker rm <container_id>`


30. Can you tell the difference between CMD and ENTRYPOINT?
* CMD instruction: specifies the default command to be executed when a container is started. It can be overwritten by passing arguments to the docker run command. You can only have one CMD instruction in a Dockerfile. If you have multiple CMD instructions, only the last one will be used.
* ENTRYPOINT instruction: specifies the command to be executed when a container is started. Unlike CMD, it cannot be overwritten by passing arguments to the docker run command. ENTRYPOINT is used to define the main executable of the container, while CMD is used to define the arguments passed to the executable. You can have multiple ENTRYPOINT instructions in a Dockerfile, but only the last one will be used.
31. Can we use JSON instead of YAML while developing docker-compose file in Docker?
yes, we could use `docker-compose -f docker-compose.json up`
32. How many containers you can run in docker and what are the factors influencing this limit?  
There are not limit until your computer cannot offer it.
33. Describe the lifecycle of Docker Container?  
Created -> Running -> Paused -> Stopped -> Deleted
34. How to use docker for multiple application environments?    
    Docker can be used to manage multiple application environments by leveraging Docker Compose.  
    To use Docker Compose for multiple application environments, you can define separate YAML files for each environment, with each file defining the appropriate services and their configuration. For example, you can have separate YAML files for development, testing, staging, and production environments.
35. How will you ensure that a container 1 runs before container 2 while using docker compose?
Conclusion  
We could edit dicker-compose.yml file to finish it
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
