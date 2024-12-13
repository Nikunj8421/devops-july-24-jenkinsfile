FROM ubuntu:latest

LABEL author=Nikunj
LABEL name="web application"

RUN apt-get update -y && \
    apt-get install nginx -y


#COPY . .
#COPY index.html 

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
