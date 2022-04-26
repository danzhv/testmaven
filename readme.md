# Step test
This project should login to step website, browse its tabs and make sure the tabs are loaded.
## Getting Started
#### Prerequisites
- [Java 11](https://www.oracle.com/java/technologies/downloads/#java18) as programming language
- [Maven](https://maven.apache.org) for Package Management and Build Automation
- [Selenium](https://www.selenium.dev) for Web Automation
- [JUnit 5](https://junit.org/junit5/docs/current/user-guide/) as framework

#### Running the project
Steps are listed below to get this project up and running in your development environment.
- Setup Java with JDK
- Setup Maven

Run maven build command:

    mvn clean install
    
#### How to get to instance
Download [MongoDB](https://www.mongodb.com/try/download/community) community server and [step-controller](https://github.com/exense/step/releases/tag/3.18.3).

- Unzip step archive. There should be a controller folder.
- If you’ve downloaded a JDK in a zip format, unzip it somewhere in the folder of your choice. If you’ve downloaded the exe version, run through the wizard using the default settings. Set the path to the JDK’s home into the start scripts of the controller (step-controller-x.y.z/bin/startController.bat) and agent (step-agent-x.y.z/bin/startAgent.bat). Both have JAVA_PATH variable which can be set according to the example commented in the script file itself.
- Run through the default steps of MongoDB’s installation wizard, using the default port (27001).
#### Run
- Start a basic MongoDB instance from the controller’s folder by using our convenience script (step-controller-x.y.z/bin/startMongo.bat)
- Make sure that no existing program is already running on ports 8080 and 8081 which will be respectively used by step for web traffic and grid communication.
- Start the controller script (startController.bat), check the console’s output, make sure it ends up in RUNNING state and that no fatal error or exception occurred. You should be seeing something like this:

        Started o.e.j.s.ServletContextHandler@c6bf8d9{/rest,null,AVAILABLE}
        Started o.e.j.s.h.ContextHandler@44392e64{/,null,AVAILABLE}
        Started o.e.j.s.ServletContextHandler@e18d2a2{/files,null,AVAILABLE}
        Started ServerConnector@7aedcf87{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
        Started @55602ms'
- Start the agent script. If started successfully, the agent will just print out a couple of warnings and outputs, such as follows:
    
        WARNING: The following warnings have been detected: HINT: A HTTP GET method, public void step.grid.agent.AgentServices.reserveToken(java.lang.String) throws step.grid.agent.tokenpool.AgentTokenPool$InvalidTokenIdException, returns a void type. It can be intentional and perfectly fine, but it is a little uncommon that GET method returns always "204 No Content".
        HINT: A HTTP GET method, public void step.grid.agent.AgentServices.releaseToken(java.lang.String) throws step.grid.agent.tokenpool.AgentTokenPool$InvalidTokenIdException, returns a void type. It can be intentional and perfectly fine, but it is a little uncommon that GET method returns always "204 No Content".
 Step’s web application should now be running at the following address http://localhost:8080. You can log in immediately as an admin using the following default credentials:
 
        user: admin
        password: init
#### Dependency
File named pom.xml should have dependencies:
- [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [JUnit Jupiter](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)

Which looks like this:

        <dependency>
                    <groupId>org.seleniumhq.selenium</groupId>
                    <artifactId>selenium-java</artifactId>
                    <version>4.1.1</version>
                </dependency>
                
#### Running the tests
To run all tests, call `mvn clean test`
