# Video Visit


Run the project using the command line with a specific tag:

```
Run a specific Tag:
```
mvn test -Dcucumber.filter.tags='@Regression'

```
Run a specific Feature file:
```
mvn test -Dcucumber.options="src/test/resources/featureFiles/FeatureName.feature"


## Multiple Browsers

Cucumber can run your scenarios with different browsers

```
mvn test -Dbrowser=chrome
mvn test -Dbrowser=firefox
mvn test -Dbrowser=edge
```

