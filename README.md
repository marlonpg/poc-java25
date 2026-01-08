# poc-java25

Java 25 Features Proof of Concept

## Features Demonstrated

- **Primitive Types in Patterns** (Preview) - Pattern matching with primitive types
- **Flexible Constructor Bodies** (Preview) - Enhanced constructor flexibility
- **Module Import Declarations** (Preview) - Simplified module imports

## Requirements

- Java 25 (with preview features enabled)
- Maven 3.6+

## Running the Examples

### Using Scripts
```powershell
# PowerShell (recommended)
.\run.ps1     # Run feature tests
.\test.ps1    # Run unit tests
```

```batch
# Command Prompt
run.bat       # Run feature tests
test.bat      # Run unit tests
```

### Using Maven Directly
```bash
# Compile
mvn compile

# Run feature tests (simplified)
mvn exec:java

# Run unit tests
mvn test
```