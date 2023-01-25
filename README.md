# Serenity Automation Project

This project is an automation framework that uses the Serenity BDD library to write clear, maintainable tests for web applications.

## Getting Started
1. Clone the repository to your local machine using `git clone https://github.com/alexVarela01/serenity_example_presentation.git`.
2. Import the project into your preferred IDE.
3. Install the necessary dependencies by running `mvn clean install` in the terminal.
4. Run the tests by executing the command `mvn clean verify serenity:aggregate -Dtags=@TAG`.

## Annotation
- `git clone https://github.com/<your-repo-link>` : this command is used to download the code from your repository to your local machine.
- `mvn clean install` : this command is used to install all the necessary dependencies for the project.
- `mvn clean verify serenity:aggregate -Dtags=@TAG` : this command is used to run the tests in the project.
  - The @TAG specifies the exact test/test set to be runned and can be found on the .feature file

Note: make sure you have [maven](https://maven.apache.org/) installed in your system and JDK 11 configured before running the above commands.