/*
 * Created By Rami AlShawabkeh 3/27/18 4:31 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class DeleteSafetyForms {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FromDayFooterLocator = By.xpath("/html/body/div/table/tbody/tr[4]/td[2]");
    private By ToDayFooterLocator = By.xpath("/html/body/div/table/tbody/tr[5]/td[1]");
    private By AddValidationMessageLoactor = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");


    @Test
    public void DeleteForms() throws InterruptedException {

        browserQA.manage().window().maximize();

        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();


        List<WebElement> PagingDelete = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr[23]/td/table/tbody/tr/td"));
        int PagingPrametreDelete = PagingDelete.size();

        By PaginglinkDelete = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr[23]/td/table/tbody/tr/td[" + PagingPrametreDelete + "]/a");

        WebElement PaginglinkDeleteWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(PaginglinkDelete));
        PaginglinkDeleteWait.click();

        Thread.sleep(1000);

        List NumberOfRowsDelete = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr/td[1]"));

        int TableSizeDelete = NumberOfRowsDelete.size();

        String TableSizeDeleteParameter = String.format("%02d" , TableSizeDelete);

        int PrametreDelete = Integer.parseInt(TableSizeDeleteParameter) - 1;

        String DeleteParmetreAfterConverte = String.format("%02d" , PrametreDelete);

        System.out.println("TableSizzzzze===="+TableSizeDelete);

        System.out.println("TableSizeDeleteParameter"+TableSizeDeleteParameter);

        System.out.println("PrametreDelete"+PrametreDelete);

        System.out.println("DeleteParmetreAfterConverte"+DeleteParmetreAfterConverte);


        By DeleteLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + DeleteParmetreAfterConverte + "_lbtnDelete");

        WebElement DeleteLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator));
        DeleteLinkLocatorWait.click();

        By YesButtonLocator = By.id("ctl00_ibtnYes");

        WebElement YesButtonLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesButtonLocator));
        YesButtonLocatorWait.click();

        By DeleteValidationMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
        WebElement DeleteValidationMessageLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteValidationMessageLocator));

        String ActualResult = browserQA.findElement(DeleteValidationMessageLocator).getText();
        String ExpercteResult = "تم حذف النموذج بنجاح.";


      //Assert.assertEquals(ActualResult , ExpercteResult , "يوجد مشكلة في الية الحذف");

    }


}
