# MiniProject
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.arrizaqu.java</groupId>
  <artifactId>com-arrizaqu-crud</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>pom</packaging>
  
  <properties>
    <org.springframework.version>4.2.6.RELEASE</org.springframework.version>
	<apache.tiles>3.0.5</apache.tiles>
</properties>
  
  <dependencies>
  
  <dependency>
  	<groupId>jstl</groupId>
  	<artifactId>jstl</artifactId>
  	<version>1.2</version>
  </dependency>
  
  <dependency>
  	<groupId>javax.servlet</groupId>
  	<artifactId>javax.servlet-api</artifactId>
  	<version>3.0.1</version>
  	<scope>provided</scope>
  </dependency>
  
  <dependency>
  	<groupId>javax.servlet.jsp</groupId>
  	<artifactId>javax.servlet.jsp-api</artifactId>
  	<version>2.2.1</version>
  	<scope>provided</scope>
  </dependency>
  
  <dependency>
  	<groupId>org.hibernate</groupId>
  	<artifactId>hibernate-entitymanager</artifactId>
  	<version>5.1.0.Final</version>
  </dependency>
  
   <dependency>
        <groupId>org.springframework.data</groupId>
        <artifactId>spring-data-jpa</artifactId>
        <version>1.10.1.RELEASE</version>
    </dependency>

   <dependency>
	   	<groupId>mysql</groupId>
	   	<artifactId>mysql-connector-java</artifactId>
	   	<version>5.1.35</version>
	   </dependency>
	   
	 <dependency>
	    <groupId>commons-dbcp</groupId>
	    <artifactId>commons-dbcp</artifactId>
	    <version>1.2.2</version>
	</dependency>

   <!--
	    Core utilities used by other modules.
	    Define this if you use Spring Utility APIs (org.springframework.core.*/org.springframework.util.*)
	-->
	
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-core</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Expression Language (depends on spring-core)
	    Define this if you use Spring Expression APIs (org.springframework.expression.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-expression</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!-- 
	    Bean Factory and JavaBeans utilities (depends on spring-core)
	    Define this if you use Spring Bean APIs (org.springframework.beans.*) 
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-beans</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Aspect Oriented Programming (AOP) Framework (depends on spring-core, spring-beans)
	    Define this if you use Spring AOP APIs (org.springframework.aop.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-aop</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Application Context (depends on spring-core, spring-expression, spring-aop, spring-beans) 
	    This is the central artifact for Spring's Dependency Injection Container and is generally always defined
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-context</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Various Application Context utilities, including EhCache, JavaMail, Quartz, and Freemarker integration
	    Define this if you need any of these integrations
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-context-support</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Transaction Management Abstraction (depends on spring-core, spring-beans, spring-aop, spring-context)
	    Define this if you use Spring Transactions or DAO Exception Hierarchy
	    (org.springframework.transaction.*/org.springframework.dao.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-tx</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    JDBC Data Access Library (depends on spring-core, spring-beans, spring-context, spring-tx)
	    Define this if you use Spring's JdbcTemplate API (org.springframework.jdbc.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-jdbc</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Object-to-Relation-Mapping (ORM) integration with Hibernate, JPA, and iBatis.
	    (depends on spring-core, spring-beans, spring-context, spring-tx)
	    Define this if you need ORM (org.springframework.orm.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-orm</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Object-to-XML Mapping (OXM) abstraction and integration with JAXB, JiBX, Castor, XStream, and XML Beans.
	    (depends on spring-core, spring-beans, spring-context)
	    Define this if you need OXM (org.springframework.oxm.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-oxm</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Web application development utilities applicable to both Servlet and Portlet Environments
	    (depends on spring-core, spring-beans, spring-context)
	    Define this if you use Spring MVC, or wish to use Struts, JSF, or another web framework with Spring (org.springframework.web.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-web</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Spring MVC for Servlet Environments (depends on spring-core, spring-beans, spring-context, spring-web)
	    Define this if you use Spring MVC with a Servlet Container such as Apache Tomcat (org.springframework.web.servlet.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-webmvc</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Spring MVC for Portlet Environments (depends on spring-core, spring-beans, spring-context, spring-web)
	    Define this if you use Spring MVC with a Portlet Container (org.springframework.web.portlet.*)
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-webmvc-portlet</artifactId>
	  <version>${org.springframework.version}</version>
	</dependency>
	
	<!--
	    Support for testing Spring applications with tools such as JUnit and TestNG
	    This artifact is generally always defined with a 'test' scope for the integration testing framework and unit testing stubs
	-->
	<dependency>
	  <groupId>org.springframework</groupId>
	  <artifactId>spring-test</artifactId>
	  <version>${org.springframework.version}</version>
	  <scope>test</scope>
	</dependency>
	
	<dependency>
		<groupId>org.apache.tiles</groupId>
		<artifactId>tiles-core</artifactId>
		<version>${apache.tiles}</version>
	</dependency>
	
	<dependency>
		<groupId>org.apache.tiles</groupId>
		<artifactId>tiles-jsp</artifactId>
		<version>${apache.tiles}</version>
	</dependency>
	
	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-log4j12</artifactId>
		<version>1.7.21</version>
	</dependency>
	
	<dependency>
		<groupId>org.codehaus.jackson</groupId>
		<artifactId>jackson-mapper-asl</artifactId>
		<version>1.9.13</version>
	</dependency>
	
	<!-- 
		javax servlet api
	-->
	

  </dependencies>
  
  <build>
  	<plugins>
  		<plugin>
		  <groupId>org.eclipse.jetty</groupId>
		  <artifactId>jetty-maven-plugin</artifactId>
		  <version>9.1.3.v20140225</version>
		</plugin>
		<plugin>
	        <groupId>org.apache.maven.plugins</groupId>
	        <artifactId>maven-compiler-plugin</artifactId>
	        <version>3.1</version>
	        <configuration>
	            <source>1.7</source>
	            <target>1.7</target>
	        </configuration>
	    </plugin>
  	</plugins>
  </build>
</project>

<!-- 
note : lihat : 
http://qussay.com/2013/09/13/solving-dynamic-web-module-3-0-requires-java-1-6-or-newer-in-maven-projects/
 -->
