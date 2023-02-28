### Docker Basic Interview Questions
1. Can you tell something about docker container?

   Docker container is a collection of software with their dependencies so that apps is able to run on different
   platforms.
2. What are docker images?

   They are executables packed up and ready to be used by container to initialized the application in it.
3. What is a DockerFile?

   It's a set of commands and variables needed to build an image.
4. Can you tell what is the functionality of a hypervisor?

   It's a software that makes virtualization possible, it divides the resources of the host system and deliver them to
   different virtual OS environment.
5. What can you tell about Docker Compose?

   It's a YAML file which contains services, networks and volumes that are needed by multiple containers, and it wil
   establish communication between them.
6. Can you tell something about docker namespace?

   Docker namespace is a Linus feature that makes sure the containers are portable and they don't affect the underlying host
7. What is the docker command that lists the status of all docker containers?

   `docker ps -a`
8. On what circumstances will you lose data stored in a container?

   When you delete the container, if you want to store those data, you need to put them into Volume.
9. What is docker image registry?

   It's a repository that can store the docker image either in public Docker Hub or a private one.
10. How many Docker components are there?
    * Three:
      1. Docker Client: `docker build`, `docker pull`, `docker run`
      2. Docker Host: it has the main docker daemon and hosts containers and their images
      3. Docker Registry: this component stores and docker images, and there can be a public registry or a private one
11. What is a Docker Hub?

    A public cloud-based registry for storing public images of the containers, and images can be `push` onto the Hub
12. What command can you run to export a docker image as an archive?

   `docker save -o <exported_name>.tar <container-name>`
13. What command can be run to import a pre-exported Docker image into another Docker host?

   docker load -i <export_image_name>.tar
14. Can a paused container be removed from Docker?

    No, a contained must be in stopped, not paused before removing it
15. What command is used to check for the version of docker client and server?

    * For client and server: `docker version`
    * Only the server: `docker version --format '{{.Server.Version}}' `

### Docker Intermediate Interview Questions
1. Differentiate between virtualization and containerization.
     
   | Virtualization                                                                     | Containerization                                                           |
   |------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
   | Host multiple **OS** on a physical hardware                                        | Host **multiple** application using same operating system                  |
   | **Hypervisors** delegates hardware resources to generate multiple Virtual Machines | Containers ensure isolated environment are provided to run the application |
   | VM forms **abstraction of the system hardware layer**                              | Containers form **abstraction of the application layer**                   |

2. Differentiate between COPY and ADD commands that are used in a Dockerfile?
   * COPY: basic functionalities of copying local files into container
   * ADD: provides extra functionalities like remote URL and tar extraction support
3. Can a container restart by itself?
   * Yes, but only when certain docker-defined policies are applied, such as:
     1. **Off**: container restarts on stop or fail
     2. **On-failure**: container restarts on failures not related to the user
     3. **Unless-stopped**: container restarts on **stop** command being typed by the user
     4. **Always**: container restarts regardless of the failure or stopping
4. Can you tell the differences between a docker Image and Layer?
   * Image: Built from multiple read-only layers (each layer -> an instruction in the Dockerfile)
   * Layer: An instruction of the image's Dockerfile
5. What is the purpose of the volume parameter in a docker run command?
   * Maps container data onto the host machines folder:
     * `docker run -v host_path:docker_path <container_name>`: when container is deleted, the data in `docker_path`
       will be stored in `host_path` on the host computer
6. Where are docker volumes stored in docker?
   * They are stored in Docker host filesystem at `/var/lib/docker/volumes/`
7. What does the docker info command do?
   * get detailed information about Docker that is on the host machines, such as number of containers or images.
8. Can you tell the what are the purposes of up, run, and start commands of docker compose?
   * **up**: keep the docker-compose up, we can start or restart all networks, serviced, and drivers associated with the app
   * **run**: the docker-compose will be run one-off or ad-hoc tasks
   * **start**: containers which are already created and stopped can be restarted
9. What are the basic requirements for the docker to run on any system?
   * Docker can run on both Windows and Linux platforms
10. Can you tell the approach to login to the docker registry?
    * Using the `docker login` command credentials to log in.
11. List the most commonly used instructions in Dockerfile?
    * FROM: Set the base image for the upcoming instructions. A dockerfile is considered valid when it starts with FROM
    * LABEL: Used for image organization based on projects, modules, or licensing
    * RUN: Used to execute instructions following it on the top of the current images in a new layer. When we RUN command, we
      add layers on top of the image and then use that in the subsequent steps
    * CMD: provide default values of an executing container. If multiple CMD provided, the last instruciton would be considered
12. Can you differentiate between Daemon Logging and Container Logging?
    * **Daemon Level**:
      * Debug: all data that happened during the execution of the daemon process
      * Info: all the information along with the error information during the execution of the daemon process
      * Error: errors that occurred during the execution of the daemon process
      * Fatal: fatal errors that occurred during the execution
    * **Container Level**
      * Container level logging can be done by using: `sudo docker run -it <container_name> /bin/bash`
      * To check for the container level logs, we can run the command: `sudo docker logs <container_id>`
13. What is the way to establish communication between docker host and Linux host?
    * Can be done using networking by identifying the `ipconfig` on the docker host
14. What is the best way of deleting a container?
    * `docker stop <container_id>`
    * `docker rm <container_id>`
15. Can you tell the difference between CMD and ENTRYPOINT?
    * `CMD` provides executable defaults for an executing container, if the executable has to be omitted, the usage of
      ENTRYPOINT instruction along with the JSON array format has to be incorporated
    * `ENTRYPOINT` specifies the instruction within it will always be run when the container starts

### Docker Advanced Interview Questions
1. Can we use JSON instead of YAML while developing docker-compose file in Docker?
   * Yes, it can used. To run docker-compose with JSON, `docker-compose -f docker-compose.json up`
2. How many containers you can run in docker and what are the factors influencing this limit?
   * No defined limit to the number of containers that can be run within docker. The size of the app and the CPU resources available
     are two important factors that affect this limit
3. Describe the lifecycle of Docker Container?
   * **Created**: created but not started yet
   * **Running**: container would by running with all its associated processes
   * **Paused**: when the running container has been paused
   * **Stopped**: when the running container has been stopped
   * **Deleted**: when the container has a dead state
4. How to use docker for multiple application environments?
   * We can created environment-specific docker-compose files of the name `docker-compose.{environment}.yml`
5. How will you ensure that a container 1 runs before container 2 while using docker compose?
   * Use `depends_on` keyword to make sure the orderliness of containers
    ```yaml
    version: "2.4"
    services:
     backend:
       build: .
       depends_on:
         - db
     db:
       image: postgres
    ```
