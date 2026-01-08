@echo off
set JAVA_HOME=C:\Users\gamba\.jdks\corretto-25.0.1
set PATH=%JAVA_HOME%\bin;%PATH%

echo Compiling Java 25 examples...
mvn compile -Dexec.args="--enable-preview -ea"

echo.
echo Running Java 25 feature tests...
mvn exec:java

pause