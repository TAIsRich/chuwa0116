# 1. Can you tell something about docker container?
Docker containers consist of the applications and all their dependencies, they are the runtime instances of docker images.

# 2. What are docker images?
They are executable packages for the purpose of creating docker containers. 

# 3. What is a DockerFile?
It is a text file that has all commands which need to be run for building a given image.

# 4. Can you tell what is the functionality of a hypervisor?
A hypervisor is a software that makes virtualization happen. It divides the resources of the host system and reallocate them to each guest system.

# 7. What is the docker command that lists the status of all docker containers?
```docker  ps -a```

# 8. On what circumstances will you lose data stored in a container?
The data remains in the container until we delete the container.

# 9. What is docker image registry?
Docker image registry is a repository that stores docker images, it can be either public or private.

# 12. What command can you run to export a docker image as an archive?
```docker save -o <exported_name>.tar <image_name>```

# 13. What command can be run to import a pre-exported Docker image into another Docker host?
```docker load -i <exported_name>.tar```

# 14. Can a paused container be removed from Docker?
No, a container MUST be in stopped state before we remove it. 

# 15. What command is used to check for the version of docker client and server?
```docker version```

# 16. Differentiate between virtualization and containerization.
Virtualization:
- helps developers to run multiple OS on the hardware of a single physical sever;
- hypervisor provides overall virtual machines to the guest OS;
- virtual machines form an abstraction of the system hardware layer, each virtual machine on the host acts as a real physical machine.
Containerization:
- helps developers to run multiple applications on the same OS;
- containers ensure isolated environment are provided for running the application. Any changes done within the container do not affect the host or other containers;
- containers form an abstraction of the application layer.

# 17. Differentiate between COPY and ADD commands that are used in a Dockerfile?
```copy``` means copy local file to the container whereas ```add``` provides additional features like URL and tar extraction support.

# 18. Can a container restart by itself?
Yes, it is possible only while using certain docker-defined policies while using the docker run command.
- Off: In this, the container won’t be restarted in case it's stopped or it fails.
- On-failure: Here, the container restarts by itself only when it experiences failures not associated with the user.
- Unless-stopped: Using this policy, ensures that a container can restart only when the command is executed to stop it by the user.
- Always: Irrespective of the failure or stopping, the container always gets restarted in this type of policy.

# 20. What is the purpose of the volume parameter in a docker run command?
The volume parameter is used for syncing a directory of a container with any of the host directories. 

# 21. Where are docker volumes stored in docker?
```/var/lib/docker/volumes/```

# 24. What are the basic requirements for the docker to run on any system?
Docker can run on both Windows and Linux system.

# 29. What is the best way of deleting a container?
```docker rm -f <contain_id>```
