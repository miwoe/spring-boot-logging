Practical logging in Spring Boot
---------------------------------

This setup shows how to configure logging for use in a production ready environment.

Making some assumptions:

- You want a common logging configuration for ALL environments:

  - Same appenders
  - Different logging levels
  - Same patterns


Externalizing configuration via Springs default configuration framework (or maybe advanced cloud concepts...)

This means:
- Basic setup in code
- Environment specific setup in application.properties (or other possible config file)


Basic setup:

Can be made in logback-spring.xml. Configure whatever you want.

Environment specific setup:

Put