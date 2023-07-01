# SpringAOP

=> Spring AOP Module :-
------------------------

# => AOP :-
	-> Full form of AOP is Aspect-Orieted Programming
	-> AOP was developed by Gregor Kiczales while working at Xerox PARC (California)
	-> AOP is a "Programming Paradiagm" (methodology / programming approch) which is implemented by a lot of languages 
          like Java, C++, PHP, Python, XML etc
	
	-> Basically AOP complements for OOP by thinking about another programming structure in order to achieve more and clear modularity.
	
	-> What is the need of AOP ?
		= Scenerio : Create banking app having multiple transactions (UPI, mobile or internet banking, wallet etc) 
                     which will also use security, logging, otp, notification / sms etc
		
		= Problem : We can create the application using simple OOP's programming paradiagm but if in future client says that instead of
                          using sendSms() i have to use sendNotification() service,
                          then we have to change the methods. This can lead to maintainance problem. 
          Another disadvantage is that we provide service logic in business logic methods which leads to modularity problem.
		
		= TO remove above proble we use AOP programming paradiagm
		
# 	-> Advantages of AOP :-
		1. It provides more modularity
		2. It improves the maintainability and readability of the code
		3. It provides loosely coupled design
    
    
    
    
    
    
    
![image](https://github.com/Nishita-Maheshwari/SpringAOP/assets/47790697/18c8457a-2c0c-4bdc-8a6b-9173002a97c3)

		
--------------------------------------------










# => Terms used in AOP :-
	1. Aspect
	2. Advice
	3. Join-points
	4. Pointcut
	5. Target
	6. Proxy
	7. Advisor
	8. Weaving
	
-------------------

# => Aspect :-
	-> Aspect is a module (or concept or cross cutting concern) which provides services for our applications
	-> For example :-
		1. Logging
		2. Security
		3. Caching
		4. Transaction
		5. Error Handling 
		   etc
	-> An application can have any number of aspects depending on our requirements.
		   

# => Advice :-
	-> Advice is an actual implementation (coding part) by which we can achieve aspect
	-> For example :-
		1. Log4j, Tinylog etc to achieve logging
		2. JAAS to achieve security
		3. JTA to achieve transaction
		   etc
	-> There are 5 types of advices :-
		1. Before Advice : run the advice before the method execution
		2. After Advice : run the advice after the method execution
		3. After Returning Advice : run the advice after the method execution but the method should not 
                  throw any runtime exception (in same cases [Spring XML file implementation] 2 and 3 are same
                           and in same cases [annotations implementation] they are different)
		4. After Throwing Advice : run the advice after the method execution only if method throws an exception
		5. Around Advice : run the advice before and after the method execution


# => Join-points :-
	-> A join-point is the point in the application where an aspect or advice can be applied or plugged in
	-> A join-point can be before or after executing method, before throwing an exception,
                      before or after modifying an instance variable etc
	
	
# => Pointcut :-
	-> It is the join-point or location where an aspect or advice is plugged in or implemented
	
	
# => Target :-
	-> Target is a business component class where we want to apply (plugged in or implement) the advice
	
	
# => Proxy :-
	-> Proxy is an object which contains target and advice (advisor) details
	-> Proxy object is created by AOP framework
	
	
# => Advisor :-
	-> Advisor is the group of "advice" and "pointcut" into a single unit and pass it to the proxy factory object
	
	
# => Weaving :-
	-> It is the process of applying the aspect on the target object in order to generate proxy
	-> Weaving can be achieved at :-
		1. compile time
		2. load time
		3. runtime
	-> NOTE : Spring AOP performs weaving at runtime
	

# => How to achieve AOP in spring :-
	-> We can achieve AOP in spring by 2 ways :-
		1. Spring XML configuration file (DTD based) - [old approach]
		2. AspectJ implementation
			2.1 Spring XML configuration file (XSD based)
			2.2 Annotations
			
