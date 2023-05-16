FROM openjdk

ADD target/h2.database-0.0.1-SNAPSHOT.jar webapp.jar

ENTRYPOINT [ "sh", "-c", "java -jar /webapp.jar" ]
#EXPOSE 8080


#CMD ["java","-Xmx50m","-jar","webapp.jar"]
