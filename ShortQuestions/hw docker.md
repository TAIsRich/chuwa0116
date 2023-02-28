### 1. Can you tell something about docker container?

In simplest terms, docker containers consist of applications and all their dependencies. The main aim of docker containers is to get rid of the infrastructure dependency while deploying and running applications. Technically, they are just the runtime instances of docker images.

### 2. What are docker images?

They are executable packages for the purpose of creating containers. Docker images can be deployed to any docker environment and the containers can be spun up there to run the application.

### 3. What is a DockerFile?

It is a text file that has all commands which need to be run for building a given image.

### 4. Can you tell what is the functionality of a hypervisor?

A hypervisor is a software that makes virtualization happen because of which is sometimes referred to as the Virtual Machine Monitor. This divides the resources of the host system and allocates them to each guest environment installed.

- This means that multiple OS can be installed on a single host system. Hypervisors are of 2 types:

  **Native Hypervisor:** This type is also called a Bare-metal Hypervisor and runs directly on the underlying host system which also ensures direct access to the host hardware which is why it does not require base OS.

  **Hosted Hypervisor:** This type makes use of the underlying host operating system which has the existing OS installed.

### 5. What can you tell about Docker Compose?

It is a YAML file consisting of all the details regarding various services, networks, and volumes that are needed for setting up the Docker-based application. So, docker-compose is used for creating multiple containers, host them and establish communication between them. For the purpose of communication amongst the containers, ports are exposed by each and every container.

### 6. Can you tell something about docker namespace?

Each container has its own separate namespace, and the applications running in it are like running in an independent operating system. Namespaces ensure that containers do not affect each other.

### 7. What is the docker command that lists the status of all docker containers?

`docker ps -a`

### 8. On what circumstances will you lose data stored in a container?

The data of a container remains in it until and unless you delete the container.

### 9. What is docker image registry?

A Docker image registry is an area where the docker images are stored. Instead of converting the applications to containers each and every time, a developer can directly use the images stored in the registry.

### 10. How many Docker components are there?

There are three docker components, they are Docker Client, Docker Host, and Docker Registry.

- **Docker Client:** This component performs “build” and “run” operations for the purpose of opening communication with the docker host.
- **Docker Host:** This component has the main docker daemon and hosts containers and their associated images. The daemon establishes a connection with the docker registry.
- **Docker Registry:** This component stores the docker images. There can be a public registry or a private one. The most famous public registries are Docker Hub and Docker Cloud.

### 11. What is a Docker Hub?

- It is a public cloud-based registry provided by Docker for storing public images of the containers along with the provision of finding and sharing them.

### 12. What command can you run to export a docker image as an archive?

`docker save -o <exported_name>.tar <container-name>`

### 13. What command can be run to import a pre-exported Docker image into another Docker host?

 `docker load -i <export_image_name>.tar`

### 14. Can a paused container be removed from Docker?

No. A container MUST be in the stopped state before we can remove it.

### 15. What command is used to check for the version of docker client and server?

- The command used to get all version information of the client and server is the `docker version.`
- To get only the server version details, we can run `docker version --format '{{.Server.Version}}'`

### 16. Differentiate between virtualization and containerization.

Virtualization:

- helps developers to run multiple OS on the hardware of a single physical sever;
- hypervisor provides overall virtual machines to the guest OS;
- virtual machines form an abstraction of the system hardware layer, each virtual machine on the host acts as a real physical machine. Containerization:

Containerization:

- helps developers to run multiple applications on the same OS;
- containers ensure isolated environment are provided for running the application. Any changes done within the container do not affect the host or other containers;
- containers form an abstraction of the application layer.

### 17. Differentiate between COPY and ADD commands that are used in a Dockerfile?

`copy` means copy local file to the container whereas `add` provides additional features like URL and tar extraction support.

### 18. Can a container restart by itself?

Yes, it is possible only while using certain docker-defined policies while using the docker run command.

- Off: In this, the container won’t be restarted in case it's stopped or it fails.
- On-failure: Here, the container restarts by itself only when it experiences failures not associated with the user.
- Unless-stopped: Using this policy, ensures that a container can restart only when the command is executed to stop it by the user.
- Always: Irrespective of the failure or stopping, the container always gets restarted in this type of policy.

### 19. Can you tell the differences between a docker Image and Layer?

**Image:** This is built up from a series of read-only layers of instructions. An image corresponds to the docker container and is used for speedy operation due to the caching mechanism of each step.

**Layer:** Each layer corresponds to an instruction of the image’s Dockerfile. In simple words, the layer is also an image but it is the image of the instructions run.

### 20. What is the purpose of the volume parameter in a docker run command?

The volume parameter is used for syncing a directory of a container with any of the host directories.

### 21. Where are docker volumes stored in docker?

Volumes are created and managed by Docker and cannot be accessed by non-docker entities. They are stored in Docker host filesystem at `/var/lib/docker/volumes/`

### 22. What does the docker info command do?

The command gets detailed information about Docker installed on the host system. The information can be like what is the number of containers or images and in what state they are running and hardware specifications like total memory allocated, speed of the processor, kernel version, etc.

### 29. What is the best way of deleting a container?

- Following two steps below:
  - docker stop <container_id>
  - docker rm <container_id>

### 31. Can we use JSON instead of YAML while developing docker-compose file in Docker?

- Yes! It can be used. In order to run docker-compose with JSON, "**docker-compose -f docker-compose.json up**" can be used.

### 32. How many containers you can run in docker and what are the factors influencing this limit?

- There is no clearly defined limit to the number of containers that can be run within docker. But it all depends on the limitations - more specifically hardware restrictions. The size of the app and the CPU resources available are 2 important factors influencing this limit. In case your application is not very big and you have abundant CPU resources, then we can run a huge number of containers.