1. Can you tell something about docker container

In simplest terms, docker containers consist of applications and all their dependencies.
They share the kernel and system resources with other containers and run as isolated systems in the host operating system.
The main aim of docker containers is to get rid of the infrastructure dependency while deploying and running applications. This means that any containerized application can run on any platform irrespective of the infrastructure being used beneath.
Technically, they are just the runtime instances of docker images.

2. What are docker images?

They are executable packages(bundled with application code & dependencies, software packages, etc.) for the purpose of creating containers. Docker images can be deployed to any docker environment and the containers can be spun up there to run the application.

3. What is a DockerFile?

It is a text file that has all commands which need to be run for building a given image.

4. Can you tell what is the functionality of a hypervisor?

A hypervisor is a software that makes virtualization happen because of which is sometimes referred to as the Virtual Machine Monitor. This divides the resources of the host system and allocates them to each guest environment installed.

This means that multiple OS can be installed on a single host system. Hypervisors are of 2 types:

- Native Hypervisor: This type is also called a Bare-metal Hypervisor and runs directly on the underlying host system which also ensures direct access to the host hardware which is why it does not require base OS.
- Hosted Hypervisor: This type makes use of the underlying host operating system which has the existing OS installed.

5. What can you tell about Docker Compose?

It is a YAML file consisting of all the details regarding various services, networks, and volumes that are needed for setting up the Docker-based application. So, docker-compose is used for creating multiple containers, host them and establish communication between them. For the purpose of communication amongst the containers, ports are exposed by each and every container.

6. Can you tell something about docker namespace?

A namespace is basically a Linux feature that ensures OS resources partition in a mutually exclusive manner. This forms the core concept behind containerization as namespaces introduce a layer of isolation amongst the containers. In docker, the namespaces ensure that the containers are portable and they don't affect the underlying host. Examples for namespace types that are currently being supported by Docker – PID, Mount, User, Network, IPC.

7. What is the docker command that lists the status of all docker containers?

In order to get the status of all the containers, we run the below command: "docker ps -a"

8. On what circumstances will you lose data stored in a container?

The data of a container remains in it until and unless you delete the container.

9. What is docker image registry?

A Docker image registry, in simple terms, is an area where the docker images are stored. Instead of converting the applications to containers each and every time, a developer can directly use the images stored in the registry.

10. How many Docker components are there?

Docker Client: This component performs “build” and “run” operations for the purpose of opening communication with the docker host.

Docker Host: This component has the main docker daemon and hosts containers and their associated images. The daemon establishes a connection with the docker registry.

Docker Registry: This component stores the docker images. There can be a public registry or a private one. The most famous public registries are Docker Hub and Docker Cloud.

11. What is a Docker Hub?

It is a public cloud-based registry provided by Docker for storing public images of the containers along with the provision of finding and sharing them.

12. What command can you run to export a docker image as an archive?

```
docker save -o <exported_name>.tar <container-name>
```

13. What command can be run to import a pre-exported Docker image into another Docker host?

```
docker load -i <export_image_name>.tar
```

14. Can a paused container be removed from Docker?

No, a container MUST be in the stopped state before we can remove it.

15. What command is used to check for the version of docker client and server?

The command used to get all version information of the client and server is the docker version.

To get only the server version details, we can run docker version --format '{{.Server.Version}}'

16. Differentiate between virtualization and containerization

Virtualization: This helps developers to run and host multiple OS on the hardware of a single physical server.
Containerization: This helps developers to deploy multiple applications using the same operating system on a single virtual machine or server.

17. Differentiate between COPY and ADD commands that are used in a Dockerfile?

- Both the commands have similar functionality, but COPY is more preferred because of its higher transparency level than that of ADD.
- COPY provides just the basic support of copying local files into the container whereas ADD provides additional features like remote URL and tar extraction support.

18. Can a container restart by itself?

Yes, it is possible only while using certain docker-defined policies while using the docker run command.

19. Can you tell the differences between a docker Image and Layer?

Image: This is built up from a series of read-only layers of instructions. An image corresponds to the docker container and is used for speedy operation due to the caching mechanism of each step.

Layer: Each layer corresponds to an instruction of the image’s Dockerfile. In simple words, the layer is also an image but it is the image of the instructions run.

20. What is the purpose of the volume parameter in a docker run command?

The syntax of docker run when using the volumes is: docker run -v host_path:docker_path <container_name>

The volume parameter is used for syncing a directory of a container with any of the host directories. Consider the below command as an example: docker run -v /data/app:usr/src/app myapp The above command mounts the directory /data/app in the host to the usr/src/app directory. We can sync the container with the data files from the host without having the need to restart it. This also ensures data security in cases of container deletion. - This ensures that even if the container is deleted, the data of the container exists in the volume mapped host location making it the easiest way to store the container data.

21. Where are docker volumes stored in docker?

Volumes are created and managed by Docker and cannot be accessed by non-docker entities. They are stored in Docker host filesystem at /var/lib/docker/volumes/

22. What does the docker info command do?

The command gets detailed information about Docker installed on the host system. The information can be like what is the number of containers or images and in what state they are running and hardware specifications like total memory allocated, speed of the processor, kernel version, etc.

23. Can you tell the what are the purposes of up, run, and start commands of docker compose?

Using the up command for keeping a docker-compose up (ideally at all times), we can start or restart all the networks, services, and drivers associated with the app that are specified in the docker-compose.yml file. Now if we are running the docker-compose up in the “attached” mode then all the logs from the containers would be accessible to us. In case the docker-compose is run in the “detached” mode, then once the containers are started, it just exits and shows no logs.

24. What are the basic requirements for the docker to run on any system?

Docker can run on both Windows and Linux platforms.

For the Windows platform, docker atleast needs Windows 10 64bit with 2GB RAM space. For the lower versions, docker can be installed by taking help of the toolbox. Docker can be downloaded from <https://docs.docker.com/docker-for-windows/> website.

25. Can you tell the approach to login to the docker registry?

Using the "docker login" command credentials to log in to their own cloud repositories can be entered and accessed.
