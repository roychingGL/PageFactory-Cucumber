package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationLocators {

    @FindBy(id = "nav_home")
    public WebElement homeMenu;

    @FindBy(id = "nav_newVisit")
    public WebElement visitationMenu;

    @FindBy(id = "nav_email")
    public WebElement emailMenu;

    @FindBy(id = "nav_changeContace")
    public WebElement myAccountMenu;

    @FindBy(id = "nav_visitTester")
    public WebElement internetVisitTesterMenu;

    @FindBy(id = "nav_contactUs")
    public WebElement contactMenu;

    @FindBy(id = "nav_FAQ")
    public WebElement faqMenu;

    @FindBy(className = "welcomeContent")
    public WebElement welcomeContent;

    @FindBy(id = "updateProfile")
    public WebElement accountInformation;

    @FindBy(id = "logOff")
    public WebElement logOff;

    @FindBy(id = "update")
    public WebElement updateButton;

    @FindBy(id = "next")
    public WebElement nextButton;

    @FindBy(id = "search")
    public WebElement search;

    /**
     * @author bskaja
     * The visitation center info button that is displayed after hovering over Visitation at the top of the page
     */
    @FindBy(id = "nav_visitationCenters")
    public WebElement visitationCenterInfo;

    /**
     * @author bskaja
     * The schedule a visit button that is displayed after hovering over Visitation at the top of the page
     */
    @FindBy(id = "nav_newVisit2")
    public WebElement scheduleAVisit;

    /**
     * @author bskaja
     * The view visit history button that is displayed after hovering over Visitation at the top of the page
     */
    @FindBy(id = "nav_visitHistory")
    public WebElement viewVisitHistory;

    /**
     * @author bskaja
     * The compose email button that is displayed after hovering over Email at the top of the page
     */
    @FindBy(id = "nav_composeEmail")
    public WebElement composeEmail;

    /**
     * @author bskaja
     * The buy stamps button that is displayed after hovering over Email at the top of the page
     */
    @FindBy(id = "nav_purchaseStamps")
    public WebElement buyStamps;

    /**
     * @author bskaja
     * The email transaction history button that is displayed after hovering over Email at the top of the page
     */
    @FindBy(id = "nav_transactionHistory")
    public WebElement emailTransactionHistory;

    /**
     * @author bskaja
     * The change contact info button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_changeContact2")
    public WebElement changeContactInfo;

    /**
     * @author bskaja
     * The change identification info button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_changeIdentification")
    public WebElement changeIdentificationInfo;

    /**
     * @author bskaja
     * The change email address button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_changeEmail2")
    public WebElement changeEmailAddress;

    /**
     * @author bskaja
     * The change password button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_changePassword")
    public WebElement changePassword;

    /**
     * @author bskaja
     * The change credit/debit card button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_changeBilling")
    public WebElement changeBilling;

    /**
     * @author bskaja
     * The manage inmates button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_manageInmates")
    public WebElement manageInmates;

    /**
     * @author bskaja
     * The manage visitor groups button that is displayed after hovering over My Account at the top of the page
     */
    @FindBy(id = "nav_manageVisitors")
    public WebElement manageVisitorGroups;

    /**
     * @author bskaja
     * The security policy link at the bottom of the page
     */
    @FindBy(id = "securityPolicyLink")
    public WebElement securityPolicyLink;

    /**
     * @author bskaja
     * The privacy policy link at the bottom of the page
     */
    @FindBy(id = "privacyPolicyLink")
    public WebElement privatePolicyLink;

    /**
     * @author bskaja
     * The refund policy link at the bottom of the page
     */
    @FindBy(id = "refundPolicyLink")
    public WebElement refundPolicyLink;

    /**
     * @author bskaja
     * The contact link at the bottom of the page
     */
    @FindBy(id = "visAnywhereRequirementLink")
    public WebElement internetVisitRequirementsLink;

    /**
     * @author bskaja
     * The internet visit tester link at the bottom of the page
     */
    @FindBy(id = "visitTesterLink")
    public WebElement internetVisitTesterLink;

    /**
     * @author bskaja
     * The professional visitor? link at the bottom of the page
     */
    @FindBy(id = "areYouProfessionalPopup")
    public WebElement professionalVisitorLink;
}
