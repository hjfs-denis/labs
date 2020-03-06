# Maven
    ~ helps to manage all dependencies
    ~ has repositories of jar 
    ~ has artifacts we can download

* Manages itself by Maven
    * We need to mannually place the jars in Spring
    * If one jar file depends on another(Spring, hibernate) both should have same versions
    * Switching from spring 4 to Spring 5, we need to change mannually


Note :

* Group-ID (Group of related projects) (com.HDFC) 
        Like pakage name
* Artifact-ID (Any project) like (LoanProject, creditcardProject for HDFC)
        Like projects inside package





# To do

1. Step-1
    * Configuring pom.xml (Product Object Model) 
    * By default it configured to Java 1.8  we need to changes this.
    * Add Dependencies like Spring-context in pom.xml

2. Step-2
    * Copy applicationContext.xml into  resource folder



