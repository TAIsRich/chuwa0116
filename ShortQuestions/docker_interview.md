## 1. Can you tell something about docker container

## 2. What are docker images?

## 3. What is a DockerFile?

## 4. Can you tell what is the functionality of a hypervisor?

## 5. What can you tell about Docker Compose?

## 6. Can you tell something about docker namespace?

## 7. What is the docker command that lists the status of all docker containers?

## 8. On what circumstances will you lose data stored in a container?

## 9. What is docker image registry?

## 10. How many Docker components are there?

## 11. What is a Docker Hub?

## 12. What command can you run to export a docker image as an archive?

## 13. What command can be run to import a pre-exported Docker image into another Docker host?

## 14. Can a paused container be removed from Docker?
- No,  a container MUST be in the stopped state before we can remove it.


## 15. What command is used to check for the version of docker client and server?

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