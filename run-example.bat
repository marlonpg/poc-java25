@echo off
set JAVA_HOME=C:\Users\gamba\.jdks\corretto-25.0.1
set PATH=%JAVA_HOME%\bin;%PATH%

if "%1"=="" (
    echo Usage: run-example.bat [PrimitivePatterns^|FlexibleConstructors^|ModuleImports^|StreamGatherers]
    exit /b 1
)

mvn exec:java -Dexec.mainClass="com.example.%1" -Dexec.args="--enable-preview"