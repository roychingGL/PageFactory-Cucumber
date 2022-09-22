package project.pages.actions;

import base.BaseActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.EditTaskModalLocators;
import utils.SeleniumDriver;

import java.io.FileNotFoundException;
import java.util.List;

public class EditTaskModalActions extends BaseActions {

    EditTaskModalLocators locators = null;

    public EditTaskModalActions() throws FileNotFoundException {
        this.locators = new EditTaskModalLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public boolean modalIsVisible() throws InterruptedException {
        return locators.editModal.isDisplayed();
    }

    public boolean taskNameIsEditable() {
        return locators.taskNameInput.isEnabled();
    }

    public void typeSubTaskDescription(String description) {
        type(locators.subtaskNameInput, description);
    }

    public void typeDueDate(String dueDate) {
        type(locators.dueDateInput, dueDate);
    }

    public void addSubTask() {
        clickElement(locators.addButton);
    }

    public boolean subtaskIsPresent(String name) {
        List<WebElement> listOfSubtasks = locators.subtasksList;
        boolean result = false;

        for (int i = 0; i < listOfSubtasks.size(); i++) {
            if (listOfSubtasks.get(i).getText().contains(name)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
