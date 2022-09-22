package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditTaskModalLocators {
    @FindBy(css = "[class='modal-dialog']")
    public WebElement editModal;

    @FindBy(id = "edit_task")
    public WebElement taskNameInput;

    @FindBy(id = "new_sub_task")
    public WebElement subtaskNameInput;

    @FindBy(id = "dueDate")
    public WebElement dueDateInput;

    @FindBy(id = "add-subtask")
    public WebElement addButton;

    @FindBy(css = "[class='task_body col-md-8 limit-word-size']")
    public List<WebElement> subtasksList;
}