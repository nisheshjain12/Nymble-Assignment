# Travel Agency Management System

This Java-based project serves as a travel agency management system. It enables travel agencies to create and manage travel packages, handle itineraries, and manage passengers with various booking privileges.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Travel Agency Management System provides functionalities to:

- Create and manage travel packages with detailed itineraries
- Manage destinations, activities, and booking capacities
- Handle different passenger types: standard, gold, and premium
- Perform booking and activity sign-up based on passenger types

## Features

- **Travel Packages:** Create, edit, and manage packages with detailed itineraries.
- **Passenger Management:** Register and manage passengers with different booking privileges.
- **Destination Activities:** Allocate activities to destinations with capacity management.
- **Passenger Types:** Handle different passenger types with specific booking rules.

## Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/your-username/travel-agency.git
    ```

2. **Compile the Java Files:**

    ```bash
    javac -d out -cp "lib/*" src/*.java
    ```

3. **Run the Program:**

    ```bash
    java -cp "out;lib/*" Main
    ```

## Usage

Describe how to use the system, create travel packages, add destinations, activities, and manage passengers. Include necessary steps and commands.

## Testing

To run unit tests, execute the following commands:

```bash
# Compile the test files
javac -d out -cp "lib/*" test/*.java

# Run the tests
java -cp "out;lib/*" org.junit.platform.console.ConsoleLauncher --class-path out --scan-class-path
