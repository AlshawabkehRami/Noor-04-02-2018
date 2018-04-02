/*
 * Created By Rami AlShawabkeh 4/1/18 4:23 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class DeleteVistis {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By AdminSettingsMenuLoactor = By.id("divMenuItem_5894");
    private By TypesOfVisitsLocator = By.linkText("أنواع الزيارات");
    private By YesButton = By.id("ctl00_ibtnYes");
    private By TableLoactor = By.id("ctl00_PlaceHolderMain_gvVisitType");

    @Test
    public void DeleteTypesOfVisits() {
        WebElement SwitchProfileLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement AdminSettingsMenuLoactorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(AdminSettingsMenuLoactor));
        AdminSettingsMenuLoactorWait.click();

        WebElement TypesOfVisitsLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TypesOfVisitsLocator));
        TypesOfVisitsLocatorWait.click();


        WebElement TableLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TableLoactor));

        List ListRowsXpath = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int NoOfRows = ListRowsXpath.size() - 1;
        int NoOfRowsparameter = NoOfRows;

        By DeleteLinkLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + NoOfRowsparameter + "_lbtnDelete");
        WebElement DeleteLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator));
        DeleteLinkLocatorWait.click();


        browserQA.findElement(YesButton).click();

        By ValidationMesageLocator = By.id("ctl00_PlaceHolderMain_lblOperationResult");

        WebElement ValidationMesageLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMesageLocator));
        String ValidationMesageLocatorWaitString = browserQA.findElement(ValidationMesageLocator).getText();
        String ValidationMesageString = "لا يمكن الحذف لارتباط نوع الزيارة ببطاقة مدرسة.";

        Assert.assertNotEquals(ValidationMesageLocatorWaitString , ValidationMesageString , "لايمكن حذف الزيارة المدرسية");


    }

}
