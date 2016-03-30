# PlayBigBackendApp


## Developer Local Environment Setup Instructions

### Getting IDE and Source Code

 * Download and Install IntelliJ IDEA 15
 * Go to "VCS" menu, Checkout from Version Control" and select "GIT"
 * Paste in the SSH Git Repo Link, viz git@github.com:AsaNeAsa/PlayBigBackendApp.git
 * Select "Clone" and select "Yes" on the subsequent confirmation box
 * In import settings, select "Maven" project.
 * Checkmark the options, for "Search projects recursively" and "Automatically import maven projects"
 * Go to Run/Debug Settings
 * Add a Maven configuration. Give it a proper name
 * For command, select "spring-boot:run", save the configuration

### Getting and connecting to local database

 * Download and Install MySql Server
 * Create/Update db user "root", password as empty
 * Run all the sql files in https://github.com/AsaNeAsa/PlayBigBackendApp/tree/master/src/main/resources/dbmigration/mysql, sequentially according to the version numbers

### Deploying and running the app

 * Click on Play button to deploy the application
 * Go to browser, http://localhost:8080/greeting, if the world is feeling okay, the app will greet you :)
 * Enjoy. Contribute by making your separate forks and opening pull requests
