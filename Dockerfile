FROM openjdk:11.0.11-jdk

COPY . /app

WORKDIR /app

RUN apt-get install -y tzdata

RUN ./gradlew clean \
	&& ./gradlew build -x test \
	&& mv ./build/libs/demo-0.0.1-SNAPSHOT.war ./app.war

EXPOSE 8080

ENV TZ="Asia/Seoul"

CMD ["java", "-jar", "app.war"]
