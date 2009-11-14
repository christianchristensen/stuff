=============================
QuickStart
=============================

1. Download and install Maven 2.0.10 from http://maven.apache.org/download.html.
2. Run "mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:gwt". A browser window should popup showing the application.

=============================
Maven Build Commands
=============================

Running 'mvn' will:
  1. Compile the project using the gwt-plugin.
  2. Run tests using the surefire-plugin (*GwtTest.java tests are excluded since they need to be run by gwt-plugin).
  3. Run tests using the gwt-plugin.
  4. Create the war.
  5. WAR will be installed in local repository.

The following commands are likely the most useful:
  * mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:gwt
  * mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:debug
  * mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:test (will run GWT tests only - ie, those that extend GWTTestCase)
  * mvn test (will run all tests - both regular JUnit tests and tests that extend GWTTestCase)
  * mvn deploy (deploys to snapshot repository)
  * mvn jetty:run (starts Jetty with WAR running in it)

The fully qualified name for the plugin (com.totsp.gwt:maven-googlewebtoolkit2-plugin) must be used instead of the
default prefix (gwt) because the default prefix clashes with a codehaus plugin This is a known issue with the plugin.
To simplify, you can setup the following aliases in your ~/.bashrc (or ~/.profile).

alias gwt='mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:gwt'
alias gwt-compile='mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:compile'
alias gwt-debug='mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:debug'
alias gwt-test='mvn com.totsp.gwt:maven-googlewebtoolkit2-plugin:test'