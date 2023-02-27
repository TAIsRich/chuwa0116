## 1. Can you tell something about docker container


## 2. What are docker images?
- They are executable packages(bundled with application code & dependencies, software packages, etc.) for the purpose of creating containers. Docker images can be deployed to any docker environment and the containers can be spun up there to run the application.



## 3. What is a DockerFile?
- It is a text file that has all commands which need to be run for building a given image

## 4. Can you tell what is the functionality of a hypervisor?
- A hypervisor is a software that makes virtualization happen because of which is sometimes referred to as the Virtual Machine Monitor. This divides the resources of the host system and allocates them to each guest environment installed.

- This means that multiple OS can be installed on a single host system. Hypervisors are of 2 types:
    - __Native Hypervisor__: This type is also called a Bare-metal Hypervisor and runs directly on the underlying host system which also ensures direct access to the host hardware which is why it does not require base OS.
    - __Hosted Hypervisor__: This type makes use of the underlying host operating system which has the existing OS installed.


## 5. What can you tell about Docker Compose?
- It is a YAML file consisting of all the details regarding various services, networks, and volumes that are needed for setting up the Docker-based application. So, docker-compose is used for creating multiple containers, host them and establish communication between them. For the purpose of communication amongst the containers, ports are exposed by each and every container.



## 6. Can you tell something about docker namespace?
- A namespace is basically a Linux feature that ensures OS resources partition in a mutually exclusive manner. This forms the core concept behind containerization as namespaces introduce a layer of isolation amongst the containers. In docker, the namespaces ensure that the containers are portable and they don't affect the underlying host. Examples for namespace types that are currently being supported by Docker – PID, Mount, User, Network, IPC.



## 7. What is the docker command that lists the status of all docker containers?
- In order to get the status of all the containers, we run the below command: "__docker ps -a__"



## 8. On what circumstances will you lose data stored in a container?
- The data of a container remains in it until and unless you delete the container.




## 9. What is docker image registry?
- A Docker image registry, in simple terms, is an area where the docker images are stored. Instead of converting the applications to containers each and every time, a developer can directly use the images stored in the registry.
- This image registry can either be public or private and Docker hub is the most popular and famous public registry available.


## 10. How many Docker components are there?
- __Docker Client__: This component performs “build” and “run” operations for the purpose of opening communication with the docker host.
- __Docker Host__: This component has the main docker daemon and hosts containers and their associated images. The daemon establishes a connection with the docker registry.
- __Docker Registry__: This component stores the docker images. There can be a public registry or a private one. The most famous public registries are Docker Hub and Docker Cloud.

## 11. What is a Docker Hub?
- It is a public cloud-based registry provided by Docker for storing public images of the containers along with the provision of finding and sharing them.
- The images can be pushed to Docker Hub through the "__docker push__" command.


## 12. What command can you run to export a docker image as an archive?
```
 docker save -o <exported_name>.tar <container-name>
```

## 13. What command can be run to import a pre-exported Docker image into another Docker host?
```
docker load -i <export_image_name>.tar
```

## 14. Can a paused container be removed from Docker?
- No,  a container MUST be in the stopped state before we can remove it.


## 15. What command is used to check for the version of docker client and server?
- The command used to get all version information of the client and server is the ```docker version```.
- To get only the server version details, we can run ```docker version --format '{{.Server.Version}}'```

## 16. Differentiate between virtualization and containerization

## 17. Differentiate between COPY and ADD commands that are used in a Dockerfile?

## 18. Can a container restart by itself?

## 19. Can you tell the differences between a docker Image and Layer?

## 20. What is the purpose of the volume parameter in a docker run command?

## 21. Where are docker volumes stored in docker?

## 22. What does the docker info command do?

## 23. Can you tell the what are the purposes of up, run, and start commands of docker compose?

## 24. What are the basic requirements for the docker to run on any system?

## 25. Can you tell the approach to login to the docker registry?
- Using the __"docker login"__ command credentials to log in to their own cloud repositories can be entered and accessed.


## 26. List the most commonly used instructions in Dockerfile?

## 27. Can you differentiate between Daemon Logging and Container Logging?

## 28. What is the way to establish communication between docker host and Linux host?

## 29. What is the best way of deleting a container?
-  Following two steps below:
    - docker stop <container_id>
    - docker rm <container_id>

## 30. Can you tell the difference between CMD and ENTRYPOINT?

## 31. Can we use JSON instead of YAML while developing docker-compose file in Docker?
- Yes! It can be used. In order to run docker-compose with JSON, "__docker-compose -f docker-compose.json up__" can be used.

## 32. How many containers you can run in docker and what are the factors influencing this limit?
- There is no clearly defined limit to the number of containers that can be run within docker. But it all depends on the limitations - more specifically hardware restrictions. The size of the app and the CPU resources available are 2 important factors influencing this limit. In case your application is not very big and you have abundant CPU resources, then we can run a huge number of containers.

## 33. Describe the lifecycle of Docker Container?

## 34. How to use docker for multiple application environments?

## 35. How will you ensure that a container 1 runs before container 2 while using docker compose?

## 36. Conclusion