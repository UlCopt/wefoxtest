# REFLECTION
### _Background_

Before carrying out the tests, the defined scope was to carry out UI tests (Functional) on a web page with the requested scenario. I ran a short manual test to find out the flow so that I could then start automating it.

##### Working process of Automation

1.- Defining the scope of automation =  In this part it have some considerations to take and I consider those : 

- Common functionalities across the application
- Features that are crucial for your business
- Technical feasibility

2 y 3.-  Selecting a testing tool/ Planning, Designing, and Development = In this case I use: 

- Java as a language, I have more experience with this
- Selenium web driver, a powerful test framework automation(compatibility, multiple browsers, multiple tests at a time...)
- Cucumber(BDD), to write a easier way the scenarios that we need to test and put order in the project
- Page Object Model with Page factory, to handle more efficient the elements on the page.
- Gradle, because with this is easier to build some command to run the test without the UI. I mean, I  use this way thinking in the possibility to deploy this solution in some CI/CD strategy

4.- Executing Test Case

- I executed the test script with the necessary inputs and I has the detailed test report about it.
- I this case I executed the test script in my local.

Test type = Functional
This test is part of the last scale (from bottom to top) based on the strategy of the testing pyramid, basically it is in charge of carrying out a simulation of a user when he executes some functionality within the application to check if it works as expected .

There are many types of tests that can be automated:

Based on pyramid testing we have :


| Unit testing  | Integration testing | Functional Testing  |
| --- | --- | --- |
|To test individual components/units  of a web app  | To test the integration among modules of the web app. | To test whether all the functions of your web app works as expected or not |
| In general write for developers  (in some cases for automation testers) |To verify the communication between different modules of the web app | To Verify if all sections are covered involving user interface , APIs, database, client/server and overall functionality of the web app |
| Development phase |Write for developers or automation testers. Is created when we already have the services build and stable | Write for automation testers (in some cases for developers) .  Is created when we already have the functionality build and stable |
|The most important and the base of test of a project |Have the second priority in the pyramid testing. Are important but I little less that unit test  | Have the last priority the pyramid testing.  Are important but I little less that integration testing |
|It takes time to do it |takes less time than unit tests  | takes less time than integration testing.  |

I created a functional test because it was a test to verify a functionality within the working web application, that is, a stable application. However, It is good to emphasize that our tests should have a good base of unit tests, since this way we mitigate for the most part the possible errors that we may have in a functional and services layer.






