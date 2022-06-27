#FROM adoptopenjdk/openjdk15:ubi
#ENV APP_HOME="/usr/app"
#WORKDIR $APP_HOME
#COPY build/libs/*.jar app.jar
#EXPOSE 8080
#CMD ["java", "-jar", "app.jar"]

#FROM adoptopenjdk/openjdk15:ubi
#RUN mkdir /opt/app
#COPY japp.jar /opt/app
#CMD ["java", "-jar", "/opt/app/japp.jar"]

FROM adoptopenjdk/openjdk15:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]