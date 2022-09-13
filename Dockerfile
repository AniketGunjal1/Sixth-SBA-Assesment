FROM openjdk:17
EXPOSE 9007
ADD target/student-crud-app.jar student-crud-app.jar
ENTRYPOINT ["java","-jar","/student-crud-app.jar"]