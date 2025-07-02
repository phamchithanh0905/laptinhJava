# Drug Use Prevention Support System

## Overview
The Drug Use Prevention Support System is a Spring Boot application designed to provide resources and support for individuals seeking help with drug-related issues. The application offers educational programs, counseling services, community support groups, and a hotline for immediate assistance.

## Features
- Display a list of available support resources.
- Allow users to submit contact messages for further assistance.
- Built using Spring Boot and Thymeleaf for a responsive web interface.

## Project Structure
```
drug-use-prevention-support-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── drugprevention
│   │   │               ├── DrugUsePreventionSupportSystemApplication.java
│   │   │               └── controller
│   │   │                   └── SupportController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           └── support.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── drugprevention
│                       └── DrugUsePreventionSupportSystemApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd drug-use-prevention-support-system
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   Use the following command to start the application:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**:
   Open your web browser and navigate to `http://localhost:8080/support` to view the support resources.

## Usage Guidelines
- Users can view available support resources on the support page.
- Users can submit their contact information and messages for further assistance.
- Ensure to handle user data responsibly and in compliance with privacy regulations.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.