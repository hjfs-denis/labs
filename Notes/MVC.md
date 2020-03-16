# MVC is an architecture




# MVC (Model View Controller) Architecture

1. Has UI for client (View)
2. Contains data for (Modal)
3. Controller helps navigate between views (Controller)



# In traditional MVC
1. Views are built in JSP
2. Modals by POJO
3. Controller by servlet



# Spring MVC
    ~ Works on top of spring core and POJO based so thet it can use DI and IOC
* Front Controller(DispatcherServlet) - is the palce where request goes first to spring framework
* Modal
* View
* Child Controller


------------------------------------------------------------------------------------------------------------------------------------------------


# Steps to do Spring with MVC & Hibernate

* By Default 
    - Create Layered Architecture(Entity, DAO, Controller, Service)


# Configure Database and project Dependencies

1. Create Dynamic Web Project

2. Configure the db
        1. Create table  
        2. insert data
        3. Create Sequence

3. Configure the jar dependencies (Should be added in build path)
    * Inside WebInf / lib
        1. Spring Jars
        2. Hibernate Jars
        3. ojdbc.jar
        4. jstl jars
Note :
    * Jars collection of classes
    * jstl (tl- TagLibrary) collection of tags


# Layered Architecture
# Create the entity

1. Properties of the bean (Private Variables )
        Eg : private String firstName;
2. Generate getters & setters, Contructors, toString()


    # Config Entity Bean in Hibernate

    1. @Entity (is a bean which is perisitent in the db which are used in orm with JPA based annotation)
    2. @Table 
            Eg : @Table (name = "customer")
    3. @Id
    4. Cerate Sequence generator
            Eg : @SequenceGenrator(name = "custseq" sequenceName = "cist_id_seq")
    5. Generate sequence value for the filed
            Eg : @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custseq")
    6. @Column(name = "")

Note : 
    JPA std spec used to build ORM appln.



# Create the DAO

1. Interface for DAO 
    Eg : CRUD Operation
2. Implementation for DAO

        # Config with Spring

        1. @Repository
        2. @Autowired 
            * Get the bean SessionFactory(DI) from Spring

    # To retreive all data from db
    1. Get the Curentsession from sessionFactory
        Eg : Session session = sessionFactory.getCurrentSession();
    2. HQL Query
        Eg : Query<customer> theQuery = session.createQuery("from customer",Customer.class)
    3. Get the resultSet
        Eg : List<customer> customers = theQuery.getResultList();

    # To save the data into db


    # To delete data from db


    # To retreive a specific data from db



# Create the Service layer

1. Interface for Service 
    Eg : CRUD Operation
2. Implementation for Service

    # Config with Spring

    1. @Service
    2. @Autowired (Get instance from bean using Spring)
            Eg : private CustomerDAO customerDao;
    3. @Transactional (Configured in Spring to manage commit ans start the transaction)


# Configuring servlet in web.xml file

1. Servlet 
    Eg : 
        <servlet>
            <servlet-name>dispatcher</servlet-name>
            <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
            <init-param>
                <param-name>contextConfiguration</param-name>
                <param-value>/WEB-INF/spring-servlet.xml</param-value>
            <init-/param>
        </servlet>

2. Servlet Mapping
    Eg :
        <servlet-mapping>
            <servlet-name>dispatcher</servlet-name>
            <url-pattern>/customer-module</url-pattern> {/ - represent all pages, /customer-module - rep. specific page for spring}
        </servlet-mapping>

3. Which file to laod first
    Eg :
        <absolute-ordering>
            <name>spring_web</name>
        </absolute-ordering>

4. Session Management (15 minutes in XML) (15 in function)
    Eg : 
    <session-config>
        <session-timeout>15</session-timeout>
    </session-config>

Note :
    ~ For web application we have webApplicationContext (llly ApplicationContext for JAVA Appln.)
    ~ DispatcherServlet(frontController) which actually extends FrameworkServlet in Spring        



# Configuring Spring Bean in spring-servlet.xml file
    * inside web-inf -> spring-servlet.xml

1. MVC Annotation based (Support for MVC)
    Eg : <mcv:annotation-driven />

2. Perform component scan
    ~ To create bean (By default it will perform by type)
        Eg : <context:component-scan base-package = "com.demo">
    ~ To fetch Bean
        Eg : @Autowired


3. Define db sorce / connection pool 


4. Setup hibernate session factory


5. Setup Hibernate transaction Manager

6. Enable transaction
    Eg : <tx:annotation-driven />

7. Define Spring MVC view Resolver
    Eg : 
        <bean class = "org.springframework>
            <property name = "prefix" ></property>
            <property name = "suffix" ></property>
        </bean>


# Controller

1. @Controller
2. @RequestMappin("/customer-module")
3. @Autowired
4. @GetMapping("/list")