Project Management Application

Description:

This Java-based Project Management Application is a robust 
console application designed to help users manage their projects efficiently. 
It offers a user-friendly interface for creating, listing, selecting, updating, 
and deleting projects. The application streamlines project management tasks, 
making it easier for users to keep track of their projects' details, 
estimated and actual hours, difficulty levels, and notes.

Key Features:

-Add new projects with detailed information

-List all existing projects

-Select a specific project to work on

-Update project details

-Delete projects

-User-friendly console interface

Technologies Used:
-Java

-Scanner class for user input

-BigDecimal for precise decimal calculations

-List interface for data storage

-Custom exception handling (DbException)

Favorite Features
1. Dynamic Project Selection and Modification
One of the standout features is the ability to select a project 
and modify its details dynamically. This feature allows users to 
update project information on the fly, providing a seamless 
experience for project management.

java
private void updateProjectDetails() {
    if(Objects.isNull(curProject)) {
        System.out.println("\nPlease select a project.");
        return;
    }
    // ... (input gathering)
    Project project = new Project();
    project.setProjectId(curProject.getProjectId());
    project.setProjectName(Objects.isNull(projectName) ? curProject.getProjectName() : projectName);
    // ... (setting other properties)
    
    projectService.modifyProjectDetails(project);
    curProject = projectService.fetchProjectById(curProject.getProjectId());
}
This code snippet demonstrates how the application handles project updates, 
ensuring that only changed fields are updated while maintaining existing data 
for unchanged fields.

2. Robust Input Validation
Another impressive feature is the robust input validation system. 
The application handles various types of user inputs, including strings,
integers, and decimals, with proper error handling and user feedback.

java
private BigDecimal getDecimalInput(String prompt) {
    String input = getStringInput(prompt);
    
    if(Objects.isNull(input)) {
        return null;
    } else {
        try {
            return new BigDecimal(input).setScale(2);
        } catch(NumberFormatException e) {
            throw new DbException(input + " is not a valid decimal number. Try again.");
        }
    }
}
This method showcases how the application validates decimal inputs, 
ensuring data integrity and providing clear error messages to guide the user.

Installation & Usage Instructions
-Ensure you have Java Development Kit (JDK) installed on your system.

-Clone the repository to your local machine.

-Navigate to the project directory.

-Compile the Java files:

text
javac projects/*.java
Run the application:

text
java projects.ProjectsApp
Follow the on-screen prompts to interact with the application.

Contributing
Contributions to improve the Project Management Application are welcome.
Please follow these steps to contribute:

-Fork the repository.

-Create a new branch for your feature or bug fix.

-Make your changes and commit them with descriptive commit messages.

-Push your changes to your fork.

-Submit a pull request with a clear description of your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact Information
For any queries or suggestions, please contact the project maintainer at:
joseph.flores125@gmail.com
