# Software Testing and Quality Assurance

## Overview

This repository demonstrates software testing and quality assurance practices using Java and JUnit. It contains three service applications—Contact, Task, and Appointment—along with automated unit tests designed to verify software requirements, validation rules, and service operations.

## Projects Included

### Contact Service

The Contact Service manages contact records and enforces validation requirements for contact IDs, names, phone numbers, and addresses.

JUnit tests verify valid contact creation, invalid and null inputs, duplicate identifiers, and service operations such as adding, updating, and deleting contacts.

### Task Service

The Task Service manages task records and supports adding, updating, and deleting tasks.

Validation rules are applied to task IDs, names, and descriptions, while JUnit tests verify both valid and invalid inputs and expected service behavior.

### Appointment Service

The Appointment Service manages appointment records while enforcing requirements for appointment IDs, dates, and descriptions.

JUnit tests verify appointment creation, invalid and null values, date requirements, duplicate identifiers, and service operations.

## Technologies

- Java
- JUnit
- Eclipse
- Object-Oriented Programming
- Unit Testing

## Testing Approach

Testing was based directly on the software requirements for each service. Test cases were created for both expected and invalid conditions rather than testing only successful execution paths.

The tests verify areas such as:

- Field length and format requirements
- Required and null values
- Duplicate identifiers
- Valid and invalid object creation
- Add, update, and delete operations
- Exception handling
- Service behavior

This requirement-based approach helped ensure that each application behaved according to its specifications and demonstrated how automated testing can identify defects before software is released.

## Skills Demonstrated

- Writing and executing JUnit tests
- Translating software requirements into test cases
- Testing expected and invalid inputs
- Object-oriented software design
- Input validation
- Exception handling
- Requirement-based testing
- Software quality assurance
- Debugging and code review

## Project Structure

Each application includes its primary Java class, service class, and corresponding JUnit tests.

- `Contact.java`
- `ContactService.java`
- `ContactTest.java`
- `ContactServiceTest.java`
- `Task.java`
- `TaskService.java`
- `TaskTest.java`
- `TaskServiceTest.java`
- `Appointment.java`
- `AppointmentService.java`
- `AppointmentTest.java`
- `AppointmentServiceTest.java`

## What I Learned

These projects strengthened my understanding of how automated testing supports functional, reliable, and maintainable software.

I learned how to translate written software requirements into testable conditions, evaluate both expected and unexpected inputs, and use JUnit tests to verify application behavior. I also gained experience identifying edge cases and validating that service operations behave correctly when given invalid data.

The projects reinforced the importance of incorporating testing throughout the development process rather than treating testing as a final step.

## Potential Enhancements

- Organize source and test files into standard Java project folders
- Add integration testing between application components
- Expand test coverage for additional edge cases
- Add automated test execution through a continuous integration workflow
- Generate formal code-coverage reports
