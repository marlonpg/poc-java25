@echo off
set JAVA_HOME=C:\Users\gamba\.jdks\corretto-25.0.1
set PATH=%JAVA_HOME%\bin;%PATH%

echo Compiling Java 25 examples...
mvn compile

echo.
echo Running all Java 25 examples...
mvn exec:java -Dexec.mainClass="com.example.Java25Examples" -Dexec.args="--enable-preview"

pause