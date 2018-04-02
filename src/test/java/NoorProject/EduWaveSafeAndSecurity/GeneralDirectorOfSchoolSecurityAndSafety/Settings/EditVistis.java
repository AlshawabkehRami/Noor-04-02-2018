/*
 * Created By Rami AlShawabkeh 4/1/18 4:23 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static NoorProject.Other.NoorLogin.waitQA;

public class EditVistis {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By AdminSettingsMenuLoactor = By.id("divMenuItem_5894");
    private By TypesOfVisitsLocator = By.linkText("أنواع الزيارات");
    private By UpdateLinkLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl02_lbtnEdit");
    private By SaveUpadteLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl02_lbtnUpdate");


    @Test
    public void EditTypesOfVisits() {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement AdminSettingsMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AdminSettingsMenuLoactor));
        AdminSettingsMenuLoactorWait.click();

        WebElement TypesOfVisitsLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TypesOfVisitsLocator));
        TypesOfVisitsLocatorWait.click();


        WebElement UpdateLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLinkLocator));
        UpdateLinkLocatorWait.click();


        WebElement SaveUpadteLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SaveUpadteLocator));
        SaveUpadteLocatorWait.click();


    }
}
