# JPMC-sparkawsEKS

### Spark introduction  

<img src="spark1.png">

### spark with contaienrs 

<img src="spark2.png">

### lab setup 

<img src="lab.png">

### to test connection from windows powershell

```
 ssh   ashu@18.215.115.28
```

### creating directory in remtoe server

```
[ashu@ip-172-31-95-164 ~]$ mkdir   ashu-java-spark 
[ashu@ip-172-31-95-164 ~]$ mkdir   ashu-java-spark/javacode 
[ashu@ip-172-31-95-164 ~]$ mkdir   ashu-java-spark/sparkcode
[ashu@ip-172-31-95-164 ~]$ 
[ashu@ip-172-31-95-164 ~]$ ls  ashu-java-spark/
javacode  sparkcode
[ashu@ip-172-31-95-164 ~]$ 

```

## Understanding containeriztaion 

<img src="cre1.png">

### image to container 

<img src="img1.png">

### checking docker version 

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  version 
Client:
 Version:           20.10.25
 API version:       1.41
 Go version:        go1.20.12
 Git commit:        b82b9f3
 Built:             Fri Dec 29 20:37:18 2023
 OS/Arch:           linux/amd64
 Context:           default
 Experimental:      true

Server:
 Engine:
  Version:          20.10.25
  API version:      1.41 (minimum version 1.12)
  Go version:       go1.20.12
  Git commit:       5df983c
```

### list of images download in docker server

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  images
REPOSITORY   TAG       IMAGE ID   CREATED   SIZE
[ashu@ip-172-31-95-164 ashu-java-spark]$ 


```

### pulling image from docker hub 

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  images
REPOSITORY   TAG       IMAGE ID   CREATED   SIZE
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  pull  openjdk 
Using default tag: latest
latest: Pulling from library/openjdk
197c1adcd755: Pull complete 
57b698b7af4b: Pull complete 
95a27dbe0150: Pull complete 
Digest: sha256:9b448de897d211c9e0ec635a485650aed6e28d4eca1efbc34940560a480b3f1f
Status: Downloaded newer image for openjdk:latest
docker.io/library/openjdk:latest
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  images
REPOSITORY   TAG       IMAGE ID       CREATED         SIZE
openjdk      latest    71260f256d19   13 months ago   470MB
[ashu@ip-172-31-95-164 ashu-java-spark]$ 

```

### history 

```
 10  docker  images
   11  docker  pull  openjdk 
   12  docker  images
   13  docker pull ubuntu
   14  docker images
   15  docker pull python:3.11 
   16  docker images
```

### creating contaienrs

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  run  --name ashuc1 -it -d    openjdk 
9d65209abdbc23eaebbbc58f28d6b9f54deb652e951b3d7c0a563e4eb98fb6a4
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  ps
CONTAINER ID   IMAGE     COMMAND     CREATED          STATUS          PORTS     NAMES
1e5b3e22bbbe   openjdk   "jshell"    5 seconds ago    Up 4 seconds              nagac1
7ea8caac2638   openjdk   "jshell"    5 seconds ago    Up 4 seconds              shiva1
68ed2049a1b1   openjdk   "jshell"    5 seconds ago    Up 4 seconds              rajshkrc1
665c0ebe1825   openjdk   "jshell"    6 seconds ago    Up 5 seconds              navs1
2c8116bcb29b   openjdk   "jshell"    6 seconds ago    Up 6 seconds              manac1
fa62ae7649d0   python    "python3"   7 seconds ago    Up 6 seconds              vaishc1
77a346c19889   openjdk   "jshell"    7 seconds ago    Up 6 seconds              vinayc1
e45d00b605fe   python    "python3"   8 seconds ago    Up 7 seconds              manoj1
9d65209abdbc   openjdk   "jshell"    9 seconds ago    Up 8 seconds              ashuc1
5b6cd6a10d68   openjdk   "jshell"    11 seconds ago   Up 10 seconds             swethac1
f80506110195   openjdk   "jshell"    18 seconds ago   Up 18 seconds             mukesh
```

### build and run 

<img src="br.png">

### hello.py 

```
import time
while True:
    print("Hello ALL from JPMC ")
    time.sleep(2)
    print("Oh now i m python Developer ")
```

### image build 

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ ls
javacode  pythoncode  sparkcode
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  build  -t   ashupython:codev1  pythoncode/ 
Sending build context to Docker daemon  4.096kB
Step 1/4 : FROM python
 ---> 6cbe1053f244
Step 2/4 : RUN mkdir /ashucode
 ---> Running in 9a8156613b73
Removing intermediate container 9a8156613b73
 ---> 9555b8e58811
Step 3/4 : COPY *.py /ashucode/
 ---> 42c689bdf775
Step 4/4 : CMD ["python","/ashucode/hello.py"]
 ---> Running in 3a27256dce94
Removing intermediate container 3a27256dce94
 ---> 963f1f804217
Successfully built 963f1f804217
Successfully tagged ashupython:codev1
```

### creating contaienr 

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker  run  --name ashutest1  -itd  ashupython:codev1 
4618c6722c33ca3d37c3f47e1e40409e5d6509a352449905e6389d30f99b4c00
[ashu@ip-172-31-95-164 ashu-java-spark]$ docker ps
CONTAINER ID   IMAGE               COMMAND                  CREATED         STATUS         PORTS     NAMES
4618c6722c33   ashupython:codev1   "python /ashucode/he…"   5 seconds ago   Up 4 seconds             ashutest1
[ashu@ip-172-31-95-164 ashu-java-spark]$ 

```

### checking logs 

```
root@ip-172-31-95-164 ~]# docker  logs   ashutest1  
Hello ALL from JPMC 
Oh now i m python Developer 
Hello ALL from JPMC 
Oh now i m python Developer 

```

### compose intro 

<img src="com1.png">


