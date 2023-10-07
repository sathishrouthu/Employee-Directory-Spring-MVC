
# Employee Directory
#### Spring MVC CRUD with MySQL
Certainly! Here's the description of each CRUD operation for managing the employee directory in a beautifully formatted Markdown without mentioning "Endpoint" explicitly:

### `/employees`
- **CRUD Function**: Read (Retrieve)
- **Use**: Retrieves a list of employees from the database and displays them in the "list-employees" view. Users can view the existing employees' details.

### `/employees/add`
- **CRUD Function**: Create
- **Use**: Provides a form for users to add new employees. When accessed via a GET request, it displays an empty form. Upon form submission (via POST request to `/employees/save`), a new employee is created based on the form data.

### `/employees/save`
- **CRUD Function**: Create
- **Use**: Handles the submission of the form data for adding a new employee. It creates a new employee record based on the submitted data, saving it to the database. After saving, it redirects the user back to the list of employees (`/employees`).

### `/employees/update`
- **CRUD Function**: Update (Retrieve for Editing)
- **Use**: Populates the form with the details of an existing employee for editing. It accepts the `employeeId` as a request parameter and retrieves the corresponding employee from the database. The retrieved employee's details are pre-populated in the "employee-form" view, allowing the user to edit them. After editing, the form can be submitted to update the employee details (handled by `/employees/save`).

### `/employees/delete`
- **CRUD Function**: Delete
- **Use**: Handles the deletion of an existing employee. It accepts the `employeeId` as a request parameter and deletes the corresponding employee record from the database. After deletion, the user is redirected back to the list of employees (`/employees`), now excluding the deleted employee.

These operations collectively provide Create, Read, Update, and Delete (CRUD) functionality for managing the employee directory. Users can view, add, edit, and delete employee records using these operations.

#### Output results :

<video width="640" height="360" controls>
  <source src="output/output.mp4">
  Your browser does not support the video tag.
</video>
