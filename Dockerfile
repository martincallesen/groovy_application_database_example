FROM gradle:7.1.0-jdk16
COPY . /project
WORKDIR /project
RUN gradle bootRun --no-daemon