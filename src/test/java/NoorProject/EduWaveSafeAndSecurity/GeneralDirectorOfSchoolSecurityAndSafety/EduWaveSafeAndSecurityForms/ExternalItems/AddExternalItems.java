/*
 * Created By Rami Al Shawabkeh 4/3/18 11:34 AM
 */

/*
 * Created By Rami Al Shawabkeh 4/3/18 10:23 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.ExternalItems;

import NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.SectionsForm.AddSectionsOfTheForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class AddExternalItems {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");

    @Test

    public void goToTheUser() {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

    }

    @Test

    public void addExternalItems() throws InterruptedException {

        //  for (int i = 0; i < 3; i++) {
        AddSectionsOfTheForm Add = new AddSectionsOfTheForm();
        Add.addSectionsToUnpublishedForm();

        By ExternalLikLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");

        WebElement ExternalLiksLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalLikLocator));
        ExternalLiksLocatorWait.click();

        List TabelSizeList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));

        int TabelSizeInt = TabelSizeList.size();
        int TableSizeAdd = TabelSizeList.size() + 1;
        String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);

        System.out.println("TabelSizeInt::" + TabelSizeInt);
        System.out.println("TableSizeAdd::" + TableSizeAdd);
        System.out.println("TableSizeAddFormat::" + TableSizeAddFormat);


        By EXItemDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");

        Random rand = new Random();
        int randnum = rand.nextInt(1000);

        Thread.sleep(1000);

        WebElement EXItemDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EXItemDescLocator));
        EXItemDescLocatorWait.sendKeys("Rami" + randnum);

        By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");

        WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator));
        AddLinkLocatorWait.click();

        By MessageLoctor=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

        WebElement MessageLoctorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLoctor));

        String ActualResult=browserQA.findElement(MessageLoctor).getText();
        String ExpectedResult="تم إضافة البند الخارجي بنجاح.";

        Assert.assertEquals(ActualResult,ExpectedResult,"تم إضافة البند  الخارجي بنجاح");



        // }
    }
}