# Spring Boot (Latest version of Spring)

1. is an application Framework builds on top of Spring (We can't build app without spring)
2. allows to build cloud appln.
3. reduces boiler plate code (Dispatcher Servlet)
4. inbuilt tomcat server
5. not need to config xml file
6. We can make Standalone appln. {.jar} (Spring - .war)

# Boot and DevTools (Project Name extension)
    * Boot represents it's an Spring Boot project
    * DevTools takes care of deployment (Tomcat's work)

# Disadvantage of Spring
1. Configuring DispatcherServlet, InternalResourceViewResolver, Tomcat, jar-files, Hibernate
2. Deploy Spring into Tomcat
3. Should be deployed explicitly on Tomcat

# Advantages of SpringBoot
1. Easy Hibernate Integration
2. minimal Config.
3. No need to configure Tomcat
4. cloud-ready appln.
5. automatic deployment
6. takes care of jar versions and dependencies



# SpringBoot Application with Restservices
# Steps to do

# Step 1 : Setup
1. Create SpringBoot Maven Application 
        Eg : File -> New -> Spring Starter Project
                    or
            Using Link : https://start.spring.io/

2. Configure dependencies and plugin in pom.xml
        Eg : Web, DataJPA, DevTools, test, jdbc and maven plugin and Java Version

    # Thing to remember
    * Should give proper pakage name in groupId
    
3. Configure Apllication.properties file for DB connection
        Eg : ddl, driverClass, url, username, password, platform, show-sql,port

- Note : 
    * Archetype : Template (Specific to Maven)
        * Architype - Project
        * Group - Company
        * Version - version of the product
