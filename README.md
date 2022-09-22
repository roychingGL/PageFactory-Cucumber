# QA Assessment

## Technology Stack
Java
Selenium
Cucumber
JUnit
Maven

This is a maven project, so we can run the tests running.
```
mvn test
```

Default properties files like url, username and password are saved in src/test/resources/config.properties

## Multiple Browsers

Cucumber can run your scenarios with different browsers

```
mvn test -Dbrowser=chrome
mvn test -Dbrowser=firefox
mvn test -Dbrowser=edge
```

## Report

After running the tests, you can find the report here: target/cucumber-reports/CucumberTestReport.html

