FROM openjdk 
RUN mkdir  /mycode 
COPY hello.java /mycode/
WORKDIR /mycode
# use of WOrkdir to change location during build time 
RUN javac hello.java 
USER 1001 
# 1000 - 60k 
# compile code 
CMD ["java","hello"]
# CMD to run the code finally -- it will only run while creating container