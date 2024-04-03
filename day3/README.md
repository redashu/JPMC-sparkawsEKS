# JPMC-sparkawsEKS

### EKS more info 

<img src="eks1.png">

### Network flow in EKS 

<img src="net1.png">

### verify k8s connection 

```
[ashu@ip-172-31-95-164 ashu-java-spark]$ kubectl  cluster-info 
Kubernetes control plane is running at https://F7F7ADBD02A3EC954AC1040B0F5D09F4.gr7.us-east-1.eks.amazonaws.com
CoreDNS is running at https://F7F7ADBD02A3EC954AC1040B0F5D09F4.gr7.us-east-1.eks.amazonaws.com/api/v1/namespaces/kube-system/services/kube-dns:dns/proxy

To further debug and diagnose cluster problems, use 'kubectl cluster-info dump'.
[ashu@ip-172-31-95-164 ashu-java-spark]$ kubectl  get nodes
NAME                            STATUS   ROLES    AGE   VERSION
ip-192-168-44-74.ec2.internal   Ready    <none>   35h   v1.27.9-eks-5e0fdde
ip-192-168-46-75.ec2.internal   Ready    <none>   38m   v1.27.9-eks-5e0fdde
ip-192-168-8-122.ec2.internal   Ready    <none>   38m   v1.27.9-eks-5e0fdde
[ashu@ip-172-31-95-164 ashu-java-spark]$ 

```

### lets create depoloyment file 

```
kubectl  create  deployment ashu-web-ui --image=dockerashu/ashujpmc:webv1  --port 80 --dry-run=client        -o yaml  >ashu-ui-deploy.yaml 
[ashu@ip-172-31-95-164 eks-manifest]$ ls
ashu_deploy.yaml  ashujavapod.yaml  ashunewfile.yml  ashupod2.yml  ashu-ui-deploy.yaml  svc_local.yaml  webdeploy.yaml
[ashu@ip-172-31-95-164 eks-manifest]$

====>>
ashu@ip-172-31-95-164 eks-manifest]$ kubectl apply  -f  ashu-ui-deploy.yaml  
deployment.apps/ashu-web-ui created
[ashu@ip-172-31-95-164 eks-manifest]$ kubectl  get deploy
NAME            READY   UP-TO-DATE   AVAILABLE   AGE
ashu-web-ui     1/1     1            1           8s
mukesh-web-ui   0/1     1            0           51s
prasadweb       1/1     1            1           9s
```
