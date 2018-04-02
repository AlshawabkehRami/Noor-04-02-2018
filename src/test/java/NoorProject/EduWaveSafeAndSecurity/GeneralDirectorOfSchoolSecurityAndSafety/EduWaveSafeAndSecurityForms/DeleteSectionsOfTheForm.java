package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class DeleteSectionsOfTheForm {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By SerachButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");


    @Test
    public void deleteSectionsToUnpublishedForm() throws InterruptedException {
        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

       // for (int i = 0; i < 3; i++) {
            WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
            FormMainMenuLoactorWait.click();


            WebElement FormStatusLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator));
            FormStatusLocatorWait.click();

            WebElement FormStatusSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator));
            FormStatusSearchLocatorWait.sendKeys("غير منشور" , Keys.ENTER);

            Thread.sleep(1000);
            WebElement SerachButtonLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator));
            SerachButtonLocatorWait.click();

            By SectionsLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_tdSections");

            WebElement SectionsLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator));
            SectionsLinkLocatorWait.click();

            List SectionTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));

            int TableSize = SectionTableList.size();
            int TableSizeAdd = SectionTableList.size() + 1;
            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);


            System.out.println("TableSize::" + TableSize);
            System.out.println("TableSizeAdd::" + TableSizeAdd);
            System.out.println("TableSizeAddFormat::" + TableSizeAddFormat);

            By DeleteLinkSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSize + "_lbtnDelete");

            WebElement DeleteLinkSplitWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkSplit));
            DeleteLinkSplitWait.click();

            By YesConfrmationLocator = By.id("ctl00_ibtnYes");

            WebElement YesConfrmationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator));
            YesConfrmationLocatorWait.click();

            By DeleteMessageLocator=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

            WebElement DeleteMessageLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessageLocator));

            String ActualResult=browserQA.findElement(DeleteMessageLocator).getText();
            String ExcpectedResult="تم حذف القسم بنجاح.";

            Assert.assertEquals(ActualResult,ExcpectedResult,"لم تتم عملية حذف القسم بنجاح");


       // }


    }
}

