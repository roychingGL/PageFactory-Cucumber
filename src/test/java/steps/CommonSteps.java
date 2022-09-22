package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.pages.actions.EditTaskModalActions;
import project.pages.actions.HomePageActions;
import project.pages.actions.LoginPageActions;
import project.pages.actions.MyTasksActions;
import utils.SeleniumDriver;

import java.io.FileNotFoundException;
import java.io.IOException;


public class CommonSteps {

    EditTaskModalActions editTaskActions = new EditTaskModalActions();
    HomePageActions homeActions = new HomePageActions();
    LoginPageActions loginActions = new LoginPageActions();
    MyTasksActions myTasksActions = new MyTasksActions();

    public CommonSteps() throws FileNotFoundException {
    }

    @Given("Avenue Code QA Test site is open")
    public void siteIsOpen() throws IOException {
        SeleniumDriver.openPage();
    }

    @And("the ToDo user enters a valid username and password")
    public void theToDoUserEntersAValidUsernameAndPassword() throws IOException {
        loginActions.login();
    }

    @And("the ToDo user navigates to My Tasks")
    public void theToDoNavigatesToMyTasks() {
        homeActions.navigateToMyTasks();

    }

    @Then("My Tasks link should appear on the NavBar")
    public void myTasksLinkShouldAppearOnTheNavBar() {
        Assert.assertTrue("My Tasks link is not visible", homeActions.myTasksLinkIsVisible());
    }

    @Then("{string} tittle should appear")
    public void tittleShouldAppear(String message) {
        Assert.assertTrue("Text "+message+" is not displayed correctly",myTasksActions.containText(message));
    }

    @When("the ToDo user type new task name {string}")
    public void theToDoUserTypeNewTaskName(String name) {
        myTasksActions.addTask(name);
    }

    @When("the ToDo user type new subtask name {string}")
    public void theToDoUserTypeNewSubtaskName(String name) throws InterruptedException {
        editTaskActions.typeSubTaskDescription(name);
    }

    @Then("Task with text {string} should not be created")
    public void taskShouldNotBeCreated(String taskName) {
        Assert.assertFalse("Defect, task "+taskName+" was created",myTasksActions.taskIsPresent(taskName));
    }

    @Then("Task with text {string} should be created")
    public void taskShouldBeCreated(String taskName) {
        Assert.assertTrue("Defect, task "+taskName+" was created",myTasksActions.taskIsPresent(taskName));
    }

    @Then("Subtask with text {string} should not be created")
    public void subtaskWithTextShouldNotBeCreated(String subtaskName) {
        Assert.assertFalse("Defect, subtask "+subtaskName+" was created",editTaskActions.subtaskIsPresent(subtaskName));
    }

    @Then("Subtask with text {string} should be created")
    public void subtaskWithTextShouldBeCreated(String subtaskName) {
        Assert.assertTrue("Defect, subtask "+subtaskName+" was created",editTaskActions.subtaskIsPresent(subtaskName));
    }

    @When("the ToDo user select Manage Subtasks button of the first task on the list")
    public void theToDoUserSelectManageSubtasksButtonOfTheFirstTaskOnTheList() throws InterruptedException {
        myTasksActions.selectFirstManageSubtasksOption();
    }

    @Then("Modal dialog should be open")
    public void modalDialogShouldBeOpen() throws InterruptedException {
        Assert.assertTrue("Edit Modal is not visible",editTaskActions.modalIsVisible());
    }

    @And("Task description should not be editable")
    public void taskDescriptionShouldNotBeEditable() {
        Assert.assertFalse("Defect, Task Name is editable",editTaskActions.taskNameIsEditable());
    }

    @And("the ToDo user selects Add")
    public void theToDoUserSelectsAdd() {
        editTaskActions.addSubTask();
    }

    @When("the ToDo user type {string} Due Date")
    public void theToDoUserTypeDateDueDate(String dueDate) {
        editTaskActions.typeDueDate(dueDate);
    }

}