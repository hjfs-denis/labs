:books: Spring Framework

    Official Site : Spring.io




# Feature
1. Spring is a LightWeight framework used ti build Enterprise appln.
2. Integrates with other frameworks like hibernate
3. helps build losely coupled systems
4. Open Source and has large community
5. Has numerous modules like Spring core, MVC, Spring REST etc..,





# Spring Configuration can be done in 3 ways
1. XML
2. Annotation
3. Java





# Libraries
1. Should import libraries for Spring (Similar to ojdbc.jar for db connection)
    * We can add manually or using maven too 
    (Maven Manages own repo instead of having on our own and provide denpendencies whenever needed).
2. Should add those imported libs in buildPath 





# Modules

1. Spring Core 
        
    1. Spring core container runs in JVM (Similar to Servlet container)
    2. Core container manages the Life cycle of beans(POJO).


    # Cofig.xml    
        * We can have more than one xml file for  and we can get it using ApplicationContext


    # Core container contains ~ 

    * Beans 
            ~ POJO

    * Core      
            ~ Core component take care of dependency injection and IOC features.

    * Context   
            ~ It holds all ur beans and provides us to access all ur beans.

    * Expression Lang. 
            ~ manipulate data within bean





# IOC (Inversion of Control)

1. IOC is a principle
2. Uses IOC for dependency Injection
3. Spring instantiate classes for us instead of manually instantiating it.
 
    # Bean
    1. Should use Application context for spring config to create bean
    2. GetBean to access instance from bean
    2. In XML, 
        * Use bean tag with name and class





# DI (dependency Injection)

1. DI is a principle
2. Whereas One object supplies the dependencies of another object

    # Types of DI

    1. Using Contructor arguments (Contructor bases Injection)
        1. Should have contructor with args in class
        2. In XML
            # Without Autowire
            * Inside bean tag, we need contructor-arg tag , we can have more than one arg
            * Index to represent the position of arg in constructor <This process is Wiring>
            * ref

            # With Autowire
                Autowire works based on type
                Eg : <bean class ="" name = "" autowire = "constructor">


    2. Using property (Setter based Injection)
        1. Should write setter with private instead of constructor in class
        2. Changes in XML
            # Without Autowire
            * Property instead of Contructor-arg 
            * Name instead of index
            * Ref reamins the same
            
            # With Autowire
                Eg : <bean class ="" name = "" >     

            # Note 
                In setter based injection the variable name should mapped in the  XML file


    3. (Field Based Injection)






# Steps To Do

1. Step-1
    * Create a POJO (Bean)
        ~ contains property, setters and getters and toString


2. Step-2
    * Configure the Spring libraries using maven or add mannually jar files
    * Add to buildpath


3. Step-3
    * Config the ApplicationContext in the XML file (IOC, DI)


4. Step-4
    * Use the bean in the main program

-----------------------------------------------------------------------------------------------------

# Pracitses

# Building first spring appln.

1. Use core container for IOC & DI. (IOC, DI are Design Principles)

2. Layered Architecuture in Enterprice Appln.
        
    File -> New -> Java Project -->

    # Advantage of layered archi :

        All db connectivity goes in repo layer
        Modal contains data & UI
        rest services in seperate services layer

    # Disadvantage

    instances are tighly coupled in Layered Arch


# Spring sample app

1. Download Spring frame work
2. Import jar files inside lib folder and build the path
3. Create spring bean (applicationContext.xml) inside src folder

