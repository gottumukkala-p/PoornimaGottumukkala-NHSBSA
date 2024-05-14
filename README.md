# PoornimaGottumukkala-NHSBSA

# This README file contains instructions for executing the automated tests for the NHS job search feature.

**Instructions to Execute Tests:**

Please clone the repo from "https://github.com/gottumukkala-p/PoornimaGottumukkala-NHSBSA.git" and execute one of the below methods to run the Tests.

 
+ **Method 1: From Command Prompt**
     * Step 1: Open the command prompt by typing cmd in the search bar of your computer.
     * Step 2: Navigate to the project folder 'PoornimaGottumukkala-NHSBSA' by typing cd <path of the project folder>.
            For example: cd C:\Users\gottu\eclipse-workspace\PoornimaGottumukkala-NHSBSA
     * Step 3: To run the tests using Chrome browser, enter the following command: mvn test -Dbrowser=chrome
     * Step 4: To run the tests using Firefox browser, enter the following command: mvn test -Dbrowser=firefox
     * Step 5: To run the tests using the default browser, enter the following command: mvn test

+ **Method 2: Run Feature File Directly From Eclipse-Workspace**
    * Step 1: Select the feature file from the following path: PoornimaGottumukkala-NHSBSA/src/test/resources/Features/NHSJobSearch.feature.
    * Step 2: Right-click -> Run As -> Cucumber Feature.

 + **Method 3: Run Runner File Directly From Eclipse-Workspace**
    * Step 1: Select the runner file from the following path: PoornimaGottumukkala-NHSBSA/src/test/java/StepDefinitions/NHSJobSearchRunnerTest.java
    * Step 2: Right-click -> Run As -> JUnit Test.

# More Info:

**Important File Details:**
  - Feature File Name: NHSJobSearch.feature
  - Feature File Location: /src/test/resources/Features/NHSJobSearch.feature
  - Runner File Name: NHSJobSearchRunnerTest.java
  - Runner File Location: /src/test/java/StepDefinitions/NHSJobSearchRunnerTest.java
  - Step Definitions File Name: NHSJobSearchStepsCommon.java
  - Step Definitions File Location: /src/test/java/StepDefinitions/NHSJobSearchStepsCommon.java

**Browser Drivers Location:**
- Chrome: /src/test/resources/drivers/chromedriver.exe
- Firefox: /src/test/resources/drivers/geckodriver.exe

**Tools used to Develop and Test:**
  * Eclipse:Version: 2024-03 (4.31.0)
           Build id: 20240307-1437
  * Firefox: 125.0.3 
  * Chrome: Version 124.0.6367.202
   Maven: apache-maven-3.9.6
