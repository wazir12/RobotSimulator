# RobotSimulator

A simple simulation program to move a robot on a table grid. The robot can be initialized with its starting position and orientation and can execute movement commands based on user input.

## Requirements

1. Java 11 
2. Maven (for building the project)
3. Docker (for containerized execution)

## Running the Project

You can run the RobotSimulator either directly from the `JAR file` or via `Docker`
## Run From Jar File
- **Locate Jar File in artifact of github  action section:** [Link to jar file](https://github.com/wazir12/RobotSimulator/actions) AND then run CMD: `java -jar target/RobotSimulator-1.0-SNAPSHOT.jar`
  ### OR
- **Build the Project using Maven:** `mvn clean package`
- **Locate the JAR File:** `target/RobotSimulator-1.0-SNAPSHOT.jar`
- **Run the JAR:** `java -jar target/RobotSimulator-1.0-SNAPSHOT.jar`
## Run via Docker
### Prerequisites

- Docker must be installed and running on your system.

### Building the Docker Image
- Ensure you are in the root directory of the project (where Dockerfile and pom.xml are located).
- Build the Docker image:
  - `docker build -t robotsimulator .`
### Running the Docker Container
- The `-it` flag enables interactive mode, allowing you to input values in the terminal.
-  `docker run -it robotsimulator`

## Accepted Commands
1. **M** - Move Robot forward by one tile in the direction of the current orientation of the Robot.
2. **L** - Rotate robot to Left
3. **R** - Rotate robot to right
## Example Input/Output format
```
  Enter table dimensions (rows columns):
  5 
  6
  
  Enter robot's initial position and orientation (row column orientation):
  1 
  2 
  N
  
  Enter movement commands (e.g., MRMLRMM):
  MRMLRMM

  Final position: 0 5 E
  Do you want to Continue (Y/N)?
  N
```

