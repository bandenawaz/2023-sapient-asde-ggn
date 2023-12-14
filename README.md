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