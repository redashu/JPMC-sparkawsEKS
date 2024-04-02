# JPMC-sparkawsEKS

### lets push image to Registry server 

<img src="hub1.png">

## pushing image to docker hub 

### tagging 

```
docker  tag          ashujava:imgv1     docker.io/dockerashu/ashujava:imgv1
```

### loging to docker hub from docker server

```
[ashu@ip-172-31-95-164 ashu-pythoncode]$ docker  login  
Login with your Docker ID to push and pull images from Docker Hub. If you don't have a Docker ID, head over to https://hub.docker.com to create one.
Username: dockerashu
Password: 
WARNING! Your password will be stored unencrypted in /home/ashu/.docker/config.json.
Configure a credential helper to remove this warning. See
https://docs.docker.com/engine/reference/commandline/login/#credentials-store

Login Succeeded
```

### pushing image

```

[ashu@ip-172-31-95-164 ashu-pythoncode]$ docker push  docker.io/dockerashu/ashujava:imgv1  
The push refers to repository [docker.io/dockerashu/ashujava]
c591c838739a: Pushed 
5f70bf18a086: Mounted from library/sonarqube 
13c364d2fb9d: Pushed 
5229bd879601: Pushed 
56285d9a7760: Mounted from library/openjdk 
077bff59ce57: Mounted from library/openjdk 
9cd9df9ffc97: Mounted from library/openjdk 
imgv1: digest: sha256:a0243757199236d89d7a68acc59613eedfe6242dc8b5f0bdef9ee65020f900f4 size: 1781
```

### How to setuP EKS 

<img src="eks1.png">

### to connect any K8S cluster (control plane) -- we need kubectl 

```
[ashu@ip-172-31-95-164 ashu-pythoncode]$ kubectl  version --client 
Client Version: v1.29.3
Kustomize Version: v5.0.4-0.20230601165947-6ce0bf390ce3
```

### for any OS  aws and EKS cred location 

<img src="eks22.png">

### introduction to POd in k8s 

<img src="pod1.png">




