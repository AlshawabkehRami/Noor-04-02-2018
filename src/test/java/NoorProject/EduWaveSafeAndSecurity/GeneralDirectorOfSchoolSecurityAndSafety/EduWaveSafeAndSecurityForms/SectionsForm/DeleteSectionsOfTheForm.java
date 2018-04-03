/*
 * Created By Rami Al Shawabkeh 4/3/18 11:35 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.SectionsForm;

import NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.SectionsForm.AddSectionsOfTheForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class DeleteSectionsOfTheForm {

    @Test
    public void deleteSectionsToUnpublishedForm() throws InterruptedException {


        AddSectionsOfTheForm Add=new AddSectionsOfTheForm();
        Add.goToUser();
        Add.addSectionsToUnpublishedForm();

        By DeleteSectionLocator=By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnDelete");

        WebElement DeleteSectionLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteSectionLocator));
        DeleteSectionLocatorWait.click();

        By YesConfrmationLocator = By.id("ctl00_ibtnYes");

        WebElement YesConfrmationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator));
        YesConfrmationLocatorWait.click();

        By DeleteMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

        WebElement DeleteMessageLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessageLocator));

        String ActualResult = browserQA.findElement(DeleteMessageLocator).getText();
        String ExcpectedResult = "تم حذف القسم بنجاح.";

        Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية حذف القسم بنجاح");


        // }


    }
}

