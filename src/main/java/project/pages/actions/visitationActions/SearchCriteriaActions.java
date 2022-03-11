package project.pages.actions.visitationActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.visitationLocators.SearchCriteriaLocators;
import utils.SeleniumDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

public class SearchCriteriaActions extends BaseWebVisitorActions {

    SearchCriteriaLocators locators = null;

    public SearchCriteriaActions() {
        locators = new SearchCriteriaLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void enterDate(String date) {
        type(locators.dateField, date);
    }

    public void selectVisitationLocation(String location) {
        select(locators.visitCenterSelection, location);
    }

    public void selectTime(String time) {
        select(locators.timeOfDay, time);
    }

    public void search() {
        locators.search.click();
    }

    public List<WebElement> visitationLocationOptions() {
        Select selectElement = new Select(locators.visitCenterSelection);
        List<WebElement> allOptions = selectElement.getOptions();
        return allOptions;
    }

    public List<WebElement> getRows() {
        List<WebElement> rows = locators.contentBorder.findElements(By.xpath("/descendant::table/tbody/tr[*]"));
        return rows;
    }

    public void selectNextSunday() {
        locators.calendarButton.click();
        locators.nextSundayAnchor.click();
    }

    private String getNextDate(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.YEAR, year);

        c.add(Calendar.DATE, 1);  // number of days to add
        day = c.get(Calendar.DATE);
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);

        return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
    }

    public void entersTomorrow() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        enterDate(getNextDate(dtf.format(now)));
    }

    public void selectFirstTimeBlock() {
        locators.firstTimeBlock.click();
    }
}