/*
 * Created By Rami AlShawabkeh 3/29/18 12:37 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class ViewTheFormUnPublished {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By DDLFormStatusLoactor = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By TextFormStatusSearchLoactor = By.xpath("/html/body/span/span/span[1]/input");
    private By GVForms = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnView");
    private By BTNBack = By.id("ctl00_PlaceHolderMain_ibtnBack");
    private By SearchLoactor = By.id("ctl00_PlaceHolderMain_ibtnSearch");


    @Test
    public void ViewpublishedForm() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        // for (int i = 0; i < 10; i++) {
        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();

        WebElement DDLFormStatusLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLFormStatusLoactor));
        DDLFormStatusLoactorWait.click();

        WebElement TextFormStatusSearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TextFormStatusSearchLoactor));
        TextFormStatusSearchLoactorWait.sendKeys("غير منشور" , Keys.ENTER);


        Thread.sleep(1000);
        WebElement SearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLoactor));
        SearchLoactorWait.click();

        browserQA.findElement(GVForms).click();
        browserQA.findElement(BTNBack).click();

        // }


    }
}
