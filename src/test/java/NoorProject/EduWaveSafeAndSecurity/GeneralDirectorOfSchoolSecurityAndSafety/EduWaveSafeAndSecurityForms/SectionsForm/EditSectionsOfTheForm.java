/*
 * Created By Rami Al Shawabkeh 4/3/18 11:35 AM
 */

/*
 * Created By Rami Al Shawabkeh 4/3/18 9:55 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.SectionsForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class EditSectionsOfTheForm {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By SerachButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By SectionsLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_tdSections");
    private By EditLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnEdit");
    private By SaveLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnUpdate");

//مدير عام الامن والسلامة/ تعديل الاقسام الاقسام
    @Test
    public void editSectionsOfTheForm() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        //   for (int i = 0; i < 3; i++) {
        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();


        WebElement FormStatusLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator));
        FormStatusLocatorWait.click();

        WebElement FormStatusSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator));
        FormStatusSearchLocatorWait.sendKeys("غير منشور" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement SerachButtonLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator));
        SerachButtonLocatorWait.click();


        WebElement SectionsLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator));
        SectionsLinkLocatorWait.click();

        WebElement EditLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLocator));
        EditLinkLocatorWait.click();


        WebElement SaveLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SaveLinkLocator));
        SaveLinkLocatorWait.click();

        By MessgaeLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

        WebElement MessgaeLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessgaeLocator));

        String ActualResult=browserQA.findElement(MessgaeLocator).getText();
        String ExcpectedResult="تم تعديل القسم بنجاح.";

        Assert.assertEquals(ActualResult,ExcpectedResult,"لم تتم عملية التعديل بنجاح");


        //   }


    }
}
