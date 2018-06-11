FROM openjdk:10-jre-slim

ARG version
ARG artifact

ENV APP_HOME /app

RUN mkdir $APP_HOME

WORKDIR $APP_HOME

COPY src/main/bash/wait-for-it.sh /usr/bin/

ADD build/libs/${artifact}-${version}.jar $APP_HOME/${artifact}.jar

EXPOSE 3000
