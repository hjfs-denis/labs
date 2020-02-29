
# Web Components {Servlets & JSP}

    In web, we have client(Browser) & server

    Note : 
            w3c -> controls web (Standards maintained by them) --> www.w3c.org / mdnwebdocs

# HTTP

    HTTP protocol is stateless

    request - goes from client to server
    response - goes from server to client

    P --

    Protocol - set of rules to perform actions from client to server

    . Http Methods :- (Std web scenario)

        CRUD Operations ::

        Get (R)    ~ Browser send req to server
                    Eg : https://www.amazon.com (got homepage from server)

        Put (U)    ~ Modify the resource
                    Eg : modify the items in the cart
        
        Post (C)   ~ browser send data to server 
                    Eg : adding items to cart (Insert / delete / modify)
        
        Delete (D) ~ delete the resource
                    Eg : delete items from cart


# Eclipse 

    Open perspective --> Java EE

# Setup Tomcat
    
    Server --> Apache Tomcat

    1. Download Apache Tomcat
    2. Goto servers tab in Eclipse
    3. Double click the link to create new server
    4. Select apache version
    5. Set the path
    6. Click finish and start

# New JEE Project

File ->  new -> dynamic web project -> chose web.xml generate -> finish

    * HTML pages Should  be inside web content folder

    * Create servlet

# Servlet  


# JDBC

    1. Get jar file (ojdbc14.jar)
        1. Download the jar files
        2. Copy inside the jar file (webContent -> WEB-INF -> lib)

        Note : If not done it will throw class not found exception
    
    2. Load the driver
        Eg : Class.forName("oracle.jdbc.driver.OracleDriver);
    
    3. Establish the connection
        Eg : Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sysdba", "oracle")

    4. Create the statement
        Eg : Statement stmt = con.createStatement();       

    5. Execute the statement
        Eg : stmt.executeupdate(sql);


Day 2 :

Life Cycle of servlet

1. What is servlet ?
    ~ Servlets are server side java pgm
    ~ Runs on a servlet container
        servlet container like tomcat, weblogic, websphere, glassfish
    ~ Life Cycle of servlet managed by container
    ~ Life cycle methods present inside servlet interface



Need to learn :7 OSI Layers



# JSP : (Java Server Pages)

    JSP are finally translated and compiled to servlets automatically

1. Why we need JSP ?





Listener

Session :

    Eventss are certain activity which occurs at certain pt of tym


# Notes : 

1. Ways to config. JAVA Appln.

    XML Config
    Annotaion Config + xml Tag
    Java config

    
