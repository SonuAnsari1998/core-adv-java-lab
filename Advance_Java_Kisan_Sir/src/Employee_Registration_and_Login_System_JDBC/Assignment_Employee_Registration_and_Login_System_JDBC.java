package Employee_Registration_and_Login_System_JDBC;

/*
Employee Registration:
Create a robust JDBC application to manage employee registrations and logins. 
The application should interact with a database table named EmployeeRegistration with 
the following columns:

eName (primary key)
pword
fname
lname
addr
mid
phN

1. Employee
Registration:

Prompt the user to enter employee details (name, password, first name, last name, address, 
mail id, phone number).

Validate the input data for correctness and completeness

Insert the validated data into the EmployeeRegistration table.

Display a success message upon successful registration.

Enhance the user interface with features like input validation, password strength checking,
 and progress indicators.


2. Employee Login:

Prompt the user to enter their employee name and password.

Validate the input data.

Retrieve the corresponding employee record from the database.

If a matching record is found and the password matches, display a success message and provide the following options:
View Profile: Display the employee's details.

Update Profile: Allow the employee to modify their address, middle initial, and phone number.
Exit: Terminate the application.

If no matching record is found or the password is incorrect, display an error message and prompt the user to try again.


Additional Considerations:

. Implement error handling to gracefully handle exceptions that may occur during database operations.

Consider using prepared statements to prevent SQL injection attacks.

Provide clear and informative user prompts and error messages.*/
