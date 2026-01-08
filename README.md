# poc-java25

Java 25 Features Proof of Concept

## Features Demonstrated

- **Primitive Types in Patterns** (Preview) - Pattern matching with primitive types
- **Flexible Constructor Bodies** (Preview) - Enhanced constructor flexibility
- **Module Import Declarations** (Preview) - Simplified module imports
- **Stream Gatherers** (Preview) - Advanced stream processing operations

## Requirements

- Java 25 (with preview features enabled)
- Maven 3.6+

## Running the Examples

### Using Batch Script (Windows)
```batch
# Run all feature tests
run.bat
```

### Using Maven Directly
```bash
# Compile
mvn compile

# Run feature tests
mvn exec:java -Dexec.mainClass="com.example.Java25Examples" -Dexec.args="--enable-preview -ea"
```