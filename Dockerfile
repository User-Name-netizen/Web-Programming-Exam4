FROM tomcat:10.1-jdk21
COPY . /usr/local/tomcat/webapps/ROOT
EXPOSE 8080
CMD ["catalina.sh", "run"]  
