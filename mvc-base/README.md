mvc-base
========

This project will allow you to start off on the good foot with spring MVC.

It demonstrates the use of spring 3.2 Java Servlet container initialization, i.e, completely XML-less config (no application-context.xml, no web.xml).
http://static.springsource.org/spring-framework/docs/3.2.0.RELEASE/spring-framework-reference/html/mvc.html#mvc-container-config

Moreover, it provides default configuration for siteMesh, localized validation/messages, UTF-8 encoding filter and uses twitter-bootstrap for a responsive layout.

It includes a total of 5 classes (including tests and config) so don't be afraid it's really simple.

It is compatible with tomcat and jetty maven plugins.

Use
    mvn tomcat7:run
or
    mvn jetty:run

Some sample controller tests with spring-mvc-test are also provided.

See my blog : http://geowarin.wordpress.com/2013/01/23/complete-example-of-a-spring-mvc-3-2-project
