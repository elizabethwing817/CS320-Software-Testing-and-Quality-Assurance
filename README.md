# CS 320 Software Testing Portfolio

This repository contains selected work from CS 320: Software Testing, Automation, and Quality Assurance. The files included show my work with the contact service from Project One and my summary and reflections report from Project Two. Together, these artifacts show how I created unit tests, checked software requirements, and reflected on testing strategies used to improve software quality.

## Reflection

### How can I ensure that my code, program, or software is functional and secure?

I can ensure that my code is functional and secure by testing it against the requirements and checking both expected and unexpected inputs. For the contact service, I used JUnit tests to make sure fields such as the contact ID, first name, last name, phone number, and address followed the required rules. I also tested that contacts could be added, updated, and deleted correctly. Security also means avoiding careless design choices, such as allowing invalid data, null values, or uncontrolled changes to important fields. Writing tests helped me catch issues earlier and made the program more reliable.

### How do I interpret user needs and incorporate them into a program?

I interpret user needs by carefully reading the requirements and turning them into specific features and rules for the program. In this project, the user needed a contact service that could store and manage contact information while following limits for each field. I used those requirements to decide what the Contact and ContactService classes needed to do. I also used the requirements to guide my test cases, so I could make sure the program matched what the user asked for instead of just what I assumed it should do.

### How do I approach designing software?

I approach designing software by breaking the problem into smaller parts first. For the contact service, I separated the contact object from the service that manages the contacts. This made the code easier to understand, test, and update. I also try to think about the requirements before writing too much code, because that helps me avoid extra work or features that are not needed. Testing is also part of my design process because it helps confirm that each part of the program works before moving on.
