# 2023-sapient-asde-ggn


# Introduction 

# Day1 
	
	OOAD	Introduction to OOAD & UML Understanding the need of documents	
	


### Write user stories for week 1 

Team 1 (5): Adithya, Vivek, Prince, Rithik, Saloni 

Team 2 (5): Anupam, Ayush, Bhaswata, Sahil, Sanjay 

Team 3 (4): Suraj, Ankit, Deepak, Madhavan  

Team 4 (4): Ritesh, Ehtesham, Dikshant, Akshath

Team 5 (4): Soumya, Arik, Shashank, Purvi Goyal 


## Epic Needs: To build banking appliction 

1. Customer Login  + Registration 
2. Employee Login + Admin Login 
3. Customer updated details (profile section)
4. Create customer account (SB/RD/CA)
5. Do transaction Debit, Credit 



## Build application with CLI  -

 User Stories 



``` Scenario: To build menu based system for banking 

AC 1: 
Given the application is running 
When the user sees options like 
	1. Register Customer 
	2. Login Customer 
	3. Login Admin 
	4. Login Employee 
	5. Logout Out 
Then user should be able to select the option 
And the optin is 1(Register Cusotmer)
Then the user should be asked with details like 
	first name, last name, mobile, username, password 
When user hits enter 
Then validate all the details which are entered
When the details are valid 
Then Show message "CUSTOMER CREATED SUCCESSFULLY"

``````



Types of OOAD Diagrams 

1. Architecture Diagram 
2. Class Diagram 
3. Use Case Diagram 
4. Sequence Diagram 
5. Flow Diagram 



### Overview of sequence diagram 

Customer -> Register -> Success 
			 -> Login -> Home Page 
			 -> Login -> Account View 
			 -> Login -> Credeit Money 
		 	 -> Login -> Change Pasword 

## Tools 
- Draw.io 
- plantUML 


# Day 2 

- Maven - Building Simple Java Project with Maven(Dependencies, Build, Plugins) Overview of Gradle
	- loggers 
		- java.util 
		- slf4j 
			```
				<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-simple -->
				<dependency>
					<groupId>org.slf4j</groupId>
					<artifactId>slf4j-simple</artifactId>
					<version>2.0.7</version>
					<scope>test</scope>
				</dependency>

			```
		- maven provides a way to scafold the project 
			- it could be simple project - quickstart 
			- hibernate project 
			- spring project 
			- ... 
			- over 2300 projects in there repositories 

		- https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

		- as of today we have 3339 arch types 

- Introduction to DevOps,Working with Jenkins - building application with Jenkins, Understanding plugins, creating pipeline with groovy scriptRecap of Git working with BitBucket, 

	1. Java Program Written 
		1.1 can be regular java project 
		1.2 it could be maven project - mvn clean compile install test 
		1.3 we shall have 1 github repo with has maven project then build a pipeline project 



	- jenkins pipeline steps 

	```
		pipeline {
			agent any 
			stages {
				stage('Build') { 
					steps {
						echo "Build Step"  
					}
				}
				stage('Test') { 
					steps {
						echo "Test  Step" 
					}
				}
				stage('Deploy') { 
					steps {
						echo "Deploy Step" 
					}
				}
			}
		}
	```

```
pipeline {
    agent any

    tools {
        maven "m3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/jglick/simple-maven-project-with-tests.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}

```

- with parameters 

```
parameters {
        string(name: 'branch', defaultValue: 'master', description: 'please enter branch to execute')
        choice(name: 'test', choices: ['yes', 'no'], description: 'do you want to test')
    }
```

# day 3 

- Recap of Git working with BitBucket
	- Mono repo Concept - there shall be only 1 branch and all developers shall create the folders 
	- branching stratergy - create production, pre-production,dev branch from there created your 	
			feature branches from JIRA + do PR 

- Intro to Ansible and Terraform
	- IAAC - Infrastructure As A Code 
		- Ansilbe - Playbooks 

- MongoDB	
	MongoDB 
	NoSQL DB
	CRUD
	Understnaing & Creating  Indexes
	CAP theorem


- working 	

- mongod --dbpath . --port 27017 

- mongo 

- show dbs; - show all dbs 

- use sapient-db; - create and switch db 

- db; - to know which db you are connected 

- to create a record 

```


		{
			empid:101, 
			empName: "Harish", 
			empSal:12345
		}

	db.emps.insert({empid:101, empName: "Harish", empSal:12345}); 
	db.emps.insert({empid:102, empName: "Aditya", empSal:12345, city:"Delhi"}); 
	db.emps.insert({empid:103, empName: "Prince", empSal:2233, country:"India"}); 
	db.emps.insert({empid:104, empName: "Sahil", empSal:3322}); 
	db.emps.insert({empid:105, empName: "Soumya", empSal:4422, technology:"Java"}); 
	
	
```

- show collections; 

- get me salary more than 3000 

```
	db.emps.find({}); -> select * from emps; 
	db.emps.find({empSal:{$gt: 3000}});
	db.emps.find({empSal:{$lt: 3000}});
```


- db.emps.find({
			empSal:{$gt: 3000}, 
			city:{$eq:"Delhi"}
		});


db.emps.save 
- working with save & insert (difference )
- db.emps1.insert({empid:101, empName: "Harish", empSal:12345}); 
- db.emps1.save({"_id" : ObjectId("65797d6ef1902dfbe4ac0849"), empid:102, empName: "Harish", empSal:12345, city:"Bengaluru"}); 


- select * from emp where empcity='delhi' and salary > 3000; 
- select empname, empsal, emptechnology from emp where empcity='delhi' and salary > 3000; 


-- projection 

- db.emps.find({}, {empid:1, _id:0, empName:1})



- capped collection 
- db.createCollection("capp-coll", {capped:true, size: 1000, max:5})



- insert multiple records 

- db.multipleRecordTest.insert([
	{accid:101}, 
	{accid:102}, 
	{accid:103}, 
])

- second highest salary 

- embedded document 

```
	db.embed.insert({
		empId:101, 
		empName:"Naveen", 
		empSal: 1234, 
		address: {
			houseNo: 100, 
			street: "Stevenscreek",
			city: "Bengaluru",
			state: "Karnataka"
		}}); 


		db.embed.insert({
		empId:102, 
		empName:"Kumar", 
		empSal: 2233, 
		address: {
			houseNo: 123, 
			street: "Stevenscreek",
			city: "Bengaluru",
			state: "Chennai"
		}}); 
```
-- find inside embeded document 


- db.embed.find({"address.city" :"Bengaluru"})



- db.embed.find({"address.state" :"Karnataka"})



- update -- you can set 
- db.emps.update({}, {$set:{city:"NewYork"}}); 


- you can unset 
 db.emps.update({empid:104}, {$unset:{city:""}}); 

- db.emps.update({}, {$set:{city:"NewYork"}}, {multi:true}); 




- db.emps.update({empid:104}, {$set:{city:"NewJersey",  empSal:5000}}, {upsert:true}); 


- db.emps.update({empid:110}, {$set:{city:"NewJersey",  empSal:5000}}, {upsert:true}); 


- create index 

> db.emps.find().explain("executionStats");
> db.emps.find({empName:"Aditya"}).explain("executionStats");
> db.emps.createIndex({empName:1})

```
	db.getCollectionNames().forEach(function(collection) {
		indexes = db[collection].getIndexes();
		print("Indexes for " + collection + ":");
		printjson(indexes);
	});
```

- db.emp.stats()

- Db.emp.totalIndexSize()



# Day 4 

1. Use as much of SCM 
2. Create a base structure 
3. Assign work to individuals 
4. Application built should be easy to integrate 
5. Working on individual branches 
6. Testing the code written 
7. 



- head first java 
- complete reference 
- OS by galvin 



```
	Vector<Object> v = new Vector<>(); 

```




Account [accountId=101, accountBalance=2000.0, accountHolderName=Anupam], hashcode 1221555852
Account [accountId=103, accountBalance=4000.0, accountHolderName=Arik], hashcode 1705929636
Account [accountId=102, accountBalance=3000.0, accountHolderName=Kiran], hashcode 1297685781
Account [accountId=101, accountBalance=2000.0, accountHolderName=Anupam], hashcode 511833308


---------------


Account [accountId=101, accountBalance=2000.0, accountHolderName=Anupam], hashcode 65
Account [accountId=103, accountBalance=4000.0, accountHolderName=Arik], hashcode 65
Account [accountId=101, accountBalance=2000.0, accountHolderName=Anupam], hashcode 65
Account [accountId=102, accountBalance=3000.0, accountHolderName=Kiran], hashcode 75


---------------------------

Account [accountId=101, accountBalance=2000.0, accountHolderName=Anupam], hashcode 65
Account [accountId=103, accountBalance=4000.0, accountHolderName=Arik], hashcode 65
Account [accountId=102, accountBalance=3000.0, accountHolderName=Kiran], hashcode 75

---------------------------

Account [accountId=102, accountBalance=3000.0, accountHolderName=Kiran], hashcode 981748484
Account [accountId=103, accountBalance=4000.0, accountHolderName=Arik], hashcode -710339085
Account [accountId=101, accountBalance=2000.0, accountHolderName=Anupam], hashcode -962661008

----------------------


```
	interface Area {
		int size(); 
	}



```



Week 1 : To enable user login and perform transaction on platform 

1. to setup jenkins pipeline for the application built 
	AC: 
	Given the application is running in the local system 
	And the code is seeded on the SCM on the branch dev 
	When the trigger is made with Jenkins (CI/CD) tool 
	Then the build should take place 
	And the build shall have different stages build, deploy 
	And application should be able to invoke from local system 

2. creating customer registration 
	AC: 
	Given the application working 
	When the options show are 
		1. Customer Regitration 
		2. Customer Login 
		3. Admin Login 
		4. Exit 
	And user selects option 1 
	Then the new screen shall accept parameters first-name, lastname, age, userid(unique check), password, confirm password 
	When all the details are validated 
	Then the message is shown to end user "Customer Created successfully with ID :xxx "
	Then navigated to home screen with option 
		1. Customer Regitration 
		2. Customer Login 
		3. Admin Login 
		4. Exit 


3. creating customer login 
4. Admin login 
5. Profile change for the customer 



1. User stories 
2. create folder structure on for project (discuss with the team )
3. all developer should have tools to develop + setup database in local system 
4. make user stories work in the application 



# Day 5 

- understanding beans 

```
	-- bean class 
	class Registration {
		String userName;
		Name name; 
		String password;  enum GENDER; Date dob; 
		Address address;
	}


	class RegistrationAdmin {
		String userName;
		String password; 
		Name name; 
		 enum GENDER; Date dob; 
		Address address; 
	}


class Name {
	private String firstName; 
	private String lastName;


	// setters 
	public void setFirstName(String firstName) {
		this.firstName = firstName; 
	}
	/ getters 


}
	class Address {
String streetName; int houseNo; String city; String state
	}


	class SomeDao {

		public boolean registerCustomer(Register register){

		// your business logic 
		}

	}


	// main 

	PSVM {
			SomeDao sd = new SomeDao(); 
			
			Address addr = new Address( "Street 14", 123, "bengaluru", "Karnataka"); 
			Register r  = new Register("Naveen", "keepguessgin@123", "Naveen", "kumar", GENDER.MALE, new Date("10-1-2023"),addr); 

			sd.registerCustomer(r)

	} 
```


- a beans is a class which has private variables, public getters and setters 
- WORM - WRITE ONCE READ MANY



- mysql db works 

- create database sapdb; 
- use sapdb; 
- show databases; 
```
	create table employee(empid int primary key, empname varchar(30), empsalary decimal (10,2), empemail varchar(50)); 
```


com.mysql.cj.jdbc.Driver.class


- arrays will start indexing from 0 
- retsult will set start indexing from -1 
- positional parameters will start indexing from 1 


# Day 6

#Java Annotations
- @Deprecated
- @Override
- @SupressedWarnings
- Custom Annotation

#FunctionaInterface
A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.A functional interface can have any number of default methods. Runnable, ActionListener, and Comparable are some of the examples of functional interfaces. 

Functional Interface is additionally recognized as Single Abstract Method Interfaces.
package org.example;

@FunctionalInterface
interface MyInterface{
    public abstract void myMethod();
//    public abstract void myMethod2();
    //void myMethod2();
}
public class Main {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface(){

            @Override
            public  void myMethod() {
                System.out.println("I am from Functional Interface");
            }
        }   ;

        //Lets call the method
        myInterface.myMethod();
    }

#Lambda expressions
A lambda expression is simply a function without any name. It can even be used as a parameter in a function. Lambda Expression facilitates functional programming and simplifies development a lot.

synatx - (parameters) -> expression or (parameters) -> { statements; }

@FunctionalInterface
interface Addable{  
    int add(int a,int b);  
}  
public class JLEExampleMultipleParameters {

    public static void main(String[] args) {
       // Multiple parameters in lambda expression  
        Addable withLambda = (a,b)->(a+b);  
        System.out.println(withLambda.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable withLambdaD = (int a,int b) -> (a+b);  
        System.out.println(withLambdaD.add(100,200));  
    }
 }

 public class DifferentWaysListIterateProgram {

    public static void main(String...args) {

        List < String > courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

   
        // JDK 8 streaming example lambda expression
        courses.stream().forEach(course -> printCourse(course));

        // JDK 8 streaming example method reference
        courses.stream().forEach(DifferentWaysListIterateProgram::printCourse);

        // JDK 8 for each with lambda
        courses.forEach(course -> printCourse(course));

        // JDK 8 for each
        courses.forEach(DifferentWaysListIterateProgram::printCourse);
    }

    // common method to print course
    private static void printCourse(String course) {
        System.out.println("course name :: " + course);
    }
}

#Stream API
streams are wrappers around a data source, allowing us to operate with that data source and making bulk processing convenient and fast.

A stream does not store data and, in that sense, is not a data structure. It also never modifies the underlying data source.

package org.example.streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppExample {

    public static void main(String[] args) {

        //lets write the code for finding certain strings without strem

        List<String> names = new ArrayList<>();
        names.add("Ayush");
        names.add("Aditya");
        names.add("Akshat");
        names.add("Anupam");
        names.add("Purvi");

        //1:Without Stream API  (Sequential Execution)
//        int count = 0;
//        for (String s : names) {
//
//            if (s.length() >= 6) {
//                count++;
//
//            }
//        }

        //2:With Stream API
//        long count = names.stream().filter(str -> str.length() >= 6).count();
//        System.out.println("Total number of names with more than 6 chars is " + count);

        //Iterating and Displaying selected integers using Stream with limit(6)
//        Stream.iterate(1, count -> count + 1)
//                .filter(num -> num%5==0)
//                .limit(8)
//                .forEach(System.out::println);

        //Lets concatenate two streams one being the stream of names and other being the stream of fruits
        List<String> names2 = Arrays.asList("Shashank", "Suraj","Saloni");
        List<String> fruits = Arrays.asList("Apples", "Banana","Orange");

        Stream<String> resStream = Stream.concat(names2.stream(), fruits.stream());

        resStream.forEach(str -> System.out.print(str+" "));
        //resStream.forEach(System.out::println);
        
        
    }
}

Java Optional is a way of replacing a nullable T reference with a non-null value. An Optional may either contain a non-null T reference (in which case we say the value is “present”), or it may contain nothing (in which case we say the value is “absent”).

package org.example;

import java.util.Optional;

public class OptonalClassDemo {

    public static void main(String[] args) {

//        //lets raise an NPE
//        String[] str = new String[10];
//
//        //Lets get the substring
//        String str2 = str[9].substring(2,5);
//
//        //Lets display the substring
//        System.out.println(str2);

        //lets handle the above scenario using optional class
        String[] str = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "jahdjaajahah"};
        Optional<String> isNull = Optional.ofNullable(str[9]);

        //lets check for the NPE
        if(isNull.isPresent()) {
            //Getting the substring
            String str2 = str[9].substring(2,5);

            //Lets display the substring
            System.out.println(str2);
        } else {
            System.out.println("Cannot get the substring from an empty string");
        }
    }
}

#DateTime API
Java 8 introduced new APIs for Date and Time to address the shortcomings of the older java.util.Date and java.util.Calendar.
#Issues With the Existing Date/Time APIs
- Thread safety
- API design and ease of understanding
- ZonedDate and Time

#ZonedDateTime example
package org.example.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        //Lets print the local date and time
        LocalDateTime ldt =  LocalDateTime.now();
        System.out.println("Date and Time in India Zone is " + ldt);

        //Lets format the date using date formatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

        ZonedDateTime zdt = ldt.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println("Indian Zoned time is " + dtf.format(zdt));

        
        ZoneId zoneID = ZoneId.of("Australia/Sydney");
        ZonedDateTime zdtt = ZonedDateTime.now(zoneID);
        System.out.println("Zone ID is: "+ zoneID);

        //lets print the pst time zone
//        ZonedDateTime pst = zdt.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println("Australian Zoned time is " +dtf.format(zdtt));
    }
}

*Documentation for DateimeApi
https://docs.oracle.com/javase/8/docs/technotes/guides/datetime/index.html

# Day 7
** Java 11 Features **
- Collection to Array
- HttpClientApi
- Var in Lambda expression
- String APi methods

** Java 17 Features **
- Pattern Matchig
- NIO and NIO2
- Record
- Sealed Class
- RandomNumberGenrator Interface




 

