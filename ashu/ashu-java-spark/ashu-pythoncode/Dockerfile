FROM python
# calling python image from docker hub 
RUN mkdir /ashucode 
# creating new directory in existing python image 
COPY *.py /ashucode/
# below cmd means we are letting image know how to run code
CMD ["python","/ashucode/hello.py"]
# python /ashucode/hello.py  
