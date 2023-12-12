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
						// 
					}
				}
				stage('Test') { 
					steps {
						// 
					}
				}
				stage('Deploy') { 
					steps {
						// 
					}
				}
			}
		}
	```

- Recap of Git working with BitBucket



- Intro to Ansible and Terraform
