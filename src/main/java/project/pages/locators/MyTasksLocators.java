package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyTasksLocators {
    @FindBy(id = "new_task")
    public WebElement newTaskInput;

    @FindBy(css = "[ng-click='addTask()']")
    public WebElement addButton;

    @FindBy(css = "[class='task_body col-md-7 limit-word-size']")
    public List<WebElement> tasksList;

    @FindBy(css = "button[class='btn btn-xs btn-primary ng-binding']")
    public List<WebElement> manageSubtasksList;
}
