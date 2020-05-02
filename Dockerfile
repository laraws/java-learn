FROM openjdk:8
WORKDIR /app
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n
COPY remote-debugging-1.0-SNAPSHOT.jar  remote-debugging.jar
ENTRYPOINT ["java", "-cp", "remote-debugging.jar", "com.kaysush.App"]