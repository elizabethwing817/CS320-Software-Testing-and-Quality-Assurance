# Software Testing and Quality Assurance

**Course:** CS320 – Software Testing, Automation, and Quality Assurance  
**University:** Southern New Hampshire University

## Overview

This repository contains projects completed for CS320 – Software Testing, Automation, and Quality Assurance at Southern New Hampshire University.

The work focuses on designing Java service applications and using JUnit tests to verify that software requirements are met. The projects include contact, task, and appointment management services with validation rules, service operations, and automated unit tests.

## Projects Included

### Contact Service

The contact service stores and manages contact records while enforcing requirements for contact IDs, names, phone numbers, and addresses.

### Task Service

The task service supports adding, updating, and deleting tasks while validating task IDs, names, and descriptions.

### Appointment Service

The appointment service manages appointment records while validating appointment IDs, dates, and descriptions.

## Technologies Used

- Java
- JUnit
- Eclipse
- Object-Oriented Programming
- Unit Testing

## Skills Demonstrated

- Writing and executing unit tests
- Translating software requirements into test cases
- Validating expected and invalid inputs
- Object-oriented software design
- Exception handling
- Requirement-based testing
- Software quality assurance
- Debugging and code review

## Testing Approach

The test classes verify both valid and invalid conditions for each application component. Tests confirm that required fields meet length and format rules, null values are rejected, duplicate identifiers are prevented, and service operations perform as expected.

This approach helped ensure that the applications matched the provided requirements rather than relying only on successful program execution.

## Repository Contents

- Contact application and JUnit tests
- Task application and JUnit tests
- Appointment application and JUnit tests
- Project One source files
- Project Two summary and reflection report

## What I Learned

This project strengthened my understanding of how automated testing supports functional, reliable, and maintainable software. I learned how to convert requirements into testable conditions, evaluate expected and unexpected inputs, and use JUnit tests to identify defects before software is released.

I also learned that testing should be incorporated throughout the development process rather than treated as a final step.

## Potential Enhancements

- Organize source and test files into standard Java project folders
- Add integration testing between application components
- Expand test coverage for additional edge cases
- Add automated test execution through a continuous integration workflow
- Generate formal code-coverage reports
