/*
 * Created By Rami Al Shawabkeh 4/3/18 11:35 AM
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

public class DeleteSectionsOfTheForm {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By SerachButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By SectionsLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_tdSections");
    private By DeleteLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnDelete");
    private By YesConfrmationLocator = By.id("ctl00_ibtnYes");

//مدير عام الامن والسلامة حذف الاقسام
    @Test

    public void deleteSections() throws InterruptedException {


        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();
     //   for (int i = 0; i < 20; i++) {
            WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
            FormMainMenuLoactorWait.click();

   /*         browserQA.findElement(By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container")).click();
            browserQA.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Rami200103" , Keys.ENTER);


            Thread.sleep(1000);*/

            WebElement FormStatusLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator));
            FormStatusLocatorWait.click();

            WebElement FormStatusSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator));
            FormStatusSearchLocatorWait.sendKeys("غير منشور" , Keys.ENTER);

            Thread.sleep(1000);
            WebElement SerachButtonLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator));
            SerachButtonLocatorWait.click();


            WebElement SectionsLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator));
            SectionsLinkLocatorWait.click();


            WebElement DeleteLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator));
            DeleteLinkLocatorWait.click();

            WebElement YesConfrmationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator));
            YesConfrmationLocatorWait.click();

            By MessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

            WebElement MessageLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLocator));

            String ActualResult = browserQA.findElement(MessageLocator).getText();
            String ExpectedResult = "تم حذف القسم بنجاح.";

            Assert.assertEquals(ActualResult , ExpectedResult , "لايمكن الحذف للقسم");


     //   }


    }


}


