# CISC/CMPE 422, 835 - Assignment 0 (GitHub Classroom)

The purpose of this part of the assignment is to get you familiar with GitHub Classroom, Git, the Gradle build system, and the JUnit testing framework. You will use these same tools and workflow for Assigment 1.

### Requirements
- [Java](https://www.oracle.com/ca-en/java/technologies/javase/javase-jdk8-downloads.html) to build and solve this part of the assignment.

### Getting stated
If you haven't already, make sure to read the [GitHub Classroom Quick Start](https://github.com/CISC422/classroom-quickstart) guide. The guide will walk you through accepting a GitHub classroom
assignment, cloning the code, and submitting your solution. 

### Building the code
The code uses the [Gradle](https://gradle.org/) build tool to manage the build. The [``gradlew``](gradlew) script allows you to execute tasks that are defined in [``build.gradle``](build.gradle).
To build the code, you should run the ``assemble`` task which compiles all the Java classes into the ``build`` directory, e.g.,
```bash
karim@xps-9380:$ ./gradlew assemble

BUILD SUCCESSFUL in 1s
2 actionable tasks: 1 executed, 1 up-to-date
```

### Running the code
If you're not using an IDE and would like to run the code from the command line, you can use the ``jar`` task to generate a Java executable (``calc.jar``). Note that the ``jar`` task will automatically build the code, e.g.,
```bash
karim@xps-9380:$./gradlew jar

BUILD SUCCESSFUL in 1s
2 actionable tasks: 2 executed

karim@xps-9380:$ java -jar calc.jar 2 3
2+3=5
2-3=-1
2*3=6
```
### Testing your solution
A number of JUnit test cases are provided in the repository under [``src/test``](src/test), specifically class [TestSolution](src/test/java/TestSolution.java).
Gradle's ``test`` task automatically run these tests and generates a testing report, e.g.,
```bash
karim@xps-9380:$ ./gradlew test

> Task :test

TestSolution

  Test testSum PASSED
  Test testDiff1 PASSED
  Test testDiff2 PASSED
  Test testProd PASSED

SUCCESS: Executed 4 tests in 320ms

BUILD SUCCESSFUL in 2s
4 actionable tasks: 4 executed
```

The command above will also generate an HTML testing report in ``build/reports/tests/index.html``.

You can add your own tests by either adding more test methods to the [TestSolution](src/test/java/TestSolution.java) class, or creating your own class in [``src/test/java``](src/test/java).

**Important**: never rely solely on the provided test cases as they are not comprehensive. In other words, passing all the provided tests does not guarantee you a full mark.
You should always define your own test cases to validate your solution. This remark will also apply to Assignment 1.

### Your tasks
- Implement the sum, difference, and product methods in [``src/main/java/Solution.java``](src/main/java/Solution.java).
- Define your own unit tests to validate your solution.
- Submit your assignment by the deadline using GitHub Classroom **and** OnQ (see below).

**Important**: for this assignment, you are **only allowed to modify** the following files:
- [``src/main/java/Solution.java``](src/main/java/Solution.java)
- [``src/test/java/TestSolution.java``](src/test/java/TestSolution.java)

You can, however, create new files if needed.

### Submitting to OnQ
Download an archive of your repository **from GitHub** and upload it **as is** to OnQ.

![Download Archive](docs/download_zip.png) 

### After the deadline
You write access to the repository will be revoked, you will only be able to see but not modify it, and your assignment will be automatically graded. 

Once the grading is complete, a new branch ``graded`` will be pushed to your repository
containing your feedback in Markdown ([``README.md``](README.md)) and PDF (``feedback.pdf``) formats. E.g.,

![Testing report](docs/example_report.png) 


You can switch to the ``graded`` branch on GitHub by selecting it from the branches drop down menu, e.g.,

![Switch branch](docs/graded_branch.png) 

Alternatively, you can check out the branch from the command line, e.g.,
```bash
git pull
git checkout graded
cat README.md
```
