/*
 * Created By Rami AlShawabkeh 3/29/18 12:52 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.waitQA;

public class ViewSectionsOfTheForm {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By SearchLoactor = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By BTNSectionsLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnSections");
    private By BTNBack = By.id("ctl00_PlaceHolderMain_ibtnBack");


    @Test
    public void ViewSectionsOfTheForms() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        //  for (int i = 0; i < 10; i++) {
        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();

        Thread.sleep(1000);
        WebElement SearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLoactor));
        SearchLoactorWait.click();

        WebElement BTNSectionsLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSectionsLocator));
        BTNSectionsLocatorWait.click();

        WebElement BTNBackWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack));
        BTNBackWait.click();

        //  }
    }


}
