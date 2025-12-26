#!/bin/bash

# Build the project
echo "Building the project..."
mvn clean compile

# Check if build was successful
if [ $? -eq 0 ]; then
    echo "Build successful! Running the application..."
    mvn exec:java -Dexec.mainClass="io.raineri.jbow.App"
else
    echo "Build failed!"
    exit 1
fi
