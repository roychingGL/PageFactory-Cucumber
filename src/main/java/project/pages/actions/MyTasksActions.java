package project.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.MyTasksLocators;
import utils.SeleniumDriver;

import java.io.FileNotFoundException;
import java.util.List;

public class MyTasksActions extends NavigationActions{

    MyTasksLocators locators = null;

    public MyTasksActions() throws FileNotFoundException {
        this.locators = new MyTasksLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void addTask(String task){
        type(locators.newTaskInput,task);
        locators.newTaskInput.sendKeys(Keys.ENTER);
    }

    public boolean taskIsPresent(String name){
        List<WebElement> listOfTasks = locators.tasksList;
        boolean result = false;

       for (int i = 0; i < listOfTasks.size();i++) {
           if (listOfTasks.get(i).getText().contains(name)) {
               result = true;
               break;
           }
       }
       return result;
    }

    public void selectFirstManageSubtasksOption() throws InterruptedException {
//      Todo: Improve implicit waiting time
        Thread.sleep(waitingTime);
        List <WebElement> elements = locators.manageSubtasksList;

        if (!elements.isEmpty()){
            clickElement(elements.get(0));
        }else
            System.out.println("List of tasks is empty");
    }
}