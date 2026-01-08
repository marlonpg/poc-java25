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

### Using Batch Scripts (Windows)
```batch
# Run all examples
run.bat

# Run individual examples
run-example.bat PrimitivePatterns
run-example.bat FlexibleConstructors
run-example.bat ModuleImports
run-example.bat StreamGatherers
```

### Using Maven Directly
```bash
# Compile
mvn compile

# Run all examples
mvn exec:java -Dexec.mainClass="com.example.Java25Examples" -Dexec.args="--enable-preview"

# Run individual examples
mvn exec:java -Dexec.mainClass="com.example.PrimitivePatterns" -Dexec.args="--enable-preview"
mvn exec:java -Dexec.mainClass="com.example.FlexibleConstructors" -Dexec.args="--enable-preview"
mvn exec:java -Dexec.mainClass="com.example.ModuleImports" -Dexec.args="--enable-preview"
mvn exec:java -Dexec.mainClass="com.example.StreamGatherers" -Dexec.args="--enable-preview"
```