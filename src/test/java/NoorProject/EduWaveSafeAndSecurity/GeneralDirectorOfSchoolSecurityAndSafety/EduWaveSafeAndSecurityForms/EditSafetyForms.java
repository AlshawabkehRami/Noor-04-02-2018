/*
 * Created By Rami AlShawabkeh 4/1/18 2:31 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class EditSafetyForms {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By FormDescriptionLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_tbFormDesc");
    private By UpdateLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnUpdate");


    @Test

    public void EditUnpublishedSafetyForms() throws InterruptedException {

        browserQA.manage().window().maximize();
        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();
        // for (int i = 0; i < 5; i++) {
        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();

        WebElement FormStatusLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator));
        FormStatusLocatorWait.click();

        WebElement FormStatusSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator));
        FormStatusSearchLocatorWait.sendKeys("غير منشور" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement BTNSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocator));
        BTNSearchLocatorWait.click();

        By EditLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnEdit");

        WebElement EditLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLocator));
        EditLinkLocatorWait.click();

        Random rand = new Random();
        int random_numbers = rand.nextInt(1000);


        WebElement FormDescriptionLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormDescriptionLocator));
        FormDescriptionLocatorWait.clear();
        FormDescriptionLocatorWait.sendKeys("Form" + random_numbers);

        Thread.sleep(1000);
        WebElement UpdateLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLinkLocator));
        UpdateLinkLocatorWait.click();
        UpdateLinkLocatorWait.click();

        By UpadteMessageLOcator=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

        WebElement UpadteMessageLOcatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpadteMessageLOcator));

        String ActualResult=browserQA.findElement(UpadteMessageLOcator).getText();
        String ExpectedResult="تمت عملية حفظ البيانات بنجاح.";

             Assert.assertEquals(ActualResult,ExpectedResult,"لم تتم عملية التعديل بنجاح");



         //}


    }
}
