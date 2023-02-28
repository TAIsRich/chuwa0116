# Docker knowledge

## What is docker container?
- docker container consist of applications and all dependencies.
- They share kernel and system resources with other containers and run as isolated systems in the host OS.
- Docker aims to get rid of the infrastructure dependency while deploying an running applications regardless platform and infra.
- docker container are runtime instances of docker images.

## what are docker images?
they are executable packages for creating containers.
docker images can be deployed to any docker environment and containers can be accessed together to run the application.

## what is a docker file?
it contains all commands which need to be run for building a given image.

## what is a hypervisor?
sometimes refer to VM monitor, it is responsible for virtualization, it divides host system resources and allocate to different guest OS.

## what are two types of hypervisor?
- Native hypervisor: aka bare-metal hypervisor and runs directly on the host system, does not require a base OS, ensuring direct hardware access.
- Hosted hypervisor: it makes use of host OS (required base OS)

## what is docker compose?
it is a yaml file to configure various services, networks, volumes, ports that are needed; it creates multiple containers, host them and create communications between them.  

## what is docker namespace?
it ensures OS resources partition in a mutually exclusive manner.
it adds a layer of isolations amongst the containers.
namespace ensures containers are portable and don't affect the host.
Examples for namespace types that are currently being supported by Docker – PID, Mount, User, Network, IPC.

## On what circumstance will you lose data store in docker?
The data of a container remains in it until and unless you delete the container.

## What is docker image registry?
Instead of converting the applications to containers each and every time, a developer can directly use the images stored in the registry.
This image registry can either be public or private and Docker hub is the most popular and famous public registry available.

## How many Docker components are there?
Docker Client: pull, build and run images, operations to docker host
Docker Host: main docker daemon and host container and associated images, the daemon establishes a connection with docker registry.
Docker Registry: stores docker images


## what is docker hub?
similar to github, it is cloud based registry for storing public images and open to all.

## Can a paused container be removed from docker?
No, a container must stopped then we can remove it.

## Difference between virtualization and containerization.

| Virtualization                                                                                                                                               | Containerization                                                                                                                                                                                      |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| This helps developers to run and host multiple   OS  on the hardware of a single physical server.                                                            | This helps developers to deploy multiple   applications  using the same operating system on a single virtual machine or server.                                                                       |
| Hypervisors  provide overall virtual machines to the guest operating systems.                                                                                | Containers  ensure isolated environment/user spaces are provided for running the applications. Any changes done within the container do not reflect on the host or other containers of the same host. |
| These virtual machines form an   abstraction of the system hardware   layer   this means that each virtual machine on the host acts like a physical machine. | Containers form   abstraction of the application   layer  which means that each container constitutes a different application.                                                                        |

## what is volume parameter in a docker run command?

syntax of running docker with volume specified docker run -v host_path:docker_path <container_name>

The volume parameter is used for syncing a directory of a container with any of the host directories. Consider the below command as an example: docker run -v /data/app:usr/src/app myapp
The above command mounts the directory  /data/app in the host to the usr/src/app directory. We can sync the container with the data files from the host without having the need to restart it.

This also ensures data security in cases of container deletion. This ensures that even if the container is deleted, the data of the container exists in the volume mapped host location making it the easiest way to store the container data.

## where are docker volumes stored in docker?
Volumes are created and managed by Docker and cannot be accessed by non-docker entities. They are stored in Docker host filesystem at /var/lib/docker/volumes/

##  How many containers you can run in docker and what are the factors influencing this limit?
No size limit but size of app and CPU resources available are two key factors relate to this limit.

## what is docker compose?
a text (or can be translate into JSON) specifying a set of commands (port number, volumes etc.) of how each container will be running




# Docker commands

## check all docker containers
docker ps -a

## docker save -o <exported_name>.tar <container-name>
export a docker image as an archive

## docker load -i <export_image_name>.tar
import a pre-export docker image into another docker host

## docker info
The command gets detailed information about Docker installed on the host system.
The information can be like what is the number of containers or images and in what state they are running and hardware specifications like total memory allocated, speed of the processor, kernel version, etc.

## docker stop <container_id>
stop a container

## docker rm <container_id>
delete a container

## 


















































