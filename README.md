
Week Seven Challenge - Employees and Departments with Security

    Due Friday by 4:59pm Points 0 Submitting a website url Available after Nov 2 at 9am

Week 7 Challenge
Dalton solutions has a pet database which contains a list of pets for each of its employees, but its
subsidiary, Sterling Solutions doesn't have an
employee database!
Your counterpart at Dalton shared the code with you to use as a reference for what Sterling might want.

This is the live application:
https://daltonpets.herokuapp.com (Links to an external site.)Links to an external site.

This is the reference code:
https://github.com/aoa4eva/Week7ChallengeReference (Links to an external site.)Links to an external site.

You have been hired by Sterling Solutions, Inc. to create an application that will list all of their
employees and departments at the company.

Your application must include the following:
* A table for employees
* Each employee should have a employeeName, job title, and the employeeName of the department they work under
* A table for departments
* A page listing all departments
* A page listing all employees and their departments

You should be able to:
* Use forms to one or more departments to the database
* Use forms to add one or more employees and their designated departments to the database

You should have a login that is available to an ordinary user (without the API user permission).

You should also have an API that is accessible if a user logs in with the APIUSER permission.
The route should be accessible via the route /api/[the item the user wants to search for]

Routes should be available to:
* list all departments /api/departments
* list all employees and their departments /api/employees

Note that at this point, the routes merely need to be available, they are not required to produce
output.

Done already?
* Each route specified should produce JSON formatted text
* Use Bootstrap to make the pages look nice.
* Deploy your application to Heroku.
