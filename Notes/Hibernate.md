# Hibernate
1. It takes object from java and persistence into db
    * Persistence ~ permanent stored in memory
    * whereas normally Transient Objects not stored in the db
2. ORM(Object/Relational Mapping) 
    * Helps to convert object into data rows to store into db and viceversa.



# Hint
1. Session in hibernate = Connections in jdbc
2. Session Factory (creates many persistent obj )=  Application Context





# Why Hibernate
1. Checked Exception gone away 
    SQLException, ClassNotFoundException, try, catch these need to be in JDBC 
2. SQL Query no need to wite query within strings
3. Data type conversion should use same in both db and query
4. Compatibility ~ Switching db will break our query in JDBC



# Advantages
* POJO which is stored in Hibernate are entity Bean
* reduce boiler-plate jdbc code
* Automatically create table based on java object (Entity Bean)
* Helps switch db, as it generates the db specific queries



# Introduction
1. Hibernate works on top of JDBC
2. It was from JBose Group developed by Gavin King
3. Replacement from Entity Bean in EJB
4. Hibernate is ORM (Object Relational Mapping) framework.



# Configuration
1. Hibernate Factory uses xml file
2. Hibernate Factory will create session factory(like DriverManager in jdbs)
3. Session Factory will provide many connection (Session)

In DB :

    Create ~ used to create table and delete existing data if available
    Update ~ Create schema if schema not available and udate existing data
    Create-drop - Create and at the end(Closing Session Factory) it will drop
    Validate ~ no dml operations can perform , it will check the data



# Dialect
    Native standard for SQl is ANSI(American National Standards Institute).
        Oracle have Oracle SQL , those syntax are differ from ANSI
        Micrisoft have T-SQL, those are differ from ANSI

        
        Scenario(Dialect) : Same lanuage like tamil spoken differently from one region to another



# hibernate Query language

1. Runs on hibernate and works on entity (Similar to query works on oracle)

    Similar to Hibernate ORM, we have Ibatis etc..,
    Native SQL
    Std way : JPA 



# To do
1. Step-1
    * Create a POJO (Entity Bean)
        ~ contains property, setters and getters and toString


2. Step-2
    * Configure Hibernate in XML (dbconnection & Hibernate Mapping)
    * File Name : Hibernate.cfg.XML (In spring we can have any name)
    * Mandatory Property -> url, username, passwod & mapping

    Note : (For add xml along with some content related to hibernate)
        Eclipse -> help -> Eclipse Marketplace --> In find (Hibernate) -> JbossTool --> 


3. Step-3 
    * Hibernate Mapping  (Will perform DDL and DML operation)
    * Each entity(POJO) will have a mapping file
        1. Create XML File in Modal Pakage (Name : Product.hbm.xml)
                 

4. Step-4
    * Configure the hibernate libraries using maven or add mannually jar files
    * Add to buildpath


5. Step-5
    ~ Start write appln.

    * Configuration 
        Eg : Configuration c = new Configuration.configure();
    * ServiceRegistry
        Eg : serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.    getProperties   ()).buildServiceRegistry();
    * SessionFactory
        Eg : sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    # Note : 
    1. First 3 points to establish hibernate (Similar to ApplicationContext in Spring)
    2. Remaining points for db actions

    * Create the Session
        Eg : Session s = sessionfactory.openSession();
    * Begin the transaction
        Eg : Transaction t = s.beginTransaction();
    * Create the entity
        Eg : Entries for POJO class
    * Save the entity
        Eg : s.save(product);
    * Commit the transaction
        Eg : t.commit();
    * Close the session
        Eg : s.close();


