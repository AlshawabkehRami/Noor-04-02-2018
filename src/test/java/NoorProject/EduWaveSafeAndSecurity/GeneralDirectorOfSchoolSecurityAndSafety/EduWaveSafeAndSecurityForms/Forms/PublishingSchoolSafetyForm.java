/*
 * Created By Rami Al Shawabkeh 4/3/18 11:36 AM
 */

/*
 * Created By Rami Al Shawabkeh 4/3/18 9:17 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class PublishingSchoolSafetyForm {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By SerachButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By PublishingLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnPublish");
    private By YesConfrmationLocator = By.id("ctl00_ibtnYes");


    @Test
    public void PublishingForm() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();
        //for (int i = 0; i < 3; i++) {

            WebElement FormStatusLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator));
            FormStatusLocatorWait.click();

            WebElement FormStatusSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator));
            FormStatusSearchLocatorWait.sendKeys("غير منشور" , Keys.ENTER);

            Thread.sleep(1000);
            WebElement SerachButtonLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator));
            SerachButtonLocatorWait.click();


            WebElement PublishingLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(PublishingLinkLocator));
            PublishingLinkLocatorWait.click();


            WebElement YesConfrmationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator));
            YesConfrmationLocatorWait.click();

            By MessageLocator=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

            WebElement MessageLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLocator));

            String ActualResult=browserQA.findElement(MessageLocator).getText();
            String ExcpectedResult="تم نشر النموذج بنجاح.";

            Assert.assertEquals(ActualResult,ExcpectedResult,"يجب اضافة الاقسام والبنود الخارجية والبنود الداخلية");
        //}

    }
}
