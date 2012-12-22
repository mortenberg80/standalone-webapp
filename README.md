# Standalone webapp

Project that explores different ways of creating runnable war/jar-files as standalone webapps.

* Embedding Jetty
* Embedding Winstone (Jenkins uses this)

## Modules

### Runnable WAR

Attempt to create a war file without repacking all dependencies. Not yet implemented.

### UberJAR with Jetty

A thin jar module which contains Jetty and the web application.

This Maven module contains the Jetty server with optional dependencies like JSP support along with the web application. In addition it has a main class in order to start up the application when it is packaged as a jar file. It then repack all dependencies so that everything resides in one big jar - the überjar.

This approach uses the maven-shade-plugin in order to repack everything.
