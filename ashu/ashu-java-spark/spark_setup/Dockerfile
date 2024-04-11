FROM oraclelinux:8.4 
LABEL name="ashutoshh"
LABEL email="ashutoshh@linux.com"
ENV SPARK_SETUP=/opt/jpmc
ENV SPARK_VERSION=3.5.1
ENV JAVA_VERSION=17
# jdk 17 installing 
RUN dnf install java-${JAVA_VERSION}-openjdk java-${JAVA_VERSION}-openjdk-devel wget -y 
# dnf and yum are software installer in rpm based linux systems
WORKDIR ${SPARK_SETUP}
# changing location 
RUN wget https://dlcdn.apache.org/spark/spark-${SPARK_VERSION}/spark-${SPARK_VERSION}-bin-hadoop3.tgz